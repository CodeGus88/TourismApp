package com.codegus.codegus.models.services;

import com.codegus.codegus.models.BaseModelCommon;
import com.codegus.codegus.models.phones.Phone;
import com.codegus.codegus.models.socialmedia.SocialMedia;
import com.codegus.codegus.models.user.User;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "services")
public class Service extends BaseModelCommon<UUID> {

    @Column(name = "category")
    private String category; // restaurante, balneario, supermercado, etc, agencia de viaje, etc

    @Column(name = "email")
    private String email;

    @Column(name = "website")
    private String website;

    @Column(name = "service_opening_information")
    private String serviceOpeningInformation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "service")
    private List<Phone> phones;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "service")
    private List<SocialMedia> socialMedia;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getServiceOpeningInformation() {
        return serviceOpeningInformation;
    }

    public void setServiceOpeningInformation(String serviceOpeningInformation) {
        this.serviceOpeningInformation = serviceOpeningInformation;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public List<SocialMedia> getSocialMedia() {
        return socialMedia;
    }

    public void setSocialMedia(List<SocialMedia> socialMedia) {
        this.socialMedia = socialMedia;
    }
}
