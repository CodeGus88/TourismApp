package com.codegus.codegus.controllers.restaurant;

import com.codegus.codegus.controllers.BaseController;
import com.codegus.codegus.models.restaurant.Restaurant;
import com.codegus.codegus.models.restaurant.dto.RestaurantDto;
import com.codegus.codegus.models.restaurant.dto.RestaurantItem;
import com.codegus.codegus.models.restaurant.dto.RestaurantRequest;

import java.util.UUID;

public interface RestaurantController extends BaseController<Restaurant, UUID, RestaurantItem, RestaurantDto, RestaurantRequest> {

    // Agregar métodos abstractos

}
