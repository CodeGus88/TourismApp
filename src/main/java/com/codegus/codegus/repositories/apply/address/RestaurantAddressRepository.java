package com.codegus.codegus.repositories.apply.address;

import com.codegus.codegus.models.apply.address.RestaurantAddress;
import com.codegus.codegus.repositories.BaseRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface RestaurantAddressRepository extends BaseRepository<RestaurantAddress, UUID> {



}
