/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package context;

import entities.Blog;
import entities.Service;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author os
 */
public class DBContext {

    /*USE BELOW METHOD FOR YOUR DATABASE CONNECTION FOR BOTH SINGLE AND MULTILPE SQL SERVER INSTANCE(s)*/
 /*DO NOT EDIT THE BELOW METHOD, YOU MUST USE ONLY THIS ONE FOR YOUR DATABASE CONNECTION*/
    public Connection getConnection() throws Exception {
        String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + "\\" + instance + ";databaseName=" + dbName;
        if (instance == null || instance.trim().isEmpty()) {
            url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName;
        }
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, userID, password);
    }
    /*Insert your other code right after this comment*/
 /*Change/update information of your database connection, DO NOT change name of instance variables in this class*/
    private final String serverName = "localhost";
    private final String dbName = "ChildrenCare";
    private final String portNumber = "1433";
    private final String instance = "";//LEAVE THIS ONE EMPTY IF YOUR SQL IS A SINGLE INSTANCE
    private final String userID = "sa";
    private final String password = "123456";

    public static void main(String[] args) {
        try {
//            Connection conn = null;
//            PreparedStatement ps = null;
//            ResultSet rs = null;
//            ArrayList<Service> list = new ArrayList<>();
//             String sql = "select * from Services";
//            conn = new DBContext().getConnection();
//            ps = conn.prepareStatement(sql);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                Service service = new Service();
//                service.setServices_id(rs.getInt("services_id"));
//                service.setTitle(rs.getString("title"));
//                list.add(service);
//            }
//            System.out.println(list.get(0).getServices_id());
            System.out.println(new DBContext().getConnection());
            System.out.println("ok");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
