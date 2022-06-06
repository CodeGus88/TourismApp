package com.codegus.codegus.mappers.phone;

import com.codegus.codegus.mappers.BaseMapper;
import com.codegus.codegus.models.phones.AssistancePhone;
import com.codegus.codegus.models.phones.dto.PhoneDto;
import com.codegus.codegus.models.phones.dto.PhoneItem;
import com.codegus.codegus.models.phones.dto.PhoneRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

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

    @Override
    List<PhoneItem> entityListToItemList(List<AssistancePhone> entityList);

}
