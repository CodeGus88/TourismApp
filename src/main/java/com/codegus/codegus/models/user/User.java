package com.codegus.codegus.models.user;

import com.codegus.codegus.models.BaseModel;
import com.codegus.codegus.models.services.Service;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "users")
public class User extends BaseModel<UUID> {

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String  password;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Service> services;

}
