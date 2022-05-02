/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.FeedbackDAO;
import dao.ReservationDAO;
import entity.Reservation;
import entity.Status;
import entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author aDMIN
 */
@WebServlet(name = "ReservationList", urlPatterns = {"/reservationlist"})
public class ReservationList extends HttpServlet {

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
            out.println("<title>Servlet ReservationList</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ReservationList at " + request.getContextPath() + "</h1>");
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
        ReservationDAO dao = new ReservationDAO();
        FeedbackDAO FeedbackDao = new FeedbackDAO();
        List<Reservation> listReservation = dao.getListReservation();
        List<Status> listStatus = FeedbackDao.getAllStatus();
        List<User> listStaff = dao.getAllStaff();

        request.setAttribute("listReservation", listReservation);
        request.setAttribute("listStaff", listStaff);
        request.setAttribute("listStatus", listStatus);
        request.getRequestDispatcher("reservation_list.jsp").forward(request, response);
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

        String func = request.getParameter("func");
        if ("filter".equals(func)) {
            String status = request.getParameter("status");
            String date = request.getParameter("date");
            String staff = request.getParameter("staff");
            if (status == null) {
                status = "st.id";
            }
            if (date.equals("")) {
                date = "r.[date]";
            } else {
                date = "'" + date + "'";
            }
            if (staff == null) {
                staff = "r.staff_id";
            }

            ReservationDAO dao = new ReservationDAO();
            FeedbackDAO FeedbackDao = new FeedbackDAO();
            List<Status> listStatus = FeedbackDao.getAllStatus();
            List<User> listStaff = dao.getAllStaff();

            List<Reservation> listReservation = dao.getListFilter(status, date, staff);
            request.setAttribute("listReservation", listReservation);
            request.setAttribute("listStaff", listStaff);
            request.setAttribute("listStatus", listStatus);
            request.setAttribute("status", status);
            date = request.getParameter("date");
            request.setAttribute("date", date);

            request.setAttribute("staff", staff);

            request.getRequestDispatcher("reservation_list.jsp").forward(request, response);
        }else{
            String search = request.getParameter("search");
            ReservationDAO dao = new ReservationDAO();
            List<Reservation> listReservation = dao.searchReservationByName(search);
            request.setAttribute("listReservation", listReservation);
            request.setAttribute("search", search);
            request.getRequestDispatcher("reservation_list.jsp").forward(request, response);
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
