package com.codegus.codegus.models.apply.phones;

import com.codegus.codegus.models.apply.Assistance;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "assistance_phones")
public class AssistancePhone extends Phone<UUID>{

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
