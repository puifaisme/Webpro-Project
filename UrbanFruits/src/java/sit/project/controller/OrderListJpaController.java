/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.project.controller;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import sit.project.model.Customer;
import sit.project.model.OrderDetail;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.transaction.UserTransaction;
import sit.project.controller.exceptions.NonexistentEntityException;
import sit.project.controller.exceptions.PreexistingEntityException;
import sit.project.controller.exceptions.RollbackFailureException;
import sit.project.model.History;
import sit.project.model.OrderList;

/**
 *
 * @author Chonticha Sae-jiw
 */
public class OrderListJpaController implements Serializable {

    public OrderListJpaController(UserTransaction utx, EntityManagerFactory emf) {
        this.utx = utx;
        this.emf = emf;
    }
    private UserTransaction utx = null;
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(OrderList orderList) throws PreexistingEntityException, RollbackFailureException, Exception {
        if (orderList.getOrderDetailList() == null) {
            orderList.setOrderDetailList(new ArrayList<OrderDetail>());
        }
        if (orderList.getHistoryList() == null) {
            orderList.setHistoryList(new ArrayList<History>());
        }
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Customer custId = orderList.getCustId();
            if (custId != null) {
                custId = em.getReference(custId.getClass(), custId.getCustId());
                orderList.setCustId(custId);
            }
            List<OrderDetail> attachedOrderDetailList = new ArrayList<OrderDetail>();
            for (OrderDetail orderDetailListOrderDetailToAttach : orderList.getOrderDetailList()) {
                orderDetailListOrderDetailToAttach = em.getReference(orderDetailListOrderDetailToAttach.getClass(), orderDetailListOrderDetailToAttach.getOrderDetailno());
                attachedOrderDetailList.add(orderDetailListOrderDetailToAttach);
            }
            orderList.setOrderDetailList(attachedOrderDetailList);
            List<History> attachedHistoryList = new ArrayList<History>();
            for (History historyListHistoryToAttach : orderList.getHistoryList()) {
                historyListHistoryToAttach = em.getReference(historyListHistoryToAttach.getClass(), historyListHistoryToAttach.getHistoryId());
                attachedHistoryList.add(historyListHistoryToAttach);
            }
            orderList.setHistoryList(attachedHistoryList);
            em.persist(orderList);
            if (custId != null) {
                custId.getOrderListList().add(orderList);
                custId = em.merge(custId);
            }
            for (OrderDetail orderDetailListOrderDetail : orderList.getOrderDetailList()) {
                OrderList oldOrderIdOfOrderDetailListOrderDetail = orderDetailListOrderDetail.getOrderId();
                orderDetailListOrderDetail.setOrderId(orderList);
                orderDetailListOrderDetail = em.merge(orderDetailListOrderDetail);
                if (oldOrderIdOfOrderDetailListOrderDetail != null) {
                    oldOrderIdOfOrderDetailListOrderDetail.getOrderDetailList().remove(orderDetailListOrderDetail);
                    oldOrderIdOfOrderDetailListOrderDetail = em.merge(oldOrderIdOfOrderDetailListOrderDetail);
                }
            }
            for (History historyListHistory : orderList.getHistoryList()) {
                OrderList oldOrderIdOfHistoryListHistory = historyListHistory.getOrderId();
                historyListHistory.setOrderId(orderList);
                historyListHistory = em.merge(historyListHistory);
                if (oldOrderIdOfHistoryListHistory != null) {
                    oldOrderIdOfHistoryListHistory.getHistoryList().remove(historyListHistory);
                    oldOrderIdOfHistoryListHistory = em.merge(oldOrderIdOfHistoryListHistory);
                }
            }
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            if (findOrderList(orderList.getOrderId()) != null) {
                throw new PreexistingEntityException("OrderList " + orderList + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(OrderList orderList) throws NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            OrderList persistentOrderList = em.find(OrderList.class, orderList.getOrderId());
            Customer custIdOld = persistentOrderList.getCustId();
            Customer custIdNew = orderList.getCustId();
            List<OrderDetail> orderDetailListOld = persistentOrderList.getOrderDetailList();
            List<OrderDetail> orderDetailListNew = orderList.getOrderDetailList();
            List<History> historyListOld = persistentOrderList.getHistoryList();
            List<History> historyListNew = orderList.getHistoryList();
            if (custIdNew != null) {
                custIdNew = em.getReference(custIdNew.getClass(), custIdNew.getCustId());
                orderList.setCustId(custIdNew);
            }
            List<OrderDetail> attachedOrderDetailListNew = new ArrayList<OrderDetail>();
            for (OrderDetail orderDetailListNewOrderDetailToAttach : orderDetailListNew) {
                orderDetailListNewOrderDetailToAttach = em.getReference(orderDetailListNewOrderDetailToAttach.getClass(), orderDetailListNewOrderDetailToAttach.getOrderDetailno());
                attachedOrderDetailListNew.add(orderDetailListNewOrderDetailToAttach);
            }
            orderDetailListNew = attachedOrderDetailListNew;
            orderList.setOrderDetailList(orderDetailListNew);
            List<History> attachedHistoryListNew = new ArrayList<History>();
            for (History historyListNewHistoryToAttach : historyListNew) {
                historyListNewHistoryToAttach = em.getReference(historyListNewHistoryToAttach.getClass(), historyListNewHistoryToAttach.getHistoryId());
                attachedHistoryListNew.add(historyListNewHistoryToAttach);
            }
            historyListNew = attachedHistoryListNew;
            orderList.setHistoryList(historyListNew);
            orderList = em.merge(orderList);
            if (custIdOld != null && !custIdOld.equals(custIdNew)) {
                custIdOld.getOrderListList().remove(orderList);
                custIdOld = em.merge(custIdOld);
            }
            if (custIdNew != null && !custIdNew.equals(custIdOld)) {
                custIdNew.getOrderListList().add(orderList);
                custIdNew = em.merge(custIdNew);
            }
            for (OrderDetail orderDetailListOldOrderDetail : orderDetailListOld) {
                if (!orderDetailListNew.contains(orderDetailListOldOrderDetail)) {
                    orderDetailListOldOrderDetail.setOrderId(null);
                    orderDetailListOldOrderDetail = em.merge(orderDetailListOldOrderDetail);
                }
            }
            for (OrderDetail orderDetailListNewOrderDetail : orderDetailListNew) {
                if (!orderDetailListOld.contains(orderDetailListNewOrderDetail)) {
                    OrderList oldOrderIdOfOrderDetailListNewOrderDetail = orderDetailListNewOrderDetail.getOrderId();
                    orderDetailListNewOrderDetail.setOrderId(orderList);
                    orderDetailListNewOrderDetail = em.merge(orderDetailListNewOrderDetail);
                    if (oldOrderIdOfOrderDetailListNewOrderDetail != null && !oldOrderIdOfOrderDetailListNewOrderDetail.equals(orderList)) {
                        oldOrderIdOfOrderDetailListNewOrderDetail.getOrderDetailList().remove(orderDetailListNewOrderDetail);
                        oldOrderIdOfOrderDetailListNewOrderDetail = em.merge(oldOrderIdOfOrderDetailListNewOrderDetail);
                    }
                }
            }
            for (History historyListOldHistory : historyListOld) {
                if (!historyListNew.contains(historyListOldHistory)) {
                    historyListOldHistory.setOrderId(null);
                    historyListOldHistory = em.merge(historyListOldHistory);
                }
            }
            for (History historyListNewHistory : historyListNew) {
                if (!historyListOld.contains(historyListNewHistory)) {
                    OrderList oldOrderIdOfHistoryListNewHistory = historyListNewHistory.getOrderId();
                    historyListNewHistory.setOrderId(orderList);
                    historyListNewHistory = em.merge(historyListNewHistory);
                    if (oldOrderIdOfHistoryListNewHistory != null && !oldOrderIdOfHistoryListNewHistory.equals(orderList)) {
                        oldOrderIdOfHistoryListNewHistory.getHistoryList().remove(historyListNewHistory);
                        oldOrderIdOfHistoryListNewHistory = em.merge(oldOrderIdOfHistoryListNewHistory);
                    }
                }
            }
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = orderList.getOrderId();
                if (findOrderList(id) == null) {
                    throw new NonexistentEntityException("The orderList with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            OrderList orderList;
            try {
                orderList = em.getReference(OrderList.class, id);
                orderList.getOrderId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The orderList with id " + id + " no longer exists.", enfe);
            }
            Customer custId = orderList.getCustId();
            if (custId != null) {
                custId.getOrderListList().remove(orderList);
                custId = em.merge(custId);
            }
            List<OrderDetail> orderDetailList = orderList.getOrderDetailList();
            for (OrderDetail orderDetailListOrderDetail : orderDetailList) {
                orderDetailListOrderDetail.setOrderId(null);
                orderDetailListOrderDetail = em.merge(orderDetailListOrderDetail);
            }
            List<History> historyList = orderList.getHistoryList();
            for (History historyListHistory : historyList) {
                historyListHistory.setOrderId(null);
                historyListHistory = em.merge(historyListHistory);
            }
            em.remove(orderList);
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<OrderList> findOrderListEntities() {
        return findOrderListEntities(true, -1, -1);
    }

    public List<OrderList> findOrderListEntities(int maxResults, int firstResult) {
        return findOrderListEntities(false, maxResults, firstResult);
    }

    private List<OrderList> findOrderListEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(OrderList.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public OrderList findOrderList(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(OrderList.class, id);
        } finally {
            em.close();
        }
    }

    public int getOrderListCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<OrderList> rt = cq.from(OrderList.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
