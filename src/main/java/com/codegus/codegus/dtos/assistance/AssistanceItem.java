package com.codegus.codegus.dtos.assistance;

import com.codegus.codegus.dtos.address.AddressDto;

import java.util.UUID;

public class AssistanceItem {

    private UUID id;

    private String name;

    private String imageUrl;

    private boolean isPublic;

    private String description;

    private String keyWords;

    private String category;

    private AddressDto address;

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

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "AssistanceItem{" +
                ", name='" + name + '\''+
                ", keyWords='" + keyWords + '\'' +
                ", category='" + category + '\'' +
                ", address=" + address +
                '}';
    }
}
