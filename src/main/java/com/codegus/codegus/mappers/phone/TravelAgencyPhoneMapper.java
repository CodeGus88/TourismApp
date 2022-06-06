package com.codegus.codegus.mappers.phone;

import com.codegus.codegus.mappers.BaseMapper;
import com.codegus.codegus.models.phones.TravelAgencyPhone;
import com.codegus.codegus.models.phones.dto.PhoneDto;
import com.codegus.codegus.models.phones.dto.PhoneItem;
import com.codegus.codegus.models.phones.dto.PhoneRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TravelAgencyPhoneMapper extends BaseMapper<TravelAgencyPhone, PhoneItem, PhoneDto, PhoneRequest> {

    @Override
    @Mappings({
            @Mapping(source = "foreignKey", target = "travelAgency.id")
    })
    TravelAgencyPhone requestToEntity(PhoneRequest request);

    @Override
    @Mappings({
            @Mapping(source = "travelAgency.id", target = "foreignKey")
    })
    PhoneDto entityToDto(TravelAgencyPhone entity);

    @Override
    List<PhoneItem> entityListToItemList(List<TravelAgencyPhone> entityList);

}
