package com.codegus.codegus.models.assistance;

import com.codegus.codegus.models.BaseBusinessInformationModel;
import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "services")
public class Assistance extends BaseBusinessInformationModel<UUID> {

    @Column(name = "category")
    private String category; // balneario, supermercado, agencia de viaje, etc

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
