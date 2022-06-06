package com.codegus.codegus.models.user.dto;

import java.util.UUID;

public class UserItem {

    private UUID id;

    private String userName;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
