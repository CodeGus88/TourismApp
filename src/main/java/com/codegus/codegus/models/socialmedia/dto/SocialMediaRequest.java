package com.codegus.codegus.models.socialmedia.dto;

import java.util.UUID;

public class SocialMediaRequest {

    private String name;

    private String url;

    private UUID foreignKey;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public UUID getForeignKey() {
        return foreignKey;
    }

    public void setForeignKey(UUID foreignKey) {
        this.foreignKey = foreignKey;
    }
}
