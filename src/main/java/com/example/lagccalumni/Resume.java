package com.example.lagccalumni;

public class Resume {
    private String description;
    private Integer image;

    public Resume(String description, Integer image) {
        this.description = description;
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }
}
