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

/**
 *
 * @author stter
 */
@WebServlet(name = "RegisterController", urlPatterns = {"/RegisterController"})
public class RegisterController extends HttpServlet {

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
            
//            if (roleId == 1) {
//                
//            }
            
            String user = request.getParameter("username");
            String pass = request.getParameter("password");
            String rePass = request.getParameter("rePassword");
            String fullName = request.getParameter("fullName");
            int gender = Integer.parseInt(request.getParameter("gender"));
            
            String email = request.getParameter("email");
            int phoneNumber = Integer.parseInt(request.getParameter("phoneNumber"));
            String address = request.getParameter("address");            
            if(!pass.equals(rePass)){
                request.setAttribute("mess", "Wrong Password");
                    request.getRequestDispatcher("register.jsp").forward(request, response);
            } else {
                AccountDAO loginDAO = new AccountDAO();
                Account a = loginDAO.checkAccountExit(user);
                if(a == null){
                    loginDAO.register(user, pass, fullName, gender, email, phoneNumber, address);
                    response.sendRedirect("login.jsp");
                } else{
                    request.setAttribute("mess", "Duplicae Username");
                    request.getRequestDispatcher("register.jsp").forward(request, response);
                    
                }
            }
            
        } catch (Exception e) {
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
        response.sendRedirect("register.jsp");
//        processRequest(request, response);
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
