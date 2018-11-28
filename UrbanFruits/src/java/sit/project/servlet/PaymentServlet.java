/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.project.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
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

import sit.jpa.project.controller.ProductJpaController;
import sit.jpa.project.controller.exceptions.RollbackFailureException;
import sit.jpa.project.model.Customer;
import sit.jpa.project.model.History;
import sit.jpa.project.model.Product;
import sit.project.model.LineItem;

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
        String idCard = request.getParameter("idCard");
        String[] productNo = request.getParameterValues("productNo");

        if (idCard != null) {

            Customer cust = (Customer) request.getAttribute("session");
            if (cust != null) {
                CustomerJpaController custJPA = new CustomerJpaController(utx, emf);
                Customer search = custJPA.findCustomer(cust.getCustId());
                
            }

            if (productNo != null) {
                for (int i = 0; i < productNo.length; i++) {
                    ProductJpaController prodJPA = new ProductJpaController(utx, emf);
                    Product prod = prodJPA.findProduct(productNo[i]);
                    HistoryJpaController hisJPA = new HistoryJpaController(utx, emf);
                    LineItem item = new LineItem(prod);
                    History his = new History(1);
                    his.setCustId(cust);
                    his.setPrice(prod.getPrice());
                    his.setQuantity(item.getQuantity());
                    his.setTimeStamp(new Date());
                    his.setTotalPrice(item.TotalPrice());
                    his.setProductId(prod);
                    his.setHistoryId(i);
                    try {
                        hisJPA.create(his);
                        System.out.println("111111111111");
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }

                }

            }

            //After Payment
            response.sendRedirect("/UrbanFruits");
            return;

        }
        getServletContext().getRequestDispatcher("/PaymentView.jsp").forward(request, response);
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
