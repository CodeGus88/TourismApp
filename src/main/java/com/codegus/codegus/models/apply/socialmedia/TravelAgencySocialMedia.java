package com.codegus.codegus.models.apply.socialmedia;

import com.codegus.codegus.models.apply.TravelAgency;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "travel_agency_social_medias")
public class TravelAgencySocialMedia extends SocialMedia<UUID> {

    @ManyToOne
    @JoinColumn(name = "travel_agency_id")
    private TravelAgency travelAgency;

    public TravelAgency getTravelAgency() {
        return travelAgency;
    }

    public void setTravelAgency(TravelAgency travelAgency) {
        this.travelAgency = travelAgency;
    }
}
