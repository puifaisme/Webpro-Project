/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.project.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.transaction.UserTransaction;
import sit.jpa.project.controller.CustomerJpaController;
import sit.jpa.project.controller.HistoryJpaController;
import sit.jpa.project.controller.OrderDetailJpaController;
import sit.jpa.project.controller.OrderListJpaController;
import sit.jpa.project.controller.exceptions.RollbackFailureException;
import sit.jpa.project.model.Customer;
import sit.jpa.project.model.History;
import sit.jpa.project.model.OrderDetail;
import sit.jpa.project.model.OrderList;

/**
 *
 * @author Bud
 */
public class PaymentServlet extends HttpServlet {
    @PersistenceUnit(unitName = "UrbanFruitsPU")
    EntityManagerFactory emf;
    @Resource
    UserTransaction utx;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        if(session.getAttribute("session")!=null){
            getServletContext().getRequestDispatcher("/index.html").forward(request, response);
            Customer cust = (Customer)request.getAttribute("session");
            CustomerJpaController custJPA = new CustomerJpaController(utx, emf);
            Customer search = custJPA.findCustomer(cust.getCustId());
            
            OrderListJpaController orderJPA = new OrderListJpaController(utx, emf);
            OrderList or = orderJPA.findOrderList(cust.getCustId());
            
            OrderDetailJpaController deJPA = new OrderDetailJpaController(utx, emf);
            OrderDetail de = deJPA.findOrderDetail(or.getOrderId());
            
            
            
            HistoryJpaController hisJPA = new HistoryJpaController(utx, emf);
            History his = new History(hisJPA.getHistoryCount()+1);
            
            
            try {
                his.setCustId(search);
                his.setOrderId(de.getOrderId());
                his.setTotalPrice(de.getTotalPrice());
                his.setTimeStamp(or.getTimeStamp());
                hisJPA.create(his);
            } catch (RollbackFailureException ex) {
                Logger.getLogger(PaymentServlet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(PaymentServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
            
        }else{
            response.sendRedirect("LoginView.jsp");
            return;
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
