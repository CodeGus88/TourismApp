package com.codegus.codegus.models.apply.socialmedia;

import com.codegus.codegus.models.apply.Restaurant;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "restaurant_social_medias")
public class RestaurantSocialMedia extends SocialMedia<UUID>{

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}
