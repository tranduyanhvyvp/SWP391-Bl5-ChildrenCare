/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
import javax.servlet.http.HttpSession;

/**
 *
 * @author stter
 */
@WebServlet(name = "InputEmailController", urlPatterns = {"/InputEmailController"})
public class InputEmailController extends HttpServlet {

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
//            out.println("<title>Servlet InputEmailController</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet InputEmailController at " + request.getContextPath() + "</h1>");
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
        
        request.getRequestDispatcher("user_email_input.jsp").forward(request, response);
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
            String email = request.getParameter("email");

            AccountDAO checkEmailDAO = new AccountDAO();
            Account a = checkEmailDAO.checkEmail(email);

            SendEmail mail = new SendEmail();

            // tiep tuc update va tra ve update thanh cong
            if (a == null) {
                request.setAttribute("mess", "Email Incorrect");
                request.getRequestDispatcher("user_email_input.jsp").forward(request, response);
            } else {
                try {
                    HttpSession session = request.getSession();
                    session.setAttribute("acc", a);
                    session.setMaxInactiveInterval(3600);
                    
                    request.getRequestDispatcher("user_email_confirm.jsp").forward(request, response);
                    String link = "http://localhost:8080/SWP_Bl5_ChildrenCare_Demo/user_reset_password.jsp";
                    mail.sendText(email, link);
                                       
                    
                } catch (Exception e) {
                    request.getRequestDispatcher("user_input_email.jsp").forward(request, response);
                }

//                request.getRequestDispatcher("user_reset_password.jsp").forward(request, response);
//                request.setAttribute("mess", "Exact email");
//                request.getRequestDispatcher("user_input_email.jsp").forward(request, response);
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
