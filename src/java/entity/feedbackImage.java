/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author aDMIN
 */
public class feedbackImage {
    private int id;
    private String image;
    private int feedbackId;

    public feedbackImage(int id, String image, int feedbackId) {
        this.id = id;
        this.image = image;
        this.feedbackId = feedbackId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
    }

    @Override
    public String toString() {
        return "feedbackImage{" + "id=" + id + ", image=" + image + ", feedbackId=" + feedbackId + '}';
    }
    
}
