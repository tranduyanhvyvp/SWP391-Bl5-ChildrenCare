/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;

/**
 *
 * @author aDMIN
 */
public class Feedback {

    private int id;
    private String customer_name;
    private String service_name;
    private int star;
    private String content;
    private Date date_post;
    private Status status1;
    private int userId;

    public Feedback(int id, String customer_name, String service_name, int star, String content, Date date_post, Status status1, int userId) {
        this.id = id;
        this.customer_name = customer_name;
        this.service_name = service_name;
        this.star = star;
        this.content = content;
        this.date_post = date_post;
        this.status1 = status1;
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    

    public Feedback(int id, String customer_name, String service_name, int star, String content, Date date_post, Status status1) {
        this.id = id;
        this.customer_name = customer_name;
        this.service_name = service_name;
        this.star = star;
        this.content = content;
        this.date_post = date_post;
        this.status1 = status1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate_post() {
        return date_post;
    }

    public void setDate_post(Date date_post) {
        this.date_post = date_post;
    }

    public Status getStatus1() {
        return status1;
    }

    public void setStatus1(Status status1) {
        this.status1 = status1;
    }

    @Override
    public String toString() {
        return "feedback{" + "id=" + id + ", customer_name=" + customer_name + ", service_name=" + service_name + ", star=" + star + ", content=" + content + ", date_post=" + date_post + ", status1=" + status1 + '}';
    }


}
