package com.codegus.codegus.mappers.phone;

import com.codegus.codegus.mappers.BaseMapper;
import com.codegus.codegus.models.apply.phones.RestaurantPhone;
import com.codegus.codegus.dtos.phone.PhoneDto;
import com.codegus.codegus.dtos.phone.PhoneItem;
import com.codegus.codegus.dtos.phone.PhoneRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


@Mapper(componentModel = "spring")
public interface RestaurantPhoneMapper extends BaseMapper<RestaurantPhone, PhoneItem, PhoneDto, PhoneRequest> {

    @Override
    @Mappings({
            @Mapping(source = "foreignKey", target = "restaurant.id")
    })
    RestaurantPhone requestToEntity(PhoneRequest request);

    @Override
    @Mappings({
            @Mapping(source = "restaurant.id", target = "foreignKey")
    })
    PhoneDto entityToDto(RestaurantPhone entity);

}
