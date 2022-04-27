/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import context.DBContext;
import entity.Blog;
import java.awt.List;
import java.sql.Connection;
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
    public ArrayList<Blog> getHomeLatestBlog() {
        ArrayList<Blog> list = new ArrayList<>();
        try {
            String sql = "select * from Blog order by post_date DESC";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Blog blog = new Blog();
                blog.setId(rs.getInt("id"));
                blog.setTitle(rs.getString("title"));
                blog.setPost_date(rs.getDate("post_date"));
                blog.setAccount_id(rs.getInt("account_id"));
                blog.setCategory_id(rs.getInt("category_id"));
                blog.setContent(rs.getString("content"));
                list.add(blog);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;

    }
    
}
