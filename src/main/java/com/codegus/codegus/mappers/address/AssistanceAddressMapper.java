package com.codegus.codegus.mappers.address;

import com.codegus.codegus.mappers.BaseMapper;
import com.codegus.codegus.models.apply.address.AssistanceAddress;
import com.codegus.codegus.dtos.address.AddressDto;
import com.codegus.codegus.dtos.address.AddressItem;
import com.codegus.codegus.dtos.address.AddressRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


@Mapper(componentModel = "spring")
public interface AssistanceAddressMapper extends BaseMapper<AssistanceAddress, AddressItem, AddressDto, AddressRequest> {

    @Override
    @Mappings({
            @Mapping(source = "foreignKey", target = "assistance.id")
    })
    AssistanceAddress requestToEntity(AddressRequest request);

    @Override
    @Mappings({
            @Mapping(source = "assistance.id", target = "foreignKey")
    })
    AddressDto entityToDto(AssistanceAddress entity);

}
