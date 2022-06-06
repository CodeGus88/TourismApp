package com.codegus.codegus.models.travelagence;

import com.codegus.codegus.models.BaseBusinessInformationModel;
import com.codegus.codegus.models.phones.TravelAgencyPhone;
import com.codegus.codegus.models.socialmedia.TravelAgencySocialMedia;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "travel_agencies")
public class TravelAgency extends BaseBusinessInformationModel<UUID> {

    // implementar  catálogo de lugares de destinos (touristPlaces)

    @OneToMany(mappedBy = "travelAgency")
    private List<TravelAgencyPhone> phones;

    @OneToMany(mappedBy = "travelAgency")
    private List<TravelAgencySocialMedia> socialMedias;

    public List<TravelAgencyPhone> getPhones() {
        return phones;
    }

    public void setPhones(List<TravelAgencyPhone> phones) {
        this.phones = phones;
    }

    public List<TravelAgencySocialMedia> getSocialMedias() {
        return socialMedias;
    }

    public void setSocialMedias(List<TravelAgencySocialMedia> socialMedias) {
        this.socialMedias = socialMedias;
    }

}
