package com.codegus.codegus.mappers;

import com.codegus.codegus.models.like.Like;
import com.codegus.codegus.models.like.dto.LikeDto;
import com.codegus.codegus.models.like.dto.LikeItem;
import com.codegus.codegus.models.like.dto.LikeRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LikeMapper extends BaseMapper<Like, LikeItem, LikeDto, LikeRequest>{

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

    @Override
    List<LikeItem> entityListToItemList(List<Like> entityList);


}
