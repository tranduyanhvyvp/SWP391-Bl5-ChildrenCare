/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import entities.role;
import entities.user;

/**
 *
 * @author aDMIN
 */
public class Admin_DAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<role> ListRole() {
        List<role> list = new ArrayList<>();
        String query = "select * from [roles]";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new role(rs.getInt(1),
                        rs.getString(2)
                ));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<user> getAllUser() {
        List<user> list = new ArrayList<>();
        String query = "select * from [Roles] r, Accounts a where r.id=a.role_id ";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new user(rs.getInt(3),
                        rs.getString(4),
                        rs.getBoolean(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getDate(8),
                        rs.getString(9),
                        rs.getString(2),
                        rs.getString(13)
                ));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public void update(String id, String name, String address, String email, String phone, String role) {
        String query = "UPDATE Accounts\n"
                + "                  SET [fullname] = ?\n"
                + "                     ,[address] = ?\n"
                + "                     ,[email] = ?\n"
                + "                     ,[phonenumber] = ?\n"
                + "                      ,[role_id] = ?\n"
                + "                \n"
                + "                 WHERE account_id=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, address);
            ps.setString(3, email);
            ps.setString(4, phone);
            ps.setString(5, role);
            ps.setString(6, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public List<user> search(String txt) {
        List<user> list = new ArrayList<>();
        String query = "SELECT * FROM Accounts a FULL OUTER JOIN [role] r ON a.role_id = r.role_id where fullname like ?  or phonenumber like ? or email like ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + txt + "%");
            ps.setString(2, "%" + txt + "%");
            ps.setString(3, "%" + txt + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new user(rs.getInt(1),
                        rs.getString(2),
                        rs.getBoolean(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getDate(6),
                        rs.getString(7),
                        rs.getString(13),
                        rs.getString(11)
                ));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public user searchUser(String uid) {
        List<user> list = new ArrayList<>();
        String query = "SELECT * FROM Accounts a FULL OUTER JOIN [roles] r ON a.role_id = r.id where a.account_id =?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, uid);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new user(rs.getInt(1),
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

    public void insertUser(String name, String gender, String address, String email, String dob, String phone, String username, String password, String role) {
        String query = "INSERT INTO [Accounts]\n"
                + "           ([fullname]\n"
                + "           ,[gender]\n"
                + "           ,[address]\n"
                + "           ,[email]\n"
                + "           ,[dob]\n"
                + "           ,[phonenumber]\n"
                + "           ,[username]\n"
                + "           ,[password]\n"
                + "           ,[role_id])\n"
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
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public user checkUsernameExist(String username) {

        String query = "SELECT * FROM Accounts a FULL OUTER JOIN [role] r ON a.role_id = r.role_id where username = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new user(rs.getInt(1),
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

    public static void main(String[] args) {
        Admin_DAO dao = new Admin_DAO();
        List<role> x = dao.ListRole();
        for (role object : x) {
            System.out.println(object);
        }
        user check = dao.checkUsernameExist("duy1");
        System.out.println(check);

    }
}
