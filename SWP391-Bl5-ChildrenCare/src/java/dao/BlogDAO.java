/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Blog;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author phuch
 */
public class BlogDAO extends DBContext {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public ArrayList<Blog> get2LatestBlog() {
        ArrayList<Blog> list = new ArrayList<>();
        try {
            String sql = "select * \n"
                    + "from Blog\n"
                    + "order by post_date DESC\n"
                    + "OFFSET 0 ROWS  FETCH NEXT 5 ROWS ONLY";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Blog blog = new Blog();
                blog.setId(rs.getInt("id"));
                blog.setTitle(rs.getString("title"));
                blog.setContent(rs.getString("content"));
                list.add(blog);
            }
        } catch (Exception e) {
        }
        return list;
    }
}
