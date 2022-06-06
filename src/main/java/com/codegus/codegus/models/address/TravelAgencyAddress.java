package com.codegus.codegus.models.address;

import com.codegus.codegus.models.travelagency.TravelAgency;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "travel_agency_addresses")
public class TravelAgencyAddress extends Address<UUID> {

    @Column(name = "branch_name")
    private String branchName; // sucursal

    @ManyToOne
    @JoinColumn(name = "travel_agency_id")
    private TravelAgency travelAgency;

    public String getBranchName() {
        return branchName;
    }

    public void setBranch_name(String branchName) {
        this.branchName = branchName;
    }

    public TravelAgency getTravelAgency() {
        return travelAgency;
    }

    public void setTravelAgency(TravelAgency travelAgency) {
        this.travelAgency = travelAgency;
    }
}
