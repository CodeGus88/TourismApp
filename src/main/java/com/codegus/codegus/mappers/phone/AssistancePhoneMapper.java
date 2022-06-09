package com.codegus.codegus.mappers.phone;

import com.codegus.codegus.mappers.BaseMapper;
import com.codegus.codegus.models.apply.phones.AssistancePhone;
import com.codegus.codegus.dtos.phone.PhoneDto;
import com.codegus.codegus.dtos.phone.PhoneItem;
import com.codegus.codegus.dtos.phone.PhoneRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


@Mapper(componentModel = "spring")
public interface AssistancePhoneMapper extends BaseMapper<AssistancePhone, PhoneItem, PhoneDto, PhoneRequest> {

    @Override
    @Mappings({
            @Mapping(source = "foreignKey", target = "assistance.id")
    })
    AssistancePhone requestToEntity(PhoneRequest request);

    @Override
    @Mappings({
            @Mapping(source = "assistance.id", target = "foreignKey")
    })
    PhoneDto entityToDto(AssistancePhone entity);

}
