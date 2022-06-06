package com.codegus.codegus.services.touristplace;

import com.codegus.codegus.mappers.TouristPlaceMapper;
import com.codegus.codegus.models.touristplace.TouristPlace;
import com.codegus.codegus.models.touristplace.dto.TouristPlaceDto;
import com.codegus.codegus.models.touristplace.dto.TouristPlaceItem;
import com.codegus.codegus.models.touristplace.dto.TouristPlaceRequest;
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
