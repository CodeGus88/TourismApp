package com.codegus.codegus.services.restaurant;

import com.codegus.codegus.mappers.RestaurantMapper;
import com.codegus.codegus.models.apply.Restaurant;
import com.codegus.codegus.dtos.restaurant.RestaurantDto;
import com.codegus.codegus.dtos.restaurant.RestaurantItem;
import com.codegus.codegus.dtos.restaurant.RestaurantRequest;
import com.codegus.codegus.repositories.apply.RestaurantRepository;
import com.codegus.codegus.services.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class RestaurantServiceImpl
        extends BaseServiceImpl<Restaurant, UUID, RestaurantItem, RestaurantDto, RestaurantRequest, RestaurantRepository, RestaurantMapper>
        implements RestaurantService{

    @Override
    @Transactional(readOnly = false)
    public List<RestaurantItem> findAll(){
        List<RestaurantItem> restaurants = repository.findAll().stream().map(entity -> mapper.entityToItem(entity))
                .collect(Collectors.toList());

        return null;
    }

}
