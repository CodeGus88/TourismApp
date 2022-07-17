package com.codegus.codegus.dtos.restaurant;

//import com.codegus.codegus.dtos.address.AddressDto;
import com.codegus.codegus.dtos.address.AddressItem;
import com.codegus.codegus.dtos.rating.RatingItem;
import com.codegus.codegus.models.apply.rating.RestaurantRating;

import java.util.List;
import java.util.UUID;

public class RestaurantItem {

    private UUID id;

    private String name;

    private String imageUrl;

    private boolean isPublic;

    private String description;

    private String keyWords;

    private String category;

    private String address;

    private List<RatingItem> rating;

    private List<AddressItem> addressItems;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //    public AddressDto getAddress() {
//        return address;
//    }
//
//    public void setAddress(AddressDto address) {
//        this.address = address;
//    }

    public List<RatingItem> getRating() {
        return rating;
    }

    public void setRating(List<RatingItem> rating) {
        this.rating = rating;
    }

    public List<AddressItem> getAddressItems() {
        return addressItems;
    }

    public void setAddressItems(List<AddressItem> addressItems) {
        this.addressItems = addressItems;
    }

    @Override
    public String toString() {
        return "RestaurantItem{" +
                ", name='" + name + '\'' +
                ", keyWords='" + keyWords + '\'' +
                ", category='" + category + '\'' +
                ", address=" + address +
                ", rating=" + rating +
                '}';
    }
}
