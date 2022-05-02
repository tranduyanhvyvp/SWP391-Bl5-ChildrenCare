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
public class Reservation {

    public Reservation(int id, User customer, Service service, int staff_id, String description, int total, Status status, Date date) {
        this.id = id;
        this.customer = customer;
        this.service = service;
        this.staff_id = staff_id;
        this.description = description;
        this.total = total;
        this.status = status;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private int id;
    private User customer;
    private Service service;
    private int staff_id;
    private String description;
    private int total;
    private Status status;
    private Date date;
    

    public Reservation(int id, User customer, Service service, int staff_id, String description, int total, Status status) {
        this.id = id;
        this.customer = customer;
        this.service = service;
        this.staff_id = staff_id;
        this.description = description;
        this.total = total;
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
    
    

    public Reservation(int id, User customer, Service service, int staff_id, String description, int total) {
        this.id = id;
        this.customer = customer;
        this.service = service;
        this.staff_id = staff_id;
        this.description = description;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Reservation{" + "id=" + id + ", customer=" + customer + ", service=" + service + ", staff_id=" + staff_id + ", description=" + description + ", total=" + total + '}';
    }

}
