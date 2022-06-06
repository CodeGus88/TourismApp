package com.codegus.codegus.mappers;

import com.codegus.codegus.models.assistance.Assistance;
import com.codegus.codegus.models.assistance.dto.AssistanceDto;
import com.codegus.codegus.models.assistance.dto.AssistanceItem;
import com.codegus.codegus.models.assistance.dto.AssistanceRequest;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

public interface ServiceMapper extends BaseMapper<Assistance, AssistanceItem, AssistanceDto, AssistanceRequest>{

    @Override
    @Mappings({
            @Mapping(source = "serviceId", target = "service.id")
    })
    Assistance requestToEntity(AssistanceRequest request);

    @Override
    AssistanceDto entityToDto(Assistance entity);

    @Override
    List<AssistanceItem> entityListToItemList(List<Assistance> entityList);

}
