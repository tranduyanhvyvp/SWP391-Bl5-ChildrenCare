/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author stter
 */
public class Account {
    private int id;
    private String fullName;
    private int gender;
    private String address;
    private String email;
    private String dob;
    private String phoneNumber;
    private String username;
    private String password;
    private int role_id;
    private String avatar;
    private int status;

    public Account() {
    }

    public Account(String fullName, int gender, String address, String email, String phoneNumber, int role_id) {
        this.fullName = fullName;
        this.gender = gender;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.role_id = role_id;
    }

    public Account(int id, String fullName, int gender, String address, String email, String dob, String phoneNumber, String username, String password, int role_id, String avatar, int status) {
        this.id = id;
        this.fullName = fullName;
        this.gender = gender;
        this.address = address;
        this.email = email;
        this.dob = dob;
        this.phoneNumber = phoneNumber;
        this.username = username;
        this.password = password;
        this.role_id = role_id;
        this.avatar = avatar;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", fullName=" + fullName + ", gender=" + gender + ", address=" + address + ", email=" + email + ", dob=" + dob + ", phoneNumber=" + phoneNumber + ", username=" + username + ", password=" + password + ", role_id=" + role_id + ", avatar=" + avatar + ", status=" + status + '}';
    }



    
    
   
    
    

    

   
}
