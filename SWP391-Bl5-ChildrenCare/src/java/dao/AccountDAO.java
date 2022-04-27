/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stter
 */
public class AccountDAO extends DBContext {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public Account login(String user, String pass) {
        try {
            String query = "SELECT * FROM Accounts WHERE username = ? AND password = ?";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();

            while (rs.next()) {
                Account a = new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getInt(10),
                        rs.getString(11));
                return a;
            }

        } catch (Exception e) {
        }
        return null;
    }

    public Account checkAccountExit(String user) {
        try {
            String query = "SELECT * FROM Accounts WHERE username = ? ";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            rs = ps.executeQuery();

            while (rs.next()) {
                Account a = new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getInt(10),
                        rs.getString(11));
                return a;
            }

        } catch (Exception e) {
        }
        return null;
    }

    public void register(String user, String pass, String fullName, int gender, String email, int phoneNumber, String address) {
        String query = "INSERT INTO Accounts () VALUES(?,?,?,?,'04/20/2022',?,?,?,4,0)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, fullName);
            ps.setInt(2, gender);
            ps.setString(3, address);
            ps.setString(4, email);
            ps.setInt(5, phoneNumber);
            ps.setString(6, user);
            ps.setString(7, pass);

            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public Account updatePassword(String user, String pass) {
        try {
            String query = "UPDATE Accounts SET  password = ? WHERE username = ?";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, pass);
            ps.setString(2, user);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return null;
    }

    public Account updateAvatar(String user, String avatar) {
        try {
            String query = "UPDATE Accounts SET  avatar = ? WHERE username = ?";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, avatar);
            ps.setString(2, user);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return null;
    }

    public Account updateProfile(String user, String fullname, int gender, String address, String dob, int phonenumber) {
        try {
            String query = "UPDATE Accounts SET  fullname = ?, gender = ?, address = ?, dob = ?, phonenumber = ? WHERE username = ?";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, fullname);
            ps.setInt(2, gender);
            ps.setString(3, address);
            ps.setString(4, dob);
            ps.setInt(5, phonenumber);
            ps.setString(6, user);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return null;
    }

    public static void main(String[] args) {
        AccountDAO dao = new AccountDAO();
        Account a = dao.login("duyanhh", "123456");
        System.out.println(a);
    }
}
