/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Category;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import entity.Post;
import entity.Status;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phuch
 */
public class PostDAO extends DBContext {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public Post getPostById(int id) throws Exception {
        try {
            String sql = "select Post.id, Post.title, Post.content, Post.post_date, Accounts.fullname as author, Post.thumbnail, Post.category_id,Post.status_id\n"
                    + "from Post \n"
                    + "inner join Manager\n"
                    + "on Post.manager_id = Manager.id\n"
                    + "inner join Accounts\n"
                    + "on Manager.account_id = Accounts.account_id\n"
                    + "where Post.id = " + id + "";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Post post = new Post();
                post.setId(rs.getInt("id"));
                post.setTitle(rs.getString("title"));
                post.setContent(rs.getString("content"));
                post.setBrief(rs.getString("content").substring(0, 300));
                post.setPost_date(rs.getDate("post_date"));
                post.setAuthor(rs.getString("author"));
                post.setThumbnail(rs.getString("thumbnail"));
                post.setCategoty_id(rs.getInt("category_id"));
                post.setStatus_id(rs.getInt("status_id"));
                return post;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (rs != null) {
                rs.close();
            }
        }

        return null;
    }

    public ArrayList<Post> get4Post1Page(int index) throws Exception {
        ArrayList<Post> list = new ArrayList<>();
        try {
            String sql = "select Post.id, Post.title, Post.content, Post.post_date, Accounts.fullname as author, Post.thumbnail, Post.category_id,Post.status_id\n"
                    + "from Post \n"
                    + "inner join Manager \n"
                    + "on Post.manager_id = Manager.id\n"
                    + "inner join Accounts\n"
                    + "on Manager.account_id = Accounts.account_id\n"
                    + "order by post_date DESC\n"
                    + "OFFSET ? ROWS  FETCH NEXT 4 ROWS ONLY";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, (index * 4 - 4));
            rs = ps.executeQuery();
            while (rs.next()) {
                Post post = new Post();
                post.setId(rs.getInt("id"));
                post.setTitle(rs.getString("title"));
                post.setContent(rs.getString("content"));
                post.setBrief(rs.getString("content").substring(0, 300));
                post.setPost_date(rs.getDate("post_date"));
                post.setAuthor(rs.getString("author"));
                post.setThumbnail(rs.getString("thumbnail"));
                post.setCategoty_id(rs.getInt("category_id"));
                post.setStatus_id(rs.getInt("status_id"));
                list.add(post);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (rs != null) {
                rs.close();
            }
        }
        return list;
    }

    public ArrayList<Post> get3LatestPost() throws Exception {
        ArrayList<Post> list = new ArrayList<>();
        try {
            String sql = "select Post.id, Post.title, Post.content, Post.post_date, Accounts.fullname as author, Post.thumbnail, Post.category_id,Post.status_id\n"
                    + "from Post \n"
                    + "inner join Manager\n"
                    + "on Post.manager_id = Manager.id\n"
                    + "inner join Accounts\n"
                    + "on Manager.account_id = Accounts.account_id\n"
                    + "order by post_date DESC\n"
                    + "OFFSET 0 ROWS  FETCH NEXT 3 ROWS ONLY";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Post post = new Post();
                post.setId(rs.getInt("id"));
                post.setTitle(rs.getString("title").substring(0, 30));
                post.setContent(rs.getString("content"));
                post.setBrief(rs.getString("content").substring(0, 300));
                post.setPost_date(rs.getDate("post_date"));
                post.setAuthor(rs.getString("author"));
                post.setThumbnail(rs.getString("thumbnail"));
                post.setCategoty_id(rs.getInt("category_id"));
                post.setStatus_id(rs.getInt("status_id"));
                list.add(post);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (rs != null) {
                rs.close();
            }
        }
        return list;
    }
    public ArrayList<Post> get2LatestPost() throws Exception {
        ArrayList<Post> list = new ArrayList<>();
        try {
            String sql = "select Post.id, Post.title, Post.content, Post.post_date, Accounts.fullname as author, Post.thumbnail, Post.category_id,Post.status_id\n"
                    + "from Post \n"
                    + "inner join Manager\n"
                    + "on Post.manager_id = Manager.id\n"
                    + "inner join Accounts\n"
                    + "on Manager.account_id = Accounts.account_id\n"
                    + "order by post_date DESC\n"
                    + "OFFSET 0 ROWS  FETCH NEXT 2 ROWS ONLY";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Post post = new Post();
                post.setId(rs.getInt("id"));
                post.setTitle(rs.getString("title").substring(0, 30));
                post.setContent(rs.getString("content"));
                post.setBrief(rs.getString("content").substring(0, 300));
                post.setPost_date(rs.getDate("post_date"));
                post.setAuthor(rs.getString("author"));
                post.setThumbnail(rs.getString("thumbnail"));
                post.setCategoty_id(rs.getInt("category_id"));
                post.setStatus_id(rs.getInt("status_id"));
                list.add(post);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (rs != null) {
                rs.close();
            }
        }
        return list;
    }

    public ArrayList<Post> getPostByCategory(int index, String categoryId) throws Exception {
        ArrayList<Post> list = new ArrayList<>();
        try {
            String sql = "select Post.id, Post.title, Post.content, Post.post_date, Accounts.fullname as author, Post.thumbnail, Post.category_id,Post.status_id\n"
                    + "from Post\n"
                    + "inner join Manager\n"
                    + "on Post.manager_id = Manager.id\n"
                    + "inner join Accounts\n"
                    + "on Manager.account_id = Accounts.account_id\n"
                    + "where Post.category_id = " + categoryId + "\n"
                    + "order by post_date DESC\n"
                    + "OFFSET ? ROWS  FETCH NEXT 4 ROWS ONLY";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, (index * 4 - 4));
            rs = ps.executeQuery();
            while (rs.next()) {
                Post post = new Post();
                post.setId(rs.getInt("id"));
                post.setTitle(rs.getString("title"));
                post.setContent(rs.getString("content"));
                post.setBrief(rs.getString("content").substring(0, 300));
                post.setPost_date(rs.getDate("post_date"));
                post.setAuthor(rs.getString("author"));
                post.setThumbnail(rs.getString("thumbnail"));
                post.setCategoty_id(rs.getInt("category_id"));
                post.setStatus_id(rs.getInt("status_id"));
                list.add(post);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (rs != null) {
                rs.close();
            }
        }
        return list;
    }

    public ArrayList<Post> getPostByStatus(int index, String statusId) throws Exception {
        ArrayList<Post> list = new ArrayList<>();
        try {
            String sql = "select Post.id, Post.title, Post.content, Post.post_date, Accounts.fullname as author, Post.thumbnail, Post.category_id,Post.status_id\n"
                    + "from Post\n"
                    + "inner join Manager\n"
                    + "on Post.manager_id = Manager.id\n"
                    + "inner join Accounts\n"
                    + "on Manager.account_id = Accounts.account_id\n"
                    + "where Post.status_id = " + statusId + "\n"
                    + "order by post_date DESC\n"
                    + "OFFSET ? ROWS  FETCH NEXT 4 ROWS ONLY";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, (index * 4 - 4));
            rs = ps.executeQuery();
            while (rs.next()) {
                Post post = new Post();
                post.setId(rs.getInt("id"));
                post.setTitle(rs.getString("title"));
                post.setContent(rs.getString("content"));
                post.setBrief(rs.getString("content").substring(0, 300));
                post.setPost_date(rs.getDate("post_date"));
                post.setAuthor(rs.getString("author"));
                post.setThumbnail(rs.getString("thumbnail"));
                post.setCategoty_id(rs.getInt("category_id"));
                post.setStatus_id(rs.getInt("status_id"));
                list.add(post);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (rs != null) {
                rs.close();
            }
        }
        return list;
    }

    public ArrayList<Post> searchPostbyTitle(String search, int index) throws Exception {
        ArrayList<Post> list = new ArrayList<>();
        try {
            String sql = "select Post.id, Post.title, Post.content, Post.post_date, Accounts.fullname as author, Post.thumbnail, Post.category_id,Post.status_id\n"
                    + "from Post\n"
                    + "inner join Manager\n"
                    + "on Post.manager_id = Manager.id\n"
                    + "inner join Accounts\n"
                    + "on Manager.account_id = Accounts.account_id\n"
                    + "where Post.title like '%" + search + "%'\n"
                    + "order by post_date DESC\n"
                    + "OFFSET ? ROWS  FETCH NEXT 4 ROWS ONLY";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, (index * 4 - 4));
            rs = ps.executeQuery();
            while (rs.next()) {
                Post post = new Post();
                post.setId(rs.getInt("id"));
                post.setTitle(rs.getString("title"));
                post.setContent(rs.getString("content"));
                post.setBrief(rs.getString("content").substring(0, 300));
                post.setPost_date(rs.getDate("post_date"));
                post.setAuthor(rs.getString("author"));
                post.setThumbnail(rs.getString("thumbnail"));
                post.setCategoty_id(rs.getInt("category_id"));
                post.setStatus_id(rs.getInt("status_id"));
                list.add(post);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (rs != null) {
                rs.close();
            }
        }
        return list;
    }

    public ArrayList<Post> getSort(int index, String sort) throws Exception {
        ArrayList<Post> list = new ArrayList<>();
        try {
            String sql = "select Post.id, Post.title, Post.content, Post.post_date, Accounts.fullname as author, Post.thumbnail, Post.category_id,Post.status_id\n"
                    + "from Post\n"
                    + "inner join Manager\n"
                    + "on Post.manager_id = Manager.id\n"
                    + "inner join Accounts\n"
                    + "on Manager.account_id = Accounts.account_id\n"
                    + "ORDER BY " + sort + "\n"
                    + "OFFSET ? ROWS  FETCH NEXT 4 ROWS ONLY";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, (index * 4 - 4));
            rs = ps.executeQuery();
            while (rs.next()) {
                Post post = new Post();
                post.setId(rs.getInt("id"));
                post.setTitle(rs.getString("title"));
                post.setContent(rs.getString("content"));
                post.setBrief(rs.getString("content").substring(0, 300));
                post.setPost_date(rs.getDate("post_date"));
                post.setAuthor(rs.getString("author"));
                post.setThumbnail(rs.getString("thumbnail"));
                post.setCategoty_id(rs.getInt("category_id"));
                post.setStatus_id(rs.getInt("status_id"));
                list.add(post);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (rs != null) {
                rs.close();
            }
        }
        return list;
    }

    public ArrayList<Category> getCateName() throws SQLException {
        ArrayList<Category> list = new ArrayList<>();
        try {
            String sql = "SELECT DISTINCT  Category.id,Category.name\n"
                    + "FROM Post \n"
                    + "inner join Category\n"
                    + "on Post.category_id = Category.id";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Category category = new Category();
                category.setId(rs.getInt("id"));
                category.setName(rs.getString("name"));
                list.add(category);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (rs != null) {
                rs.close();
            }
        }
        return list;
    }

    public ArrayList<Status> getStatus() throws SQLException {
        ArrayList<Status> list = new ArrayList<>();
        try {
            String sql = "SELECT DISTINCT  Status.id,Status.name\n"
                    + "FROM Post \n"
                    + "inner join Status\n"
                    + "on Post.status_id = Status.id";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Status status1 = new Status();
                status1.setId(rs.getInt("id"));
                status1.setName(rs.getString("name"));
                list.add(status1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (rs != null) {
                rs.close();
            }
        }
        return list;
    }

    public int countPost() throws Exception {
        String sql = "SELECT count(*) FROM Post";
        try {
            conn = getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PostDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conn != null) {
                conn.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (rs != null) {
                rs.close();
            }
        }
        return 0;
    }

    public int countPostbyCategory(String categoryID) throws Exception {
        String sql = "SELECT count(*)\n"
                + "FROM Post \n"
                + "WHERE category_id = "+categoryID+"";
        try {
            conn = getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PostDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conn != null) {
                conn.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (rs != null) {
                rs.close();
            }
        }
        return 0;
    }

    public int countPostbyStatus(String statusID) throws Exception {
        String sql = "SELECT count(*)\n"
                + "FROM Post \n"
                + "WHERE status_id = "+statusID+"";
        try {
            conn = getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PostDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conn != null) {
                conn.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (rs != null) {
                rs.close();
            }
        }
        return 0;
    }

    public int countSearchPost(String search) throws Exception {
        String sql = "SELECT count(*) FROM Post \n"
                + "where title like '%" + search + "%'";
        try {
            conn = getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PostDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conn != null) {
                conn.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (rs != null) {
                rs.close();
            }
        }
        return 0;
    }

    public int totalPage() throws SQLException {
        int total = 0;
        String sql = "select count(*)\n"
                + "from Post";
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int totalA = rs.getInt(1);
                total = totalA / 4;
                if (totalA % 4 != 0) {
                    total++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (rs != null) {
                rs.close();
            }
        }
        return total;
    }

    public void updatePost(Post post, int id) throws SQLException {
        try {
            String sql = "UPDATE Post\n"
                    + "SET title = ?, content = ?, category_id = ?, status_id = ?\n"
                    + "WHERE id = ?";
            conn = getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, post.getTitle());
            ps.setString(2, post.getContent());
            ps.setInt(3, post.getCategoty_id());
            ps.setInt(4, post.getStatus_id());
            ps.setInt(5, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
            if (ps != null) {
                ps.close();
            }
        }
    }
}
