package com.codegus.codegus.dtos.touristplace;

import com.codegus.codegus.dtos.address.AddressItem;
import com.codegus.codegus.models.apply.Like;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class TouristPlaceItem {

    private UUID id;

    private String name;

    private String imageUrl;

    private String category;

    private String resume;

    private AddressItem address;

    private LocalDateTime createdAt;

    private Long totalLikes;

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

    public Long getTotalLikes() {
        return totalLikes;
    }

    public void setTotalLikes(Long totalLikes) {
        this.totalLikes = totalLikes;
    }

    @Override
    public String toString() {
        return "TouristPlaceItem{" +
                "name='" + name + '\'' +
                ", createdAt=" + createdAt +
                ", category='" + category + '\'' +
                ", address=" + address +
                '}';
    }
}
