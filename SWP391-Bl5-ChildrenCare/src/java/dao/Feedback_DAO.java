/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entities.feedback;
import entities.role;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aDMIN
 */
public class Feedback_DAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<feedback> getListFeedback() {
        List<feedback> list = new ArrayList<>();
        String query = "select  sf.id,a.fullname, s.title, sf.content, sf.date, sf.star\n"
                + "from Service_feedback sf, Services s,Accounts a \n"
                + "where sf.customer_id =a.account_id\n"
                + "and	sf.service_id = s.id";
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
                        rs.getDate(5)
                ));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<feedback> searchFeedBack(String search) {
        List<feedback> list = new ArrayList<>();
        String query = "select  sf.id,a.fullname, s.title, sf.content, sf.date, sf.star\n"
                + "from Service_feedback sf, Services s,Accounts a \n"
                + "where a.fullname like ?  or sf.content like ?\n"
                + "and sf.customer_id =a.account_id\n"
                + "and	sf.service_id = s.id";
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
                        rs.getDate(5)
                ));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public static void main(String[] args) {
        Feedback_DAO dao = new Feedback_DAO();
        List<feedback> x = dao.searchFeedBack("anh");
        for (feedback object : x) {
            System.out.println(object);
        }

    }
}
