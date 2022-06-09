package com.codegus.codegus.dtos.rating;

import java.util.UUID;

public class RatingItem {

    private float punctuation;

    private UUID foreignKey;

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

    @Override
    public String toString() {
        return "RatingItem{" +
                "punctuation=" + punctuation +
                ", foreignKey=" + foreignKey +
                '}';
    }
}
