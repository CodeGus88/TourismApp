package com.codegus.codegus.models.apply.rating;

import com.codegus.codegus.models.BaseModel;
import com.codegus.codegus.models.apply.User;
import javax.persistence.*;

@MappedSuperclass
public class BaseRating<ID> extends BaseModel<ID> {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "punctuation")
    private float punctuation; // estará solo entre 1 - 5

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public float getPunctuation() {
        return punctuation;
    }

    public void setPunctuation(float punctuation) {
        this.punctuation = punctuation;
    }
}
