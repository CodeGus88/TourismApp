package com.codegus.codegus.models.apply;

import com.codegus.codegus.models.BaseModel;
import com.codegus.codegus.models.apply.Assistance;
import javax.persistence.*;
import java.util.List;
import java.util.UUID;

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
    private List<Assistance> assistants;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Assistance> getAssistants() {
        return assistants;
    }

    public void setAssistants(List<Assistance> assistants) {
        this.assistants = assistants;
    }
}
