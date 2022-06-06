package com.codegus.codegus.models.address;

import com.codegus.codegus.models.assistance.Assistance;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "assistance_addresses")
public class AssistanceAddress extends Address<UUID> {

    @Column(name = "branch_name")
    private String branchName; // sucursal

    @ManyToOne
    @JoinColumn(name = "assistance_id")
    private Assistance assistance;

    public String getBranchName() {
        return branchName;
    }

    public void setBranch_name(String branchName) {
        this.branchName = branchName;
    }

    public Assistance getAssistance() {
        return assistance;
    }

    public void setAssistance(Assistance assistance) {
        this.assistance = assistance;
    }

}
