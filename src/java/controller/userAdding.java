/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import JavaFunc.randomString;
import JavaFunc.sendEmail;
import dao.Admin_DAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import entity.role;
import entity.user;

/**
 *
 * @author aDMIN
 */
@WebServlet(name = "userAdding", urlPatterns = {"/useradding"})
public class userAdding extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet userAdding</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet userAdding at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        Admin_DAO dao = new Admin_DAO();
        List<role> listRole = dao.ListRole();
        
        request.setAttribute("listRole", listRole);
        request.getRequestDispatcher("user_adding.jsp").forward(request, response);
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
        String fullname= request.getParameter("fullname");
        String email= request.getParameter("email");
        String phonenumber= request.getParameter("phonenumber");
        String role= request.getParameter("role");
        String address= request.getParameter("address");
        String dob= request.getParameter("dob");
        String gender= request.getParameter("gender");
        String username= request.getParameter("username");
        
        Admin_DAO dao = new Admin_DAO();
        randomString ran = new randomString();
        sendEmail mail = new sendEmail();
        user check = dao.checkUsernameExist(username);
        if(check==null){
            try {
                String password = ran.GennPass();
                dao.insertUser(fullname, gender, address, email, dob, phonenumber, username, password, role);
                mail.sendText(email, password);
                response.sendRedirect("userlist");
            } catch (MessagingException ex) {
                Logger.getLogger(userAdding.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            response.sendRedirect("useradding");
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
