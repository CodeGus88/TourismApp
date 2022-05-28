package com.codegus.codegus.mappers;

import com.codegus.codegus.models.touristplace.TouristPlace;
import com.codegus.codegus.models.touristplace.dto.TouristPlaceDto;
import com.codegus.codegus.models.touristplace.dto.TouristPlaceItem;
import com.codegus.codegus.models.touristplace.dto.TouristPlaceRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TouristPlaceMapper extends BaseMapper<TouristPlace, TouristPlaceItem, TouristPlaceDto, TouristPlaceRequest> {

    /*
    Se puede sobreescribir los métodos abstractos para personalizar en cada caso
    @Override
    TouristPlace requestToEntity(TouristPlaceRequest request);

    @Override
    TouristPlaceDto entityToDto(TouristPlace entity);

    @Override
    List<TouristPlaceItem> entityListToItemList(List<TouristPlace> entityList);
    */
}
