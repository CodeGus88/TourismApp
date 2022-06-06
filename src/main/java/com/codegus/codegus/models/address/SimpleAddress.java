package com.codegus.codegus.models.address;


import com.codegus.codegus.models.touristplace.TouristPlace;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "addresses")
public class SimpleAddress extends Address<UUID>{

    @ManyToOne
    @JoinColumn(name  = "tourist_place_id")
    private TouristPlace touristPlace;

    public TouristPlace getTouristPlace() {
        return touristPlace;
    }

    public void setTouristPlace(TouristPlace touristPlace) {
        this.touristPlace = touristPlace;
    }

}
