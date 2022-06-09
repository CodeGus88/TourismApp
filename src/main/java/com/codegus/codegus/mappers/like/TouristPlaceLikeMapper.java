package com.codegus.codegus.mappers.like;

import com.codegus.codegus.mappers.BaseMapper;
import com.codegus.codegus.models.apply.Like;
import com.codegus.codegus.dtos.like.LikeDto;
import com.codegus.codegus.dtos.like.LikeItem;
import com.codegus.codegus.dtos.like.LikeRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


@Mapper(componentModel = "spring")
public interface TouristPlaceLikeMapper extends BaseMapper<Like, LikeItem, LikeDto, LikeRequest> {

    @Override
    @Mappings({
            @Mapping(source = "foreignKey", target = "touristPlace.id"),
            @Mapping(source = "userId", target = "user.id")
    })
    Like requestToEntity(LikeRequest request);

    @Override
    @Mappings({
            @Mapping(source = "touristPlace.id", target = "foreignKey"),
            @Mapping(source = "user.id", target = "userId")
    })
    LikeDto entityToDto(Like entity);

}
