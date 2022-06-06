package com.codegus.codegus.repositories.apply;

import com.codegus.codegus.models.travelagence.TravelAgency;
import com.codegus.codegus.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TravelAgenceRepository extends BaseRepository<TravelAgency, UUID> {
    
}
