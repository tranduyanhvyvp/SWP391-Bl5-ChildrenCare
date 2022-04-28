/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import JavaFunc.RandomString;
import JavaFunc.SendEmail;
import dao.AccountDAO;
import entity.Account;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author stter
 */
@WebServlet(name = "ResetPasswordController", urlPatterns = {"/ResetPasswordController"})
public class ResetPasswordController extends HttpServlet {

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
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet ResetPasswordController</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet ResetPasswordController at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
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
        request.getRequestDispatcher("user_reset_password.jsp").forward(request, response);
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
        
        try {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String newPassword = request.getParameter("newPassword");

            AccountDAO loginDAO = new AccountDAO();
            RandomString ran = new RandomString();
            SendEmail mail = new SendEmail();
            
            Account a = loginDAO.login(username, password);

            // tiep tuc update va tra ve update thanh cong
            if (!password.equals(newPassword)) {
                request.setAttribute("mess", "Wrong Confirm Password");
                request.getRequestDispatcher("user_reset_password.jsp").forward(request, response);
            } else {
                AccountDAO changePasswordDAO = new AccountDAO();
                changePasswordDAO.updatePassword(username, newPassword);
                request.getRequestDispatcher("login.jsp").forward(request, response);
                
                
//                request.getRequestDispatcher("ResetPasswordController?email="${email}).forward(request, response);
            }

        } catch (Exception e) {
            System.out.println("Loi roi");
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
