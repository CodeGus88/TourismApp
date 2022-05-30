package com.codegus.codegus.models.restaurant;

import com.codegus.codegus.models.BaseBusinessInformationModel;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "restaurants")
public class Restaurant extends BaseBusinessInformationModel<UUID> {

//    Implementar las propiedades para restaurante (menu)

}
