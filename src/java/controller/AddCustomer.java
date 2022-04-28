/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.CustomerDAO;
import JavaFunc.RandomString;
import JavaFunc.SendEmail;
import dao.FeedbackDAO;
import entity.Account;
import entity.Customer;
import entity.Feedback;
import entity.Status;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ADMIN
 */
public class AddCustomer extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            HttpSession session = request.getSession();
            Account acc1 = (Account) session.getAttribute("account");

            if (acc1.getRole_id() != 1) {
                response.sendRedirect("home.jsp");
            } else {
                request.getRequestDispatcher("addCustomer.jsp").forward(request, response);
            }

        } catch (Exception e) {
            e.printStackTrace();
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
        String fullname = request.getParameter("fullname");
        String email = request.getParameter("email");
        String phonenumber = request.getParameter("phonenumber");
        String address = request.getParameter("address");
        String dob = request.getParameter("dob");
        String gender = request.getParameter("gender");
        String username = request.getParameter("username");

        CustomerDAO dao = new CustomerDAO();
        RandomString ran = new RandomString();
        SendEmail mail = new SendEmail();
        Customer check = dao.checkUsernameExist(username);
        if (check == null) {
            try {
                String password = ran.GennPass();
                System.out.println("asdas");
                dao.insertUser(fullname, gender, address, email, dob, phonenumber, username, password, "4", "???");
                mail.sendText(email, password);
                ArrayList<Customer> ListUser = dao.getAllCustomer();
                System.out.println(ListUser);
                request.setAttribute("ListUser", ListUser);
                request.getRequestDispatcher("manageCustomer.jsp").forward(request, response);
            } catch (IOException | MessagingException e) {
                e.printStackTrace();
            }
        } else {
            response.sendRedirect("blog.jsp");
        }
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
