package com.codegus.codegus.mappers.address;

import com.codegus.codegus.mappers.BaseMapper;
import com.codegus.codegus.models.address.Address;
import com.codegus.codegus.models.address.dto.AddressDto;
import com.codegus.codegus.models.address.dto.AddressItem;
import com.codegus.codegus.models.address.dto.AddressRequest;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface AddressMapper extends BaseMapper<Address, AddressItem, AddressDto, AddressRequest> {

    @Override
    Address requestToEntity(AddressRequest request);

    @Override
    com.codegus.codegus.models.address.dto.AddressDto entityToDto(Address entity);

    @Override
    List<AddressItem> entityListToItemList(List<Address> entityList);

}
