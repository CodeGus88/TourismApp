package com.codegus.codegus.mappers.address;

import com.codegus.codegus.mappers.BaseMapper;
import com.codegus.codegus.models.address.RestaurantAddress;
import com.codegus.codegus.models.address.dto.AddressDto;
import com.codegus.codegus.models.address.dto.AddressItem;
import com.codegus.codegus.models.address.dto.AddressRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

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

    @Override
    List<AddressItem> entityListToItemList(List<RestaurantAddress> entityList);
}
