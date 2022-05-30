package com.codegus.codegus.models.phones.dto;

import java.util.UUID;

public class PhoneRequest {

    private String phone;

    private UUID serviceId;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public UUID getServiceId() {
        return serviceId;
    }

    public void setServiceId(UUID serviceId) {
        this.serviceId = serviceId;
    }
}
