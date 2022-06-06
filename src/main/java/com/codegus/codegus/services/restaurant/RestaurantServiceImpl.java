package com.codegus.codegus.services.restaurant;

import com.codegus.codegus.mappers.RestaurantMapper;
import com.codegus.codegus.models.restaurant.Restaurant;
import com.codegus.codegus.models.restaurant.dto.RestaurantDto;
import com.codegus.codegus.models.restaurant.dto.RestaurantItem;
import com.codegus.codegus.models.restaurant.dto.RestaurantRequest;
import com.codegus.codegus.repositories.apply.RestaurantRepository;
import com.codegus.codegus.services.BaseServiceImpl;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RestaurantServiceImpl
        extends BaseServiceImpl<Restaurant, UUID, RestaurantItem, RestaurantDto, RestaurantRequest, RestaurantRepository, RestaurantMapper>
        implements RestaurantService{



}
