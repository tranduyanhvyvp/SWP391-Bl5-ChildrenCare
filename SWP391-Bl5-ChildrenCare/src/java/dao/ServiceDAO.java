/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Service;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author phuch
 */
public class ServiceDAO extends DBContext{
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public ArrayList<Service> get5LatestService() throws IOException {
        ArrayList<Service> list = new ArrayList<>();
        try {
            String sql = "select * \n"
                    + "from Services\n"
                    + "order by updated_date DESC\n"
                    + "OFFSET 0 ROWS  FETCH NEXT 5 ROWS ONLY";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Service service = new Service();
                service.setId(rs.getInt("id"));
                service.setTitle(rs.getString("title"));
                service.setOriginal_price(rs.getFloat("original_price"));
                service.setSale_price(rs.getFloat("sale_price"));
                service.setDescription(rs.getString("description"));
                service.setThumbnail(rs.getString("thumbnail"));
                service.setStatus_id(rs.getInt("status_id"));
                list.add(service);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
