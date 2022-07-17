package com.codegus.codegus.models.apply.address;


import com.codegus.codegus.models.apply.TouristPlace;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "tourist_place_addresses")
public class TouristPlaceAddress extends Address<UUID>{

    @Column(name = "branch_name")
    private String branchName; // sucursal

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name  = "tourist_place_id")
    private TouristPlace touristPlace;

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public TouristPlace getTouristPlace() {
        return touristPlace;
    }

    public void setTouristPlace(TouristPlace touristPlace) {
        this.touristPlace = touristPlace;
    }

}
