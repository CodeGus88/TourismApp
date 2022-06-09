package com.codegus.codegus.dtos.touristplace;

import com.codegus.codegus.dtos.address.AddressRequest;

public class TouristPlaceRequest {

    private String name;

    private String imageUrl;

    private String category;

    private String resume;

    private String description;

    private AddressRequest address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AddressRequest getAddress() {
        return address;
    }

    public void setAddress(AddressRequest address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "TouristPlaceRequest{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
