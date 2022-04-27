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
public class Service {

    private int id;
    private String title;
    private int category_id;
    private float original_price;
    private float sale_price;
    private Date updated_date;
    private String description;
    private String thumbnail;
    private int status_id;

    public Service() {
    }

    public Service(int id, String title, int category_id, float original_price, float sale_price, Date updated_date, String description, String thumbnail, int status_id) {
        this.id = id;
        this.title = title;
        this.category_id = category_id;
        this.original_price = original_price;
        this.sale_price = sale_price;
        this.updated_date = updated_date;
        this.description = description;
        this.thumbnail = thumbnail;
        this.status_id = status_id;
    }
    public Service(int id) {
        this.id = id;
        
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

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public float getOriginal_price() {
        return original_price;
    }

    public void setOriginal_price(float original_price) {
        this.original_price = original_price;
    }

    public float getSale_price() {
        return sale_price;
    }

    public void setSale_price(float sale_price) {
        this.sale_price = sale_price;
    }

    public Date getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(Date updated_date) {
        this.updated_date = updated_date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public int getStatus_id() {
        return status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }
    

}
