package com.codegus.codegus.repositories.turistplace;


import com.codegus.codegus.models.touristplace.TouristPlace;
import com.codegus.codegus.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TouristPlaceRepository extends BaseRepository<TouristPlace, UUID> {
//    Implementar métodos de TuristPlaceRepository
}
