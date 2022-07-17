package com.codegus.codegus.mappers.address;

import com.codegus.codegus.dtos.address.AddressDto;
import com.codegus.codegus.dtos.address.AddressItem;
import com.codegus.codegus.dtos.address.AddressRequest;
import com.codegus.codegus.mappers.BaseMapper;
import com.codegus.codegus.models.apply.address.TouristPlaceAddress;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


@Mapper(componentModel = "spring")
public interface TouristPlaceAddressMapper extends BaseMapper<TouristPlaceAddress, AddressItem, AddressDto, AddressRequest> {

    @Override
    @Mappings({
            @Mapping(source = "foreignKey", target = "touristPlace.id")
    })
    TouristPlaceAddress requestToEntity(AddressRequest request);

    @Override
    @Mappings({
            @Mapping(source = "touristPlace.id", target = "foreignKey")
    })
    AddressDto entityToDto(TouristPlaceAddress entity);

}
