/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author phuch
 */
public class Service {
    private int services_id;
    private String title;
    private int price;
    private String status;
    private String description;

    public Service() {
    }

    public Service(int services_id, String title, int price, String status, String description) {
        this.services_id = services_id;
        this.title = title;
        this.price = price;
        this.status = status;
        this.description = description;
    }

    public int getServices_id() {
        return services_id;
    }

    public void setServices_id(int services_id) {
        this.services_id = services_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
    
    
}
