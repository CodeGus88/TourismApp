package com.codegus.codegus.models.socialmedia;

import com.codegus.codegus.models.assistance.Assistance;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "assistance_social_medias")
public class AssistanceSocialMedia extends SocialMedia<UUID> {

    @ManyToOne
    @JoinColumn(name = "assistance_id")
    private Assistance assistance;

    public Assistance getAssistance() {
        return assistance;
    }

    public void setAssistance(Assistance assistance) {
        this.assistance = assistance;
    }
}
