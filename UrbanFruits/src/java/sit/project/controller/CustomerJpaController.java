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
import sit.project.model.Account;
import sit.project.model.OrderList;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.transaction.UserTransaction;
import sit.project.controller.exceptions.NonexistentEntityException;
import sit.project.controller.exceptions.PreexistingEntityException;
import sit.project.controller.exceptions.RollbackFailureException;
import sit.project.model.Customer;
import sit.project.model.History;

/**
 *
 * @author Chonticha Sae-jiw
 */
public class CustomerJpaController implements Serializable {

    public CustomerJpaController(UserTransaction utx, EntityManagerFactory emf) {
        this.utx = utx;
        this.emf = emf;
    }
    private UserTransaction utx = null;
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Customer customer) throws PreexistingEntityException, RollbackFailureException, Exception {
        if (customer.getOrderListList() == null) {
            customer.setOrderListList(new ArrayList<OrderList>());
        }
        if (customer.getHistoryList() == null) {
            customer.setHistoryList(new ArrayList<History>());
        }
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Account email = customer.getEmail();
            if (email != null) {
                email = em.getReference(email.getClass(), email.getEmail());
                customer.setEmail(email);
            }
            List<OrderList> attachedOrderListList = new ArrayList<OrderList>();
            for (OrderList orderListListOrderListToAttach : customer.getOrderListList()) {
                orderListListOrderListToAttach = em.getReference(orderListListOrderListToAttach.getClass(), orderListListOrderListToAttach.getOrderId());
                attachedOrderListList.add(orderListListOrderListToAttach);
            }
            customer.setOrderListList(attachedOrderListList);
            List<History> attachedHistoryList = new ArrayList<History>();
            for (History historyListHistoryToAttach : customer.getHistoryList()) {
                historyListHistoryToAttach = em.getReference(historyListHistoryToAttach.getClass(), historyListHistoryToAttach.getHistoryId());
                attachedHistoryList.add(historyListHistoryToAttach);
            }
            customer.setHistoryList(attachedHistoryList);
            em.persist(customer);
            if (email != null) {
                email.getCustomerList().add(customer);
                email = em.merge(email);
            }
            for (OrderList orderListListOrderList : customer.getOrderListList()) {
                Customer oldCustIdOfOrderListListOrderList = orderListListOrderList.getCustId();
                orderListListOrderList.setCustId(customer);
                orderListListOrderList = em.merge(orderListListOrderList);
                if (oldCustIdOfOrderListListOrderList != null) {
                    oldCustIdOfOrderListListOrderList.getOrderListList().remove(orderListListOrderList);
                    oldCustIdOfOrderListListOrderList = em.merge(oldCustIdOfOrderListListOrderList);
                }
            }
            for (History historyListHistory : customer.getHistoryList()) {
                Customer oldCustIdOfHistoryListHistory = historyListHistory.getCustId();
                historyListHistory.setCustId(customer);
                historyListHistory = em.merge(historyListHistory);
                if (oldCustIdOfHistoryListHistory != null) {
                    oldCustIdOfHistoryListHistory.getHistoryList().remove(historyListHistory);
                    oldCustIdOfHistoryListHistory = em.merge(oldCustIdOfHistoryListHistory);
                }
            }
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            if (findCustomer(customer.getCustId()) != null) {
                throw new PreexistingEntityException("Customer " + customer + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Customer customer) throws NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Customer persistentCustomer = em.find(Customer.class, customer.getCustId());
            Account emailOld = persistentCustomer.getEmail();
            Account emailNew = customer.getEmail();
            List<OrderList> orderListListOld = persistentCustomer.getOrderListList();
            List<OrderList> orderListListNew = customer.getOrderListList();
            List<History> historyListOld = persistentCustomer.getHistoryList();
            List<History> historyListNew = customer.getHistoryList();
            if (emailNew != null) {
                emailNew = em.getReference(emailNew.getClass(), emailNew.getEmail());
                customer.setEmail(emailNew);
            }
            List<OrderList> attachedOrderListListNew = new ArrayList<OrderList>();
            for (OrderList orderListListNewOrderListToAttach : orderListListNew) {
                orderListListNewOrderListToAttach = em.getReference(orderListListNewOrderListToAttach.getClass(), orderListListNewOrderListToAttach.getOrderId());
                attachedOrderListListNew.add(orderListListNewOrderListToAttach);
            }
            orderListListNew = attachedOrderListListNew;
            customer.setOrderListList(orderListListNew);
            List<History> attachedHistoryListNew = new ArrayList<History>();
            for (History historyListNewHistoryToAttach : historyListNew) {
                historyListNewHistoryToAttach = em.getReference(historyListNewHistoryToAttach.getClass(), historyListNewHistoryToAttach.getHistoryId());
                attachedHistoryListNew.add(historyListNewHistoryToAttach);
            }
            historyListNew = attachedHistoryListNew;
            customer.setHistoryList(historyListNew);
            customer = em.merge(customer);
            if (emailOld != null && !emailOld.equals(emailNew)) {
                emailOld.getCustomerList().remove(customer);
                emailOld = em.merge(emailOld);
            }
            if (emailNew != null && !emailNew.equals(emailOld)) {
                emailNew.getCustomerList().add(customer);
                emailNew = em.merge(emailNew);
            }
            for (OrderList orderListListOldOrderList : orderListListOld) {
                if (!orderListListNew.contains(orderListListOldOrderList)) {
                    orderListListOldOrderList.setCustId(null);
                    orderListListOldOrderList = em.merge(orderListListOldOrderList);
                }
            }
            for (OrderList orderListListNewOrderList : orderListListNew) {
                if (!orderListListOld.contains(orderListListNewOrderList)) {
                    Customer oldCustIdOfOrderListListNewOrderList = orderListListNewOrderList.getCustId();
                    orderListListNewOrderList.setCustId(customer);
                    orderListListNewOrderList = em.merge(orderListListNewOrderList);
                    if (oldCustIdOfOrderListListNewOrderList != null && !oldCustIdOfOrderListListNewOrderList.equals(customer)) {
                        oldCustIdOfOrderListListNewOrderList.getOrderListList().remove(orderListListNewOrderList);
                        oldCustIdOfOrderListListNewOrderList = em.merge(oldCustIdOfOrderListListNewOrderList);
                    }
                }
            }
            for (History historyListOldHistory : historyListOld) {
                if (!historyListNew.contains(historyListOldHistory)) {
                    historyListOldHistory.setCustId(null);
                    historyListOldHistory = em.merge(historyListOldHistory);
                }
            }
            for (History historyListNewHistory : historyListNew) {
                if (!historyListOld.contains(historyListNewHistory)) {
                    Customer oldCustIdOfHistoryListNewHistory = historyListNewHistory.getCustId();
                    historyListNewHistory.setCustId(customer);
                    historyListNewHistory = em.merge(historyListNewHistory);
                    if (oldCustIdOfHistoryListNewHistory != null && !oldCustIdOfHistoryListNewHistory.equals(customer)) {
                        oldCustIdOfHistoryListNewHistory.getHistoryList().remove(historyListNewHistory);
                        oldCustIdOfHistoryListNewHistory = em.merge(oldCustIdOfHistoryListNewHistory);
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
                Integer id = customer.getCustId();
                if (findCustomer(id) == null) {
                    throw new NonexistentEntityException("The customer with id " + id + " no longer exists.");
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
            Customer customer;
            try {
                customer = em.getReference(Customer.class, id);
                customer.getCustId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The customer with id " + id + " no longer exists.", enfe);
            }
            Account email = customer.getEmail();
            if (email != null) {
                email.getCustomerList().remove(customer);
                email = em.merge(email);
            }
            List<OrderList> orderListList = customer.getOrderListList();
            for (OrderList orderListListOrderList : orderListList) {
                orderListListOrderList.setCustId(null);
                orderListListOrderList = em.merge(orderListListOrderList);
            }
            List<History> historyList = customer.getHistoryList();
            for (History historyListHistory : historyList) {
                historyListHistory.setCustId(null);
                historyListHistory = em.merge(historyListHistory);
            }
            em.remove(customer);
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

    public List<Customer> findCustomerEntities() {
        return findCustomerEntities(true, -1, -1);
    }

    public List<Customer> findCustomerEntities(int maxResults, int firstResult) {
        return findCustomerEntities(false, maxResults, firstResult);
    }

    private List<Customer> findCustomerEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Customer.class));
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

    public Customer findCustomer(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Customer.class, id);
        } finally {
            em.close();
        }
    }

    public int getCustomerCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Customer> rt = cq.from(Customer.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
