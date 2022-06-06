package com.codegus.codegus.services.restaurant;

import com.codegus.codegus.models.restaurant.Restaurant;
import com.codegus.codegus.models.restaurant.dto.RestaurantDto;
import com.codegus.codegus.models.restaurant.dto.RestaurantItem;
import com.codegus.codegus.models.restaurant.dto.RestaurantRequest;
import com.codegus.codegus.services.BaseService;
import java.util.UUID;

public interface RestaurantService extends BaseService<Restaurant, UUID, RestaurantItem, RestaurantDto, RestaurantRequest> {



}
