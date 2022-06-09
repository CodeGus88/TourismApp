package com.codegus.codegus.services.touristplace;

import com.codegus.codegus.models.apply.TouristPlace;
import com.codegus.codegus.dtos.touristplace.TouristPlaceDto;
import com.codegus.codegus.dtos.touristplace.TouristPlaceItem;
import com.codegus.codegus.dtos.touristplace.TouristPlaceRequest;
import com.codegus.codegus.services.BaseService;

import java.util.UUID;


public interface TouristPlaceService extends BaseService<TouristPlace, UUID, TouristPlaceItem, TouristPlaceDto, TouristPlaceRequest> {

    // Métodos propios de TouristPlaceService

}
