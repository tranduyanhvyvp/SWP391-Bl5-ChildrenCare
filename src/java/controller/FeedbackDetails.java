/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AdminDAO;
import dao.FeedbackDAO;
import entity.Account;
import entity.feedback;
import entity.feedbackImage;
import entity.status;
import entity.user;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author aDMIN
 */
@WebServlet(name = "feedbackDetails", urlPatterns = {"/feedbackdetails"})
public class FeedbackDetails extends HttpServlet {

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
            out.println("<title>Servlet feedbackDetails</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet feedbackDetails at " + request.getContextPath() + "</h1>");
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

        HttpSession session = request.getSession();
        Account acc1 = (Account) session.getAttribute("account");

        if (acc1.getRole_id() != 2) {
            response.sendRedirect("home.jsp");
        } else {
            String fid = request.getParameter("fid");
            FeedbackDAO dao = new FeedbackDAO();
            AdminDAO dao1 = new AdminDAO();
            feedback feedback1 = dao.searchFeedBackById(fid);
            String uid = Integer.toString(feedback1.getUserId());
            user user1 = dao1.searchUser(uid);

            List<status> listStatus = dao.getAllStatus();
            List<feedbackImage> listImage = dao.feedbackImage(fid);
            feedbackImage firstindex = listImage.get(0);

            request.setAttribute("firstindex", firstindex);
            request.setAttribute("listImage", listImage);
            request.setAttribute("listStatus", listStatus);
            request.setAttribute("feedback", feedback1);
            request.setAttribute("user1", user1);
            request.getRequestDispatcher("feedback_details.jsp").forward(request, response);
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
