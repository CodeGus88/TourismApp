package com.codegus.codegus.models.touristplace.dto;

import com.codegus.codegus.models.address.dto.AddressItem;
import com.codegus.codegus.models.like.Like;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class TouristPlaceItem {

    private UUID id;

    private String name;

    private String imageUrl;

    private String category;

    private String resume;

    private List<Like> likes;

    private AddressItem address;

    private LocalDateTime createdAt;

    public TouristPlaceItem(){

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

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

    public List<Like> getVotes() {
        return likes;
    }

    public void setVotes(List<Like> likes) {
        this.likes = likes;
    }

    public AddressItem getAddress() {
        return address;
    }

    public void setAddress(AddressItem address) {
        this.address = address;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
