package com.codegus.codegus.dtos.like;

import java.util.UUID;

public class LikeRequest {

    private UUID foreignKey;

    private UUID userId;

    public UUID getForeignKey() {
        return foreignKey;
    }

    public void setForeignKey(UUID foreignKey) {
        this.foreignKey = foreignKey;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }
}
