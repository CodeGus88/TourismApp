package com.codegus.codegus.mappers;

import com.codegus.codegus.models.apply.Restaurant;
import com.codegus.codegus.dtos.restaurant.RestaurantDto;
import com.codegus.codegus.dtos.restaurant.RestaurantItem;
import com.codegus.codegus.dtos.restaurant.RestaurantRequest;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface RestaurantMapper extends BaseMapper<Restaurant, RestaurantItem, RestaurantDto, RestaurantRequest>{

    @Override
    Restaurant requestToEntity(RestaurantRequest request);

    @Override
    RestaurantDto entityToDto(Restaurant entity);

}
