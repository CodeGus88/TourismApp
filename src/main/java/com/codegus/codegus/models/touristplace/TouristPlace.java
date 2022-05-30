package com.codegus.codegus.models.touristplace;

import com.codegus.codegus.models.BaseCommonModel;
import com.codegus.codegus.models.vote.Vote;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tourist_places")
public class TouristPlace extends BaseCommonModel<UUID> {

    @Column(name = "category")
    private String category;

    @Column(name = "resume")
    private String resume;

    @OneToMany(mappedBy = "touristPlace", fetch = FetchType.LAZY)
    private List<Vote> votes;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public List<Vote> getVotes() {
        return votes;
    }

    public void setVotes(List<Vote> votes) {
        this.votes = votes;
    }

}
