package com.codegus.codegus.models.socialmedia;

import com.codegus.codegus.models.BaseModel;
import com.codegus.codegus.models.assistance.Assistance;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "social_media")
public class SocialMedia extends BaseModel<UUID> {

    @Column(name = "name")
    private String name;

    @Column(name = "url")
    private String url;

    @ManyToOne
    @JoinColumn(name = "service_id")
    private Assistance assistance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
