package com.codegus.codegus.dtos.phone;

import java.util.UUID;

public class PhoneItem {

    private UUID id;

    private String phone;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "PhoneItem{" +
                ", phone='" + phone +
                '}';
    }
}
