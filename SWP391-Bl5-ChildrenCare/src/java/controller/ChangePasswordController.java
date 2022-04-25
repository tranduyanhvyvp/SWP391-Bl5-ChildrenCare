/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AccountDAO;
import entity.Account;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author stter
 */
@WebServlet(name = "ChangePasswordController", urlPatterns = {"/ChangePasswordController"})
public class ChangePasswordController extends HttpServlet {

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
//        try {
//            String username = request.getParameter("username");
//            String password = request.getParameter("password");
//
//            AccountDAO loginDAO = new AccountDAO();
//            Account a = loginDAO.login(username, password);
//            if (a == null) {
//                request.setAttribute("mess", "Wrong Username or Password");
//                request.getRequestDispatcher("login.jsp").forward(request, response);
//            } else {
//                HttpSession session = request.getSession();
//                session.setAttribute("username", username);
//                session.setMaxInactiveInterval(86400);
//
//                request.getRequestDispatcher("home_user_login.jsp").forward(request, response);
//            }
//        } catch (Exception e) {
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
        request.getRequestDispatcher("chang_password.jsp").forward(request, response);
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
//        processRequest(request, response);
        try {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String newPassword = request.getParameter("newPassword");
            String confirmNewPassword = request.getParameter("confirmNewPassword");

            AccountDAO loginDAO = new AccountDAO();
            Account a = loginDAO.login(username, password);
            if (a == null) {
                request.setAttribute("mess", "Wrong Password");
                request.getRequestDispatcher("use_change_password.jsp").forward(request, response);
            } else {
                // tiep tuc update va tra ve update thanh cong
                
                if (!newPassword.equals(confirmNewPassword)) {
                    request.setAttribute("mess", "Wrong Confirm Password");
                    request.getRequestDispatcher("use_change_password.jsp").forward(request, response);
                } else {
                    AccountDAO changePasswordDAO = new AccountDAO();
                    changePasswordDAO.updatePassword(username, newPassword);
                    request.setAttribute("mess", "Succesful");
                    request.getRequestDispatcher("use_change_password.jsp").forward(request, response);
                }

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
