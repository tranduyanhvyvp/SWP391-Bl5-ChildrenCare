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
import javax.servlet.http.Part;

/**
 *
 * @author stter
 */
@WebServlet(name = "UserProfileController", urlPatterns = {"/UserProfileController"})
public class UserProfileController extends HttpServlet {

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

        try {
            HttpSession session = request.getSession();
//            String userName = session.getAttribute("username").toString();

            Account acc1 = (Account) session.getAttribute("account");

            String username = acc1.getUsername();

            AccountDAO dao = new AccountDAO();
            Account acc = dao.checkAccountExit(username);

            request.setAttribute("acc", acc);
            request.getRequestDispatcher("user_profile.jsp").forward(request, response);
        } catch (Exception e) {
        }

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
//        request.getRequestDispatcher("login.jsp").forward(request, response);

        try {
            String user = request.getParameter("username");
            String dob = request.getParameter("dob");
            String fullName = request.getParameter("fullName");
            int phoneNumber = Integer.parseInt(request.getParameter("phoneNumber"));
            int gender = Integer.parseInt(request.getParameter("gender"));
            String address = request.getParameter("address");
            String avatar = request.getParameter("avatar");
//            Part part = request.getPart("avatar");

            AccountDAO updateProfile = new AccountDAO();
            if (avatar != null && !avatar.isEmpty()) {
                updateProfile.updateAvatar(user, avatar);
            }
            updateProfile.updateProfile(user, fullName, gender, address, dob, phoneNumber);

            response.sendRedirect("UserProfileController");
//            request.getRequestDispatcher("UserProfileController").forward(request, response);

        } catch (Exception e) {
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
