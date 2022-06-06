package com.codegus.codegus.models.rating;

import com.codegus.codegus.models.restaurant.Restaurant;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "restaurant_rating")
public class RestaurantRating extends BaseRating<UUID>{

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
