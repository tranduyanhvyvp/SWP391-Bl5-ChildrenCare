/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.PostDAO;
import entity.Category;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import entity.Post;
import entity.status;

/**
 *
 * @author phuch
 */
@WebServlet(name = "PostListController", urlPatterns = {"/PostListController"})
public class PostListController extends HttpServlet {

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
            out.println("<title>Servlet PostListController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PostListController at " + request.getContextPath() + "</h1>");
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
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        try {
            PostDAO postDAO = new PostDAO();
            String indexPage = request.getParameter("index");
            String search = request.getParameter("search");
            String categoryId = request.getParameter("categoryId");
            String statusId = request.getParameter("statusId");
            String sort = request.getParameter("sort");
            String by = request.getParameter("by");
            if (indexPage == null) {
                indexPage = "1";
            }
            int index = Integer.parseInt(indexPage);
            int count = 0;
            
           if(search != null){
               count = postDAO.countSearchPost(search);
           } else if(categoryId != null){
               count = postDAO.countPostbyCategory(categoryId);
           } else if(statusId != null){
               count = postDAO.countPostbyStatus(statusId);
           }else{
               count = postDAO.countPost();
           }

            int numberPost = 4;
            int endPage = count / numberPost;
            if (count % numberPost != 0) {
                endPage++;
            }
            if (sort != null) {
                ArrayList<Post> posts = postDAO.getSort(index, sort);
                request.setAttribute("posts", posts);
            }
            if (search != null) {
                if (!search.equals("")) {
                    ArrayList<Post> posts = postDAO.searchPostbyTitle(search, index);
                    request.setAttribute("posts", posts);
                    request.setAttribute("search", search);
                } else {
                    ArrayList<Post> posts = postDAO.getSort(index, "title");
                    request.setAttribute("posts", posts);
                }
            } else if (categoryId != null) {
                ArrayList<Post> posts = postDAO.getPostByCategory(index, categoryId);
                request.setAttribute("posts", posts);
            } else if (statusId != null) {
                ArrayList<Post> posts = postDAO.getPostByStatus(index, statusId);
                request.setAttribute("posts", posts);
            }else if (sort != null) {
                ArrayList<Post> posts = postDAO.getSort(index, sort);
                request.setAttribute("posts", posts);
            } else {
                ArrayList<Post> posts = postDAO.get4Post1Page(index);
                request.setAttribute("posts", posts);
            }
            ArrayList<status> status = postDAO.getStatus();
            request.setAttribute("status", status);
            ArrayList<Category> category = postDAO.getCateName();
            request.setAttribute("category", category);
            request.setAttribute("count", count);
            request.setAttribute("endPage", endPage);
            request.setAttribute("index", index);
            request.getRequestDispatcher("post.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
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
