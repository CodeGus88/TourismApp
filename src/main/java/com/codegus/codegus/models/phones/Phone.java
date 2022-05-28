package com.codegus.codegus.models.phones;

import com.codegus.codegus.models.BaseModel;
import com.codegus.codegus.models.services.Service;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "phones")
public class Phone extends BaseModel<UUID> {

    @Column(name = "phone")
    private String phone;

    @ManyToOne
    @JoinColumn(name = "service_id")
    private Service service;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
