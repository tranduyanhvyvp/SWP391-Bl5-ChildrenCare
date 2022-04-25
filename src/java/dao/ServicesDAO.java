/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import model.Services;

/**
 *
 * @author DELL
 */
public class ServicesDAO extends DBContext {

    public void addProduct(Services p) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "insert into Services values(?,?,?,?,?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            ps.setInt(1, p.getId());
            ps.setString(2, p.getTitle());
            ps.setInt(3, p.getCategory_id());
            ps.setFloat(4, p.getOriginal_price());
            ps.setFloat(5, p.getSale_price());
            ps.setTimestamp(6, new Timestamp(p.getUpdated_date().getTime()));
            ps.setString(7, p.getDescription());
            ps.setString(8, p.getThumbnail());
            ps.setInt(9,p.getStatus_id());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public ArrayList<Services> getListProduct() throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from Services";
        ArrayList<Services> list = new ArrayList<>();
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                int category_id = rs.getInt("category_id");
                String title = rs.getString("title");
                String thumbnail = rs.getString("thumbnail");
                float original_price = rs.getFloat("original_price");
                float sale_price = rs.getFloat("sale_price");
                int status_id = rs.getInt("status_id");
                Date updated_date = rs.getDate("updated_date");
                String description = rs.getString("description");
                list.add(new Services(id, title, category_id,original_price,sale_price,updated_date,description,thumbnail,status_id));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Services> getListByCategoryId(int cid) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from Services where category_id='" + cid + "'";
        ArrayList<Services> list = new ArrayList<>();
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                int category_id = rs.getInt("category_id");
                String title = rs.getString("title");
                String thumbnail = rs.getString("thumbnail");
                float original_price = rs.getFloat("original_price");
                float sale_price = rs.getFloat("sale_price");
                int status_id = rs.getInt("status_id");
                Date updated_date = rs.getDate("updated_date");
                String description = rs.getString("description");
                list.add(new Services(id, title, category_id,original_price,sale_price,updated_date,description,thumbnail,status_id));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public Services getServicetById(int sid) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from Services where id='" + sid + "'";
        Services p = new Services();
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                int category_id = rs.getInt("category_id");
                String title = rs.getString("title");
                String thumbnail = rs.getString("thumbnail");
                float original_price = rs.getFloat("original_price");
                float sale_price = rs.getFloat("sale_price");
                int status_id = rs.getInt("status_id");
                Date updated_date = rs.getDate("updated_date");
                String description = rs.getString("description");
                p = new Services(id, title, category_id,original_price,sale_price,updated_date,description,thumbnail,status_id);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return p;
    }

    public ArrayList<Services> searchList(String ten_san_pham, String ten_the_loai) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "";
        if (!ten_san_pham.equals("") && !ten_the_loai.equals("")) {
            sql = "SELECT * FROM product, category WHERE ten_san_pham like N'%" + ten_san_pham + "%' AND product.ma_the_loai = category.ma_the_loai AND ten_the_loai=N'" + ten_the_loai + "'";
        } else {
            if (ten_san_pham.equals("")) {
                sql = "SELECT * FROM product, category WHERE product.ma_the_loai = category.ma_the_loai AND ten_the_loai=N'" + ten_the_loai + "'";
            } else {
                if (ten_the_loai.equals("")) {
                    sql = "SELECT * FROM product, category WHERE ten_san_pham like  N'%" + ten_san_pham + "%' AND product.ma_the_loai = category.ma_the_loai";
                }
            }
        }
        ArrayList<Services> list = new ArrayList<>();
        try {

            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                int category_id = rs.getInt("category_id");
                String title = rs.getString("title");
                String thumbnail = rs.getString("thumbnail");
                float original_price = rs.getFloat("original_price");
                float sale_price = rs.getFloat("sale_price");
                int status_id = rs.getInt("status_id");
                Date updated_date = rs.getDate("updated_date");
                String description = rs.getString("description");
                list.add(new Services(id, title, category_id,original_price,sale_price,updated_date,description,thumbnail,status_id));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Services> paging(int index) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM [Services] order by [Services].updated_date  desc  OFFSET ? ROWS  FETCH NEXT 4 ROWS ONLY ";

        ArrayList<Services> list = new ArrayList<>();
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, (index * 4 - 4));
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                int category_id = rs.getInt("category_id");
                String title = rs.getString("title");
                String thumbnail = rs.getString("thumbnail");
                float original_price = rs.getFloat("original_price");
                float sale_price = rs.getFloat("sale_price");
                int status_id = rs.getInt("status_id");
                Date updated_date = rs.getDate("updated_date");
                String description = rs.getString("description");
                list.add(new Services(id, title, category_id,original_price,sale_price,updated_date,description,thumbnail,status_id));
            }
            return list;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public int totalPage() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int total = 0;
        String sql = "select count(*) from Services";
        try {
            conn = new DBContext().getConnection();
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
            System.out.println(e.getMessage());
        }
        return total;
    }

    private Date getDate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
