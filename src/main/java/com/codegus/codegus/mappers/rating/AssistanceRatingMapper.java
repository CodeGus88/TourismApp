package com.codegus.codegus.mappers.rating;

import com.codegus.codegus.mappers.BaseMapper;
import com.codegus.codegus.models.rating.AssistanceRating;
import com.codegus.codegus.models.rating.dto.RatingDto;
import com.codegus.codegus.models.rating.dto.RatingItem;
import com.codegus.codegus.models.rating.dto.RatingRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AssistanceRatingMapper extends BaseMapper<AssistanceRating, RatingItem, RatingDto, RatingRequest> {

    @Override
    @Mappings({
            @Mapping(source = "userId", target = "user.id"),
            @Mapping(source = "foreignKey", target = "assistance.id")
    })
    AssistanceRating requestToEntity(RatingRequest request);

    @Override
    @Mappings({
            @Mapping(source = "assistance.id", target = "foreignKey")
    })
    RatingDto entityToDto(AssistanceRating entity);

    @Override
    List<RatingItem> entityListToItemList(List<AssistanceRating> entityList);

}
