package com.codegus.codegus.services.restaurant;

import com.codegus.codegus.models.apply.Restaurant;
import com.codegus.codegus.dtos.restaurant.RestaurantDto;
import com.codegus.codegus.dtos.restaurant.RestaurantItem;
import com.codegus.codegus.dtos.restaurant.RestaurantRequest;
import com.codegus.codegus.services.BaseService;
import java.util.UUID;

public interface RestaurantService extends BaseService<Restaurant, UUID, RestaurantItem, RestaurantDto, RestaurantRequest> {



}
