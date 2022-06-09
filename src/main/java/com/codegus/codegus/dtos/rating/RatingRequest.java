package com.codegus.codegus.dtos.rating;

import java.util.UUID;

public class RatingRequest {

    private UUID userId;

    private float punctuation;

    private UUID foreignKey;

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public float getPunctuation() {
        return punctuation;
    }

    public void setPunctuation(float punctuation) {
        this.punctuation = punctuation;
    }

    public UUID getForeignKey() {
        return foreignKey;
    }

    public void setForeignKey(UUID foreignKey) {
        this.foreignKey = foreignKey;
    }
}
