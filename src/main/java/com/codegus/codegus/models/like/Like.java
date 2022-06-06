package com.codegus.codegus.models.vote;

import com.codegus.codegus.models.BaseModel;
import com.codegus.codegus.models.touristplace.TouristPlace;
import com.codegus.codegus.models.user.User;
import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "votes")
public class Vote extends BaseModel<UUID> {

    @ManyToOne
    @JoinColumn(name = "tourist_place_id")
    private TouristPlace touristPlace;

    @OneToOne()
    @JoinColumn(name = "user_id")
    private User user;

}
