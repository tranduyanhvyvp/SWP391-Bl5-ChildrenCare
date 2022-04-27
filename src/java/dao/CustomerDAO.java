/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entities.Customer;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author aDMIN
 */
public class CustomerDAO extends DBContext {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public ArrayList<Customer> getAllCustomer() {
        ArrayList<Customer> list = new ArrayList<>();
        String query = "select * from Accounts where role_id=4";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Customer(rs.getInt(1),
                        rs.getString(2),
                        rs.getBoolean(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getDate(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9)
                ));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public Customer checkUsernameExist(String username) {

        String query = "SELECT * FROM Accounts a FULL OUTER JOIN [role] r ON a.role_id = r.role_id where username = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Customer(rs.getInt(1),
                        rs.getString(2),
                        rs.getBoolean(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getDate(6),
                        rs.getString(7),
                        rs.getString(13),
                        rs.getString(11)
                );
            }
        } catch (Exception e) {
        }
        return null;
    }

    public void insertUser(String name, String gender, String address, String email, String dob, String phone, String username, String password, String role, String avatar) {
        String query = "INSERT INTO [Accounts]\n"
                + "           ([fullname]\n"
                + "           ,[gender]\n"
                + "           ,[address]\n"
                + "           ,[email]\n"
                + "           ,[dob]\n"
                + "           ,[phonenumber]\n"
                + "           ,[username]\n"
                + "           ,[password]\n"
                + "           ,[role_id]\n"
                + "           ,[avatar])\n"
                + "\n"
                + "     VALUES\n"
                + "           (?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, gender);
            ps.setString(3, address);
            ps.setString(4, email);
            ps.setString(5, dob);
            ps.setString(6, phone);
            ps.setString(7, username);
            ps.setString(8, password);
            ps.setString(9, role);
            ps.setString(10, avatar);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
