package com.codegus.codegus.mappers.phone;

import com.codegus.codegus.mappers.BaseMapper;
import com.codegus.codegus.models.phones.Phone;
import com.codegus.codegus.models.phones.RestaurantPhone;
import com.codegus.codegus.models.phones.dto.PhoneDto;
import com.codegus.codegus.models.phones.dto.PhoneItem;
import com.codegus.codegus.models.phones.dto.PhoneRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

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

    @Override
    List<PhoneItem> entityListToItemList(List<RestaurantPhone> entityList);

}
