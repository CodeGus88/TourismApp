package com.codegus.codegus.repositories.apply.address;

import com.codegus.codegus.models.apply.address.TouristPlaceAddress;
import com.codegus.codegus.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface TouristPlaceAddressRepository extends BaseRepository<TouristPlaceAddress, UUID> {

    List<TouristPlaceAddress> findByTouristPlaceId(UUID touristPlaceId);

}
