package com.codegus.codegus.models.address;

import com.codegus.codegus.models.restaurant.Restaurant;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "restaurant_addresses")
public class RestaurantAddress extends Address<UUID> {

    @Column(name = "branch_name")
    private String branchName; // sucursal

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}
