package com.codegus.codegus.mappers;

import com.codegus.codegus.models.restaurant.Restaurant;
import com.codegus.codegus.models.restaurant.dto.RestaurantDto;
import com.codegus.codegus.models.restaurant.dto.RestaurantItem;
import com.codegus.codegus.models.restaurant.dto.RestaurantRequest;

import java.util.List;

public interface RestaurantMapper extends BaseMapper<Restaurant, RestaurantItem, RestaurantDto, RestaurantRequest>{

    @Override
    Restaurant requestToEntity(RestaurantRequest request);

    @Override
    RestaurantDto entityToDto(Restaurant entity);

    @Override
    List<RestaurantItem> entityListToItemList(List<Restaurant> entityList);

}
