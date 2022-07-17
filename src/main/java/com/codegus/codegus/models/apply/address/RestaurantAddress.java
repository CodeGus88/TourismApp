package com.codegus.codegus.models.apply.address;

import com.codegus.codegus.models.apply.Restaurant;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "restaurant_addresses")
public class RestaurantAddress extends Address<UUID> {

    @Column(name = "branch_name")
    private String branchName; // sucursal

    @ManyToOne(fetch = FetchType.LAZY)
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
