package com.codegus.codegus.dtos.like;

import java.util.UUID;

public class LikeItem {

    private UUID userId;

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }


    @Override
    public String toString() {
        return "LikeItem{" +
                "userId=" + userId +
                '}';
    }
}
