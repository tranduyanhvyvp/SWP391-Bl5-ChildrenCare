/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.blog;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class blogDAO {
        Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public ArrayList<blog> getAllBlog() throws Exception{
        DBContext db = new DBContext();
        String sql = "select * from Blogs";
        ArrayList<blog> listBlog = new ArrayList<>();
        try{
            conn = db.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String title = rs.getString(2);
                String content = rs.getString(3);
                Date postDate = rs.getDate(4);
                String status = rs.getString(5);
                int cusID = rs.getInt(6);
                int staffID = rs.getInt(7);
                blog blog = new blog(id, title, content, postDate, status, cusID, staffID);
                listBlog.add(blog);
                
            }
            return listBlog;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public blog getBlogByID(int id) throws Exception{
        DBContext db = new DBContext();
        String sql ="select * from Blogs where blog_id = ?";
        try{
            conn = db.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                int Blogid = rs.getInt(1);
                String title = rs.getString(2);
                String content = rs.getString(3);
                Date postDate = rs.getDate(4);
                String status = rs.getString(5);
                int cusID = rs.getInt(6);
                int staffID = rs.getInt(7);
                blog blog = new blog(Blogid, title, content, postDate, status, cusID, staffID);
                return blog;
                
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

}            
