package com.codegus.codegus.repositories.apply;

import com.codegus.codegus.models.apply.Restaurant;
import com.codegus.codegus.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RestaurantRepository extends BaseRepository<Restaurant, UUID> {


}
