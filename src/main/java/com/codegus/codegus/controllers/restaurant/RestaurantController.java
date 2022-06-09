package com.codegus.codegus.controllers.restaurant;

import com.codegus.codegus.controllers.BaseController;
import com.codegus.codegus.models.apply.Restaurant;
import com.codegus.codegus.dtos.restaurant.RestaurantDto;
import com.codegus.codegus.dtos.restaurant.RestaurantItem;
import com.codegus.codegus.dtos.restaurant.RestaurantRequest;

import java.util.UUID;

public interface RestaurantController extends BaseController<Restaurant, UUID, RestaurantItem, RestaurantDto, RestaurantRequest> {

    // Agregar métodos abstractos

}
