/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Product;

/**
 *
 * @author DELL
 */
public class ProductDAO extends DBContext {

    public void addProduct(Product p) {
        String sql = "insert into service values(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, p.getId());
            ps.setString(2, p.getTitle());
            ps.setInt(3, p.getCategory());
            ps.setFloat(4, p.getOriginalPrice());
            ps.setFloat(5, p.getSalePrice());
            ps.setInt(6, p.getStatus());
            ps.setString(7, p.getDescription());
            ps.setString(8, p.getThumbnail());
            ps.setDate(8, (java.sql.Date) getDate());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public ArrayList<Product> getListProduct() {

        String sql = "select * from service";
        ArrayList<Product> list = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                int category = rs.getInt("category");
                String title = rs.getString("title");
                String thumbnail = rs.getString("thumbnail");
                float originalPrice = rs.getFloat("originalPrice");
                float salePrice = rs.getFloat("salePrice");
                int status = rs.getInt("status");
                Date updatedDate = rs.getDate("updatedDate");
                String description = rs.getString("description");
                list.add(new Product(id, title, category,
                        originalPrice, salePrice, status, description,thumbnail,updatedDate));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Product> getListByCategoryId(int cid) {

        String sql = "select * from service where category='" + cid + "'";
        ArrayList<Product> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                int category = rs.getInt("category");
                String title = rs.getString("title");
                String thumbnail = rs.getString("thumbnail");
                float originalPrice = rs.getFloat("originalPrice");
                float salePrice = rs.getFloat("salePrice");
                int status = rs.getInt("status");
                Date updatedDate = rs.getDate("updatedDate");
                String description = rs.getString("description");
                list.add(new Product(id, title, category,
                        originalPrice, salePrice, status, description,thumbnail,updatedDate));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public Product getProductById(int pid) {

        String sql = "select * from product where ma_san_pham='" + pid + "'";
        Product p = new Product();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                int category = rs.getInt("category");
                String title = rs.getString("title");
                String thumbnail = rs.getString("thumbnail");
                float originalPrice = rs.getFloat("originalPrice");
                float salePrice = rs.getFloat("salePrice");
                int status = rs.getInt("status");
                Date updatedDate = rs.getDate("updatedDate");
                String description = rs.getString("description");
                p = new Product(id, title, category,
                        originalPrice, salePrice, status, description,thumbnail,updatedDate);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return p;
    }

    public ArrayList<Product> searchList(String ten_san_pham, String ten_the_loai) {

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
        ArrayList<Product> list = new ArrayList<>();
        try {
            PreparedStatement ps =con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                int category = rs.getInt("category");
                String title = rs.getString("title");
                String thumbnail = rs.getString("thumbnail");
                float originalPrice = rs.getFloat("originalPrice");
                float salePrice = rs.getFloat("salePrice");
                int status = rs.getInt("status");
                Date updatedDate = rs.getDate("updatedDate");
                String description = rs.getString("description");
                list.add(new Product(id, title, category,
                        originalPrice, salePrice, status, description,thumbnail,updatedDate));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public ArrayList<Product> paging(int index) {
        String query = "SELECT * FROM service order by service.id  OFFSET ? ROWS  FETCH NEXT 4 ROWS ONLY ";
                
                
        ArrayList<Product> list = new ArrayList<>();
        try {
           
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, (index * 4 - 4));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                 int id = rs.getInt("id");
                int category = rs.getInt("category");
                String title = rs.getString("title");
                String thumbnail = rs.getString("thumbnail");
                float originalPrice = rs.getFloat("originalPrice");
                float salePrice = rs.getFloat("salePrice");
                int status = rs.getInt("status");
                Date updatedDate = rs.getDate("updatedDate");
                String description = rs.getString("description");
                list.add(new Product(id, title, category,
                        originalPrice, salePrice, status, description,thumbnail,updatedDate));
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }
    
    public int totalPage() {
        int total = 0;
        String query = "select count(*) from service";
        try {
            
           PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int totalA = rs.getInt(1);
                total = totalA / 4;
                if (totalA % 4 != 0) {
                    total++;
                }
            }
        } catch (Exception e) {
        }
        return total;
    }

    private Date getDate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
