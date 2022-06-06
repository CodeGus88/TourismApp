package com.codegus.codegus.repositories.apply.rating;

import com.codegus.codegus.models.rating.TravelAgencyRating;
import com.codegus.codegus.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TravelAgencyRatingRepository extends BaseRepository<TravelAgencyRating, UUID> {



}
