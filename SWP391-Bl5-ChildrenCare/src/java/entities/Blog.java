package entities;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phuch
 */
public class Blog {
    private int blog_id;
    private String title;
    private String content;
    private Date post_date;
    private String status;
    private int customer_id;

    public Blog() {
    }

    public Blog(int blog_id, String title, String content, Date post_date, String status, int customer_id) {
        this.blog_id = blog_id;
        this.title = title;
        this.content = content;
        this.post_date = post_date;
        this.status = status;
        this.customer_id = customer_id;
    }

    public int getBlog_id() {
        return blog_id;
    }

    public void setBlog_id(int blog_id) {
        this.blog_id = blog_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPost_date() {
        return post_date;
    }

    public void setPost_date(Date post_date) {
        this.post_date = post_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }
}
