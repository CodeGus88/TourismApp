package com.codegus.codegus.models.phones;

import com.codegus.codegus.models.BaseModel;
import com.codegus.codegus.models.assistance.Assistance;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "phones")
public class Phone extends BaseModel<UUID> {

    @Column(name = "phone")
    private String phone;

    @ManyToOne
    @JoinColumn(name = "assistance_id")
    private Assistance assistance;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Assistance getService() {
        return assistance;
    }

    public void setService(Assistance assistance) {
        this.assistance = assistance;
    }
}
