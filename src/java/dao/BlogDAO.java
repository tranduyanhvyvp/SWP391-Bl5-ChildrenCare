/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Blog;
import java.awt.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author phuch
 */


public class BlogDAO extends DBContext{
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public ArrayList<Blog> getLatestBlog() {
        ArrayList<Blog> list = new ArrayList<>();
        try {
            String sql = "select * from Blog order by post_date ASC";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Blog(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(7),
                        rs.getDate(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;

    }
     public ArrayList<Blog> getAllBlog() throws Exception{
        DBContext db = new DBContext();
        String sql = "select * from Blog";
        ArrayList<Blog> list = new ArrayList<>();
        try{
            conn = db.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
               {
                list.add(new Blog(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(7),
                        rs.getDate(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6)));
            }
                
            }
            return list;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public Blog getBlogByID(int id) throws Exception{
        DBContext db = new DBContext();
        String sql ="select * from Blog where id = ?";
        try{
            conn = db.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                int Blogid = rs.getInt(1);
                String title = rs.getString(2);
                String content = rs.getString(7);
                Date postDate = rs.getDate(3);
                String status = rs.getString(4);
                int accID = rs.getInt(5);
                int category_ID = rs.getInt(6);
                Blog blog = new Blog(Blogid, title, content, postDate, status, accID, category_ID);
                return blog;
                
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
}
