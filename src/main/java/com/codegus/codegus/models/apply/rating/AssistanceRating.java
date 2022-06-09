package com.codegus.codegus.models.apply.rating;

import com.codegus.codegus.models.apply.Assistance;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "assistance_rating")
public class AssistanceRating extends BaseRating<UUID>{

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
