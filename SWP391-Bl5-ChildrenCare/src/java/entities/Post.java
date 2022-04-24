/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.sql.Date;

/**
 *
 * @author phuch
 */
public class Post {
    private int id;
    private String title;
    private String content;
    private String brief;
    private Date post_date;
    private String author;
    private String thumbnail;
    private int categoty_id;
    private int status_id;

    public Post() {
    }

    public Post(int id, String title, String content, String brief, Date post_date, String author, String thumbnail, int categoty_id, int status_id) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.brief = brief;
        this.post_date = post_date;
        this.author = author;
        this.thumbnail = thumbnail;
        this.categoty_id = categoty_id;
        this.status_id = status_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public Date getPost_date() {
        return post_date;
    }

    public void setPost_date(Date post_date) {
        this.post_date = post_date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public int getCategoty_id() {
        return categoty_id;
    }

    public void setCategoty_id(int categoty_id) {
        this.categoty_id = categoty_id;
    }

    public int getStatus_id() {
        return status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }

}
