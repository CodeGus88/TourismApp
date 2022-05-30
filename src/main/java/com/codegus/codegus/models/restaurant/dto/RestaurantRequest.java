package com.codegus.codegus.models.restaurant.dto;

import com.codegus.codegus.models.address.dto.AddressDto;
import com.codegus.codegus.models.phones.Phone;
import com.codegus.codegus.models.socialmedia.SocialMedia;
import com.codegus.codegus.models.user.User;

import java.util.List;

public class RestaurantRequest {

    private String name;

    private String imageUrl;

    private boolean isPublic;

    private String description;

    private String keyWords;

    private String category;

    private String email;

    private String website;

    private String serviceOpeningInformation;

    private User user;

    private List<Phone> phones;

    private List<SocialMedia> socialMedia;

    private AddressDto address;


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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getServiceOpeningInformation() {
        return serviceOpeningInformation;
    }

    public void setServiceOpeningInformation(String serviceOpeningInformation) {
        this.serviceOpeningInformation = serviceOpeningInformation;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public List<SocialMedia> getSocialMedia() {
        return socialMedia;
    }

    public void setSocialMedia(List<SocialMedia> socialMedia) {
        this.socialMedia = socialMedia;
    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }
}
