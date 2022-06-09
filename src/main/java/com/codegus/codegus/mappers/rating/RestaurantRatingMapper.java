package com.codegus.codegus.mappers.rating;

import com.codegus.codegus.mappers.BaseMapper;
import com.codegus.codegus.models.apply.rating.RestaurantRating;
import com.codegus.codegus.dtos.rating.RatingDto;
import com.codegus.codegus.dtos.rating.RatingItem;
import com.codegus.codegus.dtos.rating.RatingRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


@Mapper(componentModel = "spring")
public interface RestaurantRatingMapper extends BaseMapper<RestaurantRating, RatingItem, RatingDto, RatingRequest> {

    @Override
    @Mappings({
            @Mapping(source = "userId", target = "user.id"),
            @Mapping(source = "foreignKey", target = "restaurant.id")
    })
    RestaurantRating requestToEntity(RatingRequest request);

    @Override
    @Mappings({
            @Mapping(source = "restaurant.id", target = "foreignKey")
    })
    RatingDto entityToDto(RestaurantRating entity);

}
