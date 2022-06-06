package com.codegus.codegus.models.socialmedia;

import com.codegus.codegus.models.BaseModel;
import javax.persistence.*;

@MappedSuperclass
public class SocialMedia<ID> extends BaseModel<ID> {

    @Column(name = "name")
    private String name;

    @Column(name = "url")
    private String url;

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

}
