/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.feedback;
import entity.feedbackImage;
import entity.status;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aDMIN
 */
public class FeedbackDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<feedback> getListFeedback() {
        List<feedback> list = new ArrayList<>();
        String query = "select  sf.id,a.fullname, s.title, sf.content, sf.date, sf.star, st.id, st.name\n"
                + "from Service_feedback sf, Services s,Accounts a, Status st\n"
                + "where sf.customer_id =a.account_id\n"
                + "and	sf.service_id = s.id\n"
                + "and sf.status_id = st.id";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new feedback(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(6),
                        rs.getString(4),
                        rs.getDate(5),
                        new status(rs.getInt(7), rs.getString(8))
                ));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<feedback> searchFeedBack(String search) {
        List<feedback> list = new ArrayList<>();
        String query = "select  sf.id,a.fullname, s.title, sf.content, sf.date, sf.star, st.id, st.name\n"
                + "from Service_feedback sf, Services s,Accounts a, Status st\n"
                + "where a.fullname like ?  or sf.content like ?\n"
                + "and	sf.service_id = s.id\n"
                + "and sf.status_id = st.id\n"
                + "and sf.customer_id =a.account_id";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + search + "%");
            ps.setString(2, "%" + search + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new feedback(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(6),
                        rs.getString(4),
                        rs.getDate(5),
                        new status(rs.getInt(7), rs.getString(8))
                ));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public feedback searchFeedBackById(String search) {

        String query = "select  sf.id,a.fullname, s.title, sf.content, sf.date, sf.star, st.id, st.name,a.account_id\n"
                + "from Service_feedback sf, Services s,Accounts a, Status st\n"
                + "where sf.id =?\n"
                + "and	sf.service_id = s.id\n"
                + "and sf.status_id = st.id\n"
                + "and sf.customer_id =a.account_id";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, search);

            rs = ps.executeQuery();
            while (rs.next()) {
                return new feedback(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(6),
                        rs.getString(4),
                        rs.getDate(5),
                        new status(rs.getInt(7), rs.getString(8)),
                        rs.getInt(9)
                );
            }
        } catch (Exception e) {
        }
        return null;
    }

    public List<status> getAllStatus() {
        List<status> list = new ArrayList<>();
        String query = "select * from Status";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new status(rs.getInt(1),
                        rs.getString(2)
                ));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public void update(String feedbackId, String statusId) {
        String query = "UPDATE [Service_feedback]\n"
                + "   SET [status_id] = ?\n"
                + " WHERE id=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, statusId);
            ps.setString(2, feedbackId);

            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public List<feedbackImage> feedbackImage(String feedbackId) {
        List<feedbackImage> list = new ArrayList<>();
        String query = "select * from Service_feedback_img where service_feedback_id = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, feedbackId);

            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new feedbackImage(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3)
                ));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public static void main(String[] args) {
        FeedbackDAO dao = new FeedbackDAO();
        List<feedbackImage> a = dao.feedbackImage("7");
        for (feedbackImage image : a) {
            System.out.println(image);
        }
        

    }
}
