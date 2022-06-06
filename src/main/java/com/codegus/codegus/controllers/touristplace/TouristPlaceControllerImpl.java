package com.codegus.codegus.controllers.touristplace;

import com.codegus.codegus.controllers.BaseControllerImpl;
import com.codegus.codegus.mappers.TouristPlaceMapper;
import com.codegus.codegus.models.touristplace.TouristPlace;
import com.codegus.codegus.models.touristplace.dto.TouristPlaceDto;
import com.codegus.codegus.models.touristplace.dto.TouristPlaceItem;
import com.codegus.codegus.models.touristplace.dto.TouristPlaceRequest;
import com.codegus.codegus.repositories.apply.TouristPlaceRepository;
import com.codegus.codegus.services.BaseServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("api/tourist-place")
@RestController
public class TouristPlaceControllerImpl
        extends BaseControllerImpl<TouristPlace, UUID, TouristPlaceItem,
        TouristPlaceDto, TouristPlaceRequest, TouristPlaceRepository, TouristPlaceMapper,
        BaseServiceImpl<TouristPlace, UUID, TouristPlaceItem, TouristPlaceDto, TouristPlaceRequest,
        TouristPlaceRepository, TouristPlaceMapper>
        >
        implements TouristPlaceController {



}
