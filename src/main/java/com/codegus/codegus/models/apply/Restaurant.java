package com.codegus.codegus.models.apply;

import com.codegus.codegus.models.BaseBusinessInformationModel;
import com.codegus.codegus.models.apply.address.RestaurantAddress;
import com.codegus.codegus.models.apply.phones.RestaurantPhone;
import com.codegus.codegus.models.apply.rating.RestaurantRating;
import com.codegus.codegus.models.apply.socialmedia.RestaurantSocialMedia;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "restaurants")
public class Restaurant extends BaseBusinessInformationModel<UUID> {

    //    Implementar las propiedades para restaurante (menu)

    @OneToMany(mappedBy = "restaurant")
    private List<RestaurantPhone> phones;

    @OneToMany(mappedBy = "restaurant")
    private List<RestaurantSocialMedia> socialMedias;

    @OneToMany(mappedBy = "restaurant")
    private List<RestaurantRating> rating;

    @OneToMany(mappedBy = "restaurant")
    private List<RestaurantAddress> addresses;

    public List<RestaurantPhone> getPhones() {
        return phones;
    }

    public void setPhones(List<RestaurantPhone> phones) {
        this.phones = phones;
    }

    public List<RestaurantSocialMedia> getSocialMedia() {
        return socialMedias;
    }

    public void setSocialMedia(List<RestaurantSocialMedia> socialMedias) {
        this.socialMedias = socialMedias;
    }

    public List<RestaurantSocialMedia> getSocialMedias() {
        return socialMedias;
    }

    public void setSocialMedias(List<RestaurantSocialMedia> socialMedias) {
        this.socialMedias = socialMedias;
    }

    public List<RestaurantRating> getRating() {
        return rating;
    }

    public void setRating(List<RestaurantRating> rating) {
        this.rating = rating;
    }

    public List<RestaurantAddress> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<RestaurantAddress> addresses) {
        this.addresses = addresses;
    }
}
