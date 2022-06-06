package com.codegus.codegus.models.address.dto;

import com.codegus.codegus.models.address.Address;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "simple_address")
public class SimpleAddress extends Address<UUID>{



}
