package com.codegus.codegus.mappers;

import com.codegus.codegus.models.phones.Phone;
import com.codegus.codegus.models.phones.dto.PhoneDto;
import com.codegus.codegus.models.phones.dto.PhoneItem;
import com.codegus.codegus.models.phones.dto.PhoneRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PhoneMapper extends BaseMapper<Phone, PhoneItem, PhoneDto, PhoneRequest>{

    @Override
    @Mappings({
        @Mapping(source = "serviceId", target = "service.id")
    })
    Phone requestToEntity(PhoneRequest request);

    @Override
    @Mappings({
            @Mapping(source = "service.id", target = "serviceId")
    })
    PhoneDto entityToDto(Phone entity);

    @Override
    List<PhoneItem> entityListToItemList(List<Phone> entityList);

}
