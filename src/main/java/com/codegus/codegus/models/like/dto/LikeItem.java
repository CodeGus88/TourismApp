package com.codegus.codegus.models.like.dto;

import java.util.UUID;

public class LikeItem {

    private UUID userId;

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }
}
