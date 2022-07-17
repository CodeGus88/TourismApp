package com.codegus.codegus.repositories.apply.address;

import com.codegus.codegus.models.apply.address.TravelAgencyAddress;
import com.codegus.codegus.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface TravelAgencyAddressRepository extends BaseRepository<TravelAgencyAddress, UUID> {

    List<TravelAgencyAddress> findByTravelAgencyId(UUID id);

}
