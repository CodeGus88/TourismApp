package com.codegus.codegus.models.apply;

import com.codegus.codegus.models.BaseBusinessInformationModel;
import com.codegus.codegus.models.apply.address.AssistanceAddress;
import com.codegus.codegus.models.apply.phones.AssistancePhone;
import com.codegus.codegus.models.apply.socialmedia.AssistanceSocialMedia;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "assistance")
public class Assistance extends BaseBusinessInformationModel<UUID> {

    @Column(name = "category")
    private String category; // balneario, supermercado, etc

    @OneToMany(mappedBy = "assistance")
    private List<AssistancePhone> assistancePhone;

    @OneToMany(mappedBy = "assistance")
    private List<AssistanceSocialMedia> socialMedias;

    @OneToMany(mappedBy = "assistance")
    private List<AssistanceAddress> addresses;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<AssistancePhone> getAssistancePhone() {
        return assistancePhone;
    }

    public void setAssistancePhone(List<AssistancePhone> assistancePhone) {
        this.assistancePhone = assistancePhone;
    }

    public List<AssistanceSocialMedia> getSocialMedias() {
        return socialMedias;
    }

    public void setSocialMedias(List<AssistanceSocialMedia> socialMedias) {
        this.socialMedias = socialMedias;
    }

    public List<AssistanceAddress> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AssistanceAddress> addresses) {
        this.addresses = addresses;
    }
}
