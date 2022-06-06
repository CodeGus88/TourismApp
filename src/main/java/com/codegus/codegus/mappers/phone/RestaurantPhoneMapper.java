package com.codegus.codegus.mappers;

import com.codegus.codegus.models.phones.Phone;
import com.codegus.codegus.models.phones.dto.PhoneDto;
import com.codegus.codegus.models.phones.dto.PhoneItem;
import com.codegus.codegus.models.phones.dto.PhoneRequest;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PhoneMapper extends BaseMapper<Phone, PhoneItem, PhoneDto, PhoneRequest>{

    @Override
    Phone requestToEntity(PhoneRequest request);

    @Override
    PhoneDto entityToDto(Phone entity);

    @Override
    List<PhoneItem> entityListToItemList(List<Phone> entityList);

}
