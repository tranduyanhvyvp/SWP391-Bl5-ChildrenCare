/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Feedback;
import entity.Reservation;
import entity.Role;
import entity.Service;
import entity.Status;
import entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aDMIN
 */
public class ReservationDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<Reservation> getListReservation() {
        List<Reservation> list = new ArrayList<>();
        String query = "select r.id, r.description, r.staff_id, r.total, a.fullname, a.gender, a.[address], a.email, a.phonenumber, a.role_id, s.title, s.thumbnail, st.id, st.[name], r.[date], s.id\n"
                + "from Accounts a, Reservation r, Services s, [Status] st\n"
                + "where a.account_id = r.customer_id\n"
                + "and s.id = r.service_id\n"
                + "and st.id = r.[status]";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Reservation(
                        rs.getInt(1),
                        new User(rs.getString(5), rs.getBoolean(6), rs.getString(7), rs.getString(8), rs.getString(9)),
                        new Service(rs.getInt(16),rs.getString(11), rs.getString(12)),
                        rs.getInt(3),
                        rs.getString(2),
                        rs.getInt(4),
                        new Status(rs.getInt(13), rs.getString(14)),
                        rs.getDate(15)
                ));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<User> getAllStaff() {
        List<User> list = new ArrayList<>();
        String query = "select * from [Roles] r, Accounts a where r.id=a.role_id and r.id=3";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new User(rs.getInt(3),
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

    public List<Reservation> getListFilter(String statusId, String date, String staffId) {
        List<Reservation> list = new ArrayList<>();
        String query = "select r.id, r.description, r.staff_id, r.total, a.fullname, a.gender, a.[address], a.email, a.phonenumber, a.role_id, s.title, s.thumbnail, st.id, st.[name], r.[date], s.id\n"
                + "from Accounts a, Reservation r, Services s, [Status] st\n"
                + "where a.account_id = r.customer_id\n"
                + "and s.id = r.service_id\n"
                + "and st.id = r.[status]\n"
                + "and st.id ="
                + statusId
                + "\n"
                + "and r.[date] ="
                + date
                + "\n"
                + "and r.staff_id = "
                + staffId;
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Reservation(
                        rs.getInt(1),
                        new User(rs.getString(5), rs.getBoolean(6), rs.getString(7), rs.getString(8), rs.getString(9)),
                        new Service(rs.getInt(16),rs.getString(11), rs.getString(12)),
                        rs.getInt(3),
                        rs.getString(2),
                        rs.getInt(4),
                        new Status(rs.getInt(13), rs.getString(14)),
                        rs.getDate(15)
                ));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Reservation> searchReservationByName(String name) {
        List<Reservation> list = new ArrayList<>();
        String query = "select r.id, r.description, r.staff_id, r.total, a.fullname, a.gender, a.[address], a.email, a.phonenumber, a.role_id, s.title, s.thumbnail, st.id, st.[name], r.[date], s.id\n"
                + "from Accounts a, Reservation r, Services s, [Status] st\n"
                + "where a.account_id = r.customer_id\n"
                + "and s.id = r.service_id\n"
                + "and st.id = r.[status]\n"
                + "and a.fullname like ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + name + "%");
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new Reservation(
                        rs.getInt(1),
                        new User(rs.getString(5), rs.getBoolean(6), rs.getString(7), rs.getString(8), rs.getString(9)),
                        new Service(rs.getInt(16),rs.getString(11), rs.getString(12)),
                        rs.getInt(3),
                        rs.getString(2),
                        rs.getInt(4),
                        new Status(rs.getInt(13), rs.getString(14)),
                        rs.getDate(15)
                ));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public Reservation searchReservationById(String Id) {

        String query = "select r.id, r.description, r.staff_id, r.total, a.fullname, a.gender, a.[address], a.email, a.phonenumber, a.role_id, s.title, s.thumbnail, st.id, st.[name], r.[date], s.id\n"
                + "from Accounts a, Reservation r, Services s, [Status] st\n"
                + "where a.account_id = r.customer_id\n"
                + "and s.id = r.service_id\n"
                + "and st.id = r.[status]\n"
                + "and r.id =?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, Id);
            rs = ps.executeQuery();

            while (rs.next()) {
                return new Reservation(
                        rs.getInt(1),
                        new User(rs.getString(5), rs.getBoolean(6), rs.getString(7), rs.getString(8), rs.getString(9)),
                        new Service(rs.getInt(16),rs.getString(11), rs.getString(12)),
                        rs.getInt(3),
                        rs.getString(2),
                        rs.getInt(4),
                        new Status(rs.getInt(13), rs.getString(14)),
                        rs.getDate(15)
                );
            }
        } catch (Exception e) {
        }
        return null;
    }

    public void updateStatus(String reservationId, String statusId) {
        String query = "UPDATE Reservation\n"
                + "SET [status] = ?\n"
                + "WHERE id=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, statusId);
            ps.setString(2, reservationId);

            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void updateStaff(String reservationId, String staffId) {
        String query = "UPDATE Reservation\n"
                + "SET staff_id =? \n"
                + "WHERE id=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, staffId);
            ps.setString(2, reservationId);

            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        ReservationDAO dao = new ReservationDAO();
        List<User> a = dao.getAllStaff();
        for (User user : a) {
            System.out.println(user);
        }

    }
}
