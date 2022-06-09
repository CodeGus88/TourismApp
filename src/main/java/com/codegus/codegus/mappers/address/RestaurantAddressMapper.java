package com.codegus.codegus.mappers.address;

import com.codegus.codegus.mappers.BaseMapper;
import com.codegus.codegus.models.apply.address.RestaurantAddress;
import com.codegus.codegus.dtos.address.AddressDto;
import com.codegus.codegus.dtos.address.AddressItem;
import com.codegus.codegus.dtos.address.AddressRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


@Mapper(componentModel = "spring")
public interface RestaurantAddressMapper extends BaseMapper<RestaurantAddress, AddressItem, AddressDto, AddressRequest> {

    @Override
    @Mappings({
            @Mapping(source = "foreignKey", target = "restaurant.id")
    })
    RestaurantAddress requestToEntity(AddressRequest request);

    @Override
    @Mappings({
            @Mapping(source = "restaurant.id", target = "foreignKey")
    })
    AddressDto entityToDto(RestaurantAddress entity);

}
