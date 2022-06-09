package com.codegus.codegus.mappers;

import com.codegus.codegus.models.apply.TouristPlace;
import com.codegus.codegus.dtos.touristplace.TouristPlaceDto;
import com.codegus.codegus.dtos.touristplace.TouristPlaceItem;
import com.codegus.codegus.dtos.touristplace.TouristPlaceRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TouristPlaceMapper extends BaseMapper<TouristPlace, TouristPlaceItem, TouristPlaceDto, TouristPlaceRequest> {

    @Override
    TouristPlace requestToEntity(TouristPlaceRequest request);

    @Override
    TouristPlaceDto entityToDto(TouristPlace entity);

}
