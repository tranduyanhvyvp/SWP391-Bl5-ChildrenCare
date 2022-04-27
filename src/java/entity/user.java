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
public class user {

    public user(int id, String fullname, boolean gender, String address, String emaii, Date dob, String phoneNumber, String role, String avatar) {
        this.id = id;
        this.fullname = fullname;
        this.gender = gender;
        this.address = address;
        this.emaii = emaii;
        this.dob = dob;
        this.phoneNumber = phoneNumber;
        this.role = role;
        this.avatar = avatar;
    }
    private int id;
    private String fullname;
    private boolean gender;
    private String address;
    private String emaii;
    private Date dob;
    private String phoneNumber;
    private String role;
    private String avatar;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmaii() {
        return emaii;
    }

    public void setEmaii(String emaii) {
        this.emaii = emaii;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "user{" + "id=" + id + ", fullname=" + fullname + ", gender=" + gender + ", address=" + address + ", emaii=" + emaii + ", dob=" + dob + ", phoneNumber=" + phoneNumber + ", role=" + role + ", avatar=" + avatar + '}';
    }
    
    
}
