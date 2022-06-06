package com.codegus.codegus.repositories.apply.address;

import com.codegus.codegus.models.address.AssistanceAddress;
import com.codegus.codegus.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AssistanceAddressRepository extends BaseRepository<AssistanceAddress, UUID> {



}
