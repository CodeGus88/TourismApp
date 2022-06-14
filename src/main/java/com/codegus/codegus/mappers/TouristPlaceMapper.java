package com.codegus.codegus.mappers;

import com.codegus.codegus.models.apply.TouristPlace;
import com.codegus.codegus.dtos.touristplace.TouristPlaceDto;
import com.codegus.codegus.dtos.touristplace.TouristPlaceItem;
import com.codegus.codegus.dtos.touristplace.TouristPlaceRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface TouristPlaceMapper extends BaseMapper<TouristPlace, TouristPlaceItem, TouristPlaceDto, TouristPlaceRequest> {

    @Override
    TouristPlace requestToEntity(TouristPlaceRequest request);

    @Override
    TouristPlaceDto entityToDto(TouristPlace entity);

    @Override
    @Mappings({
            @Mapping(expression = "java(entity.getLikes()==null?0L:entity.getLikes().size())", target = "totalLikes")
    })
    TouristPlaceItem entityToItem(TouristPlace entity);
}
