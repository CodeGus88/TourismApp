package com.codegus.codegus.dtos.phone;

import java.util.UUID;

public class PhoneRequest {

    private String phone;

    private UUID foreignKey;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public UUID getForeignKey() {
        return foreignKey;
    }

    public void setForeignKey(UUID foreignKey) {
        this.foreignKey = foreignKey;
    }

}
