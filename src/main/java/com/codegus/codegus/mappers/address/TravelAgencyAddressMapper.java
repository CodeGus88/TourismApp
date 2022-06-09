package com.codegus.codegus.mappers.address;

import com.codegus.codegus.mappers.BaseMapper;
import com.codegus.codegus.models.apply.address.TravelAgencyAddress;
import com.codegus.codegus.dtos.address.AddressDto;
import com.codegus.codegus.dtos.address.AddressItem;
import com.codegus.codegus.dtos.address.AddressRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


@Mapper(componentModel = "spring")
public interface TravelAgencyAddressMapper extends BaseMapper<TravelAgencyAddress, AddressItem, AddressDto, AddressRequest> {

    @Override
    @Mappings({
            @Mapping(source = "foreignKey", target = "travelAgency.id")
    })
    TravelAgencyAddress requestToEntity(AddressRequest request);

    @Override
    @Mappings({
            @Mapping(source = "travelAgency.id", target = "foreignKey")
    })
    AddressDto entityToDto(TravelAgencyAddress entity);

}
