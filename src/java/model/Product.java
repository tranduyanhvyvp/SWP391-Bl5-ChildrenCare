package model;

import java.util.Date;

public class Product {

	private int id;
	private String title;
	private int  category;
	private float originalPrice;
	private float salePrice;
	private int status;
	private String description;
        private String thumbnail;
        private Date updatedDate;

	public Product() {
	}

    public Product(int id, String title, int category, float originalPrice, float salePrice, int status, String description, String thumbnail, Date updatedDate) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.originalPrice = originalPrice;
        this.salePrice = salePrice;
        this.status = status;
        this.description = description;
        this.thumbnail = thumbnail;
        this.updatedDate = updatedDate;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getCategory() {
        return category;
    }

    public float getOriginalPrice() {
        return originalPrice;
    }

    public float getSalePrice() {
        return salePrice;
    }

    public int getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public void setOriginalPrice(float originalPrice) {
        this.originalPrice = originalPrice;
    }

    public void setSalePrice(float salePrice) {
        this.salePrice = salePrice;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
        
        
	

}
