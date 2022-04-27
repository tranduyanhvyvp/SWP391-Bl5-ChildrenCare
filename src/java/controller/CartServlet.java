/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Cart;
import model.Services;


/**
 *
 * @author DELL
 */
public class CartServlet extends HttpServlet {

    private ArrayList<Cart> cart = new ArrayList<Cart>();

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
            out.println("<title>Servlet GioHangServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet GioHangServlet at " + request.getContextPath() + "</h1>");
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
        doPost(request, response);
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
        String command = request.getParameter("command");
        String id = request.getParameter("id");
        if (command.equals("addCart")) {
            Services service = new Services(Integer.parseInt(id));
            addToCart(service);
            HttpSession session = request.getSession();
            session.setAttribute("cart", cart);
            request.getRequestDispatcher("/cart.jsp").forward(request, response);
        } else {
            if (command.equals("deleteCart")) {
                Services service = new Services(Integer.parseInt(id));
                deleteFromCart(service);
                HttpSession session = request.getSession();

                session.setAttribute("cart", cart);
                request.getRequestDispatcher("/cart.jsp").forward(request, response);
            } else {
                if (command.equals("removeCart")) {
                    Services service = new Services(Integer.parseInt(id));
                    removeFromCart(service);
                    HttpSession session = request.getSession();

                    session.setAttribute("cart", cart);
                    request.getRequestDispatcher("/cart.jsp").forward(request, response);
                } else {
                    if (command.equals("setCart")) {
                        Services service = new Services(Integer.parseInt(id));
                        setCart(service,Integer.parseInt((String) request.getParameter("soluong")));
                        HttpSession session = request.getSession();

                        session.setAttribute("cart", cart);
                        request.getRequestDispatcher("/cart.jsp").forward(request, response);
                    }
                }
            }
        }
    }

    private void removeFromCart(Services service) {
        for (Cart item : cart) {
            if (item.getService().getId() == service.getId()) {
                cart.remove(item);
                return;
            }
        }
        
    }

    private void setCart(Services service, int quantity) {
        for (Cart item : cart) {
            if (item.getService().getId()== service.getId()) {
                item.setQuantity(item.getQuantity()+quantity);
                return;
            }
        }
        Cart c = new Cart();
        c.setService(service);
        c.setQuantity(quantity);
        cart.add(c);
        
    }

    public void addToCart(Services service) {
        for (Cart item : cart) {
            if (item.getService().getId() == service.getId()) {
                item.setQuantity(item.getQuantity() + 1);
              
            }
        }

        
    }

    public void deleteFromCart(Services service) {
        for (Cart item : cart) {
            if (item.getService().getId() == service.getId() && item.getQuantity() > 1) {
                item.setQuantity(item.getQuantity() - 1);
             
            }
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
