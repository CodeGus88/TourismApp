package com.codegus.codegus.models.rating.dto;

import com.codegus.codegus.models.user.dto.UserItem;

import java.util.UUID;

public class RatingDto {

    private UserItem user;

    private float punctuation;

    private UUID foreignKey;

    public UserItem getUser() {
        return user;
    }

    public void setUser(UserItem user) {
        this.user = user;
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
