package com.codegus.codegus.repositories.apply;


import com.codegus.codegus.models.apply.TouristPlace;
import com.codegus.codegus.repositories.BaseRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface TouristPlaceRepository extends BaseRepository<TouristPlace, UUID> {
//    Métodos de TuristPlaceRepository
}
