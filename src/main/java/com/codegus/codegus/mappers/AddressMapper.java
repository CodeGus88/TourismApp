package com.codegus.codegus.mappers;

import com.codegus.codegus.models.address.Address;
import com.codegus.codegus.models.address.dto.AddressItem;
import com.codegus.codegus.models.address.dto.AddressRequest;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface AddressMapper extends BaseMapper<Address, AddressItem, com.codegus.codegus.models.address.dto.AddressDto, AddressRequest> {

    @Override
    Address requestToEntity(AddressRequest request);

    @Override
    com.codegus.codegus.models.address.dto.AddressDto entityToDto(Address entity);

    @Override
    List<AddressItem> entityListToItemList(List<Address> entityList);
}
