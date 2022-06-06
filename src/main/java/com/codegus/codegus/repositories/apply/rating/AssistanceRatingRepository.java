package com.codegus.codegus.repositories.apply.rating;

import com.codegus.codegus.models.rating.AssistanceRating;
import com.codegus.codegus.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AssistanceRatingRepository extends BaseRepository<AssistanceRating, UUID> {



}
