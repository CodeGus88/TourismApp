package com.codegus.codegus.services.touristplace;

import com.codegus.codegus.mappers.TouristPlaceMapper;
import com.codegus.codegus.models.apply.TouristPlace;
import com.codegus.codegus.dtos.touristplace.TouristPlaceDto;
import com.codegus.codegus.dtos.touristplace.TouristPlaceItem;
import com.codegus.codegus.dtos.touristplace.TouristPlaceRequest;
import com.codegus.codegus.repositories.apply.TouristPlaceRepository;
import com.codegus.codegus.services.BaseServiceImpl;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class TouristPlaceServiceImpl extends
        BaseServiceImpl<TouristPlace, UUID, TouristPlaceItem, TouristPlaceDto, TouristPlaceRequest, TouristPlaceRepository, TouristPlaceMapper>
        implements TouristPlaceService
{
    // sobreescribir métodos implementados
}
