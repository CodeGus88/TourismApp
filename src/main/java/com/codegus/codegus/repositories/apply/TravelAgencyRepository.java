package com.codegus.codegus.repositories.apply;

import com.codegus.codegus.models.travelagency.TravelAgency;
import com.codegus.codegus.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TravelAgencyRepository extends BaseRepository<TravelAgency, UUID> {



}
