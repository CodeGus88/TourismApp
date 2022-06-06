package com.codegus.codegus.repositories.apply;

import com.codegus.codegus.models.address.Address;
import com.codegus.codegus.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AddressRepository extends BaseRepository<Address, UUID> {



}
