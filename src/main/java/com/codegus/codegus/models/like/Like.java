package com.codegus.codegus.models.like;

import com.codegus.codegus.models.BaseModel;
import com.codegus.codegus.models.touristplace.TouristPlace;
import com.codegus.codegus.models.user.User;
import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "likes")
public class Like extends BaseModel<UUID> {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tourist_place_id")
    private TouristPlace touristPlace;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    public TouristPlace getTouristPlace() {
        return touristPlace;
    }

    public void setTouristPlace(TouristPlace touristPlace) {
        this.touristPlace = touristPlace;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
