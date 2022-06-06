package com.codegus.codegus.controllers.restaurant;

import com.codegus.codegus.controllers.BaseControllerImpl;
import com.codegus.codegus.mappers.RestaurantMapper;
import com.codegus.codegus.models.restaurant.Restaurant;
import com.codegus.codegus.models.restaurant.dto.RestaurantDto;
import com.codegus.codegus.models.restaurant.dto.RestaurantItem;
import com.codegus.codegus.models.restaurant.dto.RestaurantRequest;
import com.codegus.codegus.repositories.apply.RestaurantRepository;
import com.codegus.codegus.services.restaurant.RestaurantServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("api/restaurants")
@RestController
public class RestaurantControllerImpl
        extends BaseControllerImpl<Restaurant, UUID, RestaurantItem, RestaurantDto, RestaurantRequest, RestaurantRepository
                , RestaurantMapper, RestaurantServiceImpl> {

}
