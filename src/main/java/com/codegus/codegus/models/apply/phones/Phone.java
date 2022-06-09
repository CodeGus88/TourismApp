package com.codegus.codegus.models.apply.phones;

import com.codegus.codegus.models.BaseModel;

import javax.persistence.*;

@MappedSuperclass
public class Phone<ID> extends BaseModel<ID> {

    @Column(name = "phone")
    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
