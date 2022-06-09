package com.codegus.codegus.models.apply;

import com.codegus.codegus.models.BaseBusinessInformationModel;
import com.codegus.codegus.models.apply.address.TravelAgencyAddress;
import com.codegus.codegus.models.apply.phones.TravelAgencyPhone;
import com.codegus.codegus.models.apply.rating.TravelAgencyRating;
import com.codegus.codegus.models.apply.socialmedia.TravelAgencySocialMedia;

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

    @OneToMany(mappedBy = "travelAgency")
    private List<TravelAgencyAddress> addresses;

    @OneToMany(mappedBy = "travelAgency")
    private List<TravelAgencyRating> rating;

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

    public List<TravelAgencyAddress> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<TravelAgencyAddress> addresses) {
        this.addresses = addresses;
    }

    public List<TravelAgencyRating> getRating() {
        return rating;
    }

    public void setRating(List<TravelAgencyRating> rating) {
        this.rating = rating;
    }
}
