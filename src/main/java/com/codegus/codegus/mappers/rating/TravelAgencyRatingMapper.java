package com.codegus.codegus.mappers.rating;

import com.codegus.codegus.mappers.BaseMapper;
import com.codegus.codegus.models.rating.TravelAgencyRating;
import com.codegus.codegus.models.rating.dto.RatingDto;
import com.codegus.codegus.models.rating.dto.RatingItem;
import com.codegus.codegus.models.rating.dto.RatingRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TravelAgencyRatingMapper extends BaseMapper<TravelAgencyRating, RatingItem, RatingDto, RatingRequest> {

    @Override
    @Mappings({
            @Mapping(source = "userId", target = "user.id"),
            @Mapping(source = "foreignKey", target = "travelAgency.id")
    })
    TravelAgencyRating requestToEntity(RatingRequest request);

    @Override
    @Mappings({
            @Mapping(source = "travelAgency.id", target = "foreignKey")
    })
    RatingDto entityToDto(TravelAgencyRating entity);

    @Override
    List<RatingItem> entityListToItemList(List<TravelAgencyRating> entityList);

}
