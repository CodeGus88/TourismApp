package com.codegus.codegus.mappers.address;

import com.codegus.codegus.mappers.BaseMapper;
import com.codegus.codegus.models.address.TravelAgencyAddress;
import com.codegus.codegus.models.address.dto.AddressDto;
import com.codegus.codegus.models.address.dto.AddressItem;
import com.codegus.codegus.models.address.dto.AddressRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

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

    @Override
    List<AddressItem> entityListToItemList(List<TravelAgencyAddress> entityList);
}
