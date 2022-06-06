package com.codegus.codegus.mappers;

import com.codegus.codegus.models.assistance.Assistance;
import com.codegus.codegus.models.assistance.dto.AssistanceDto;
import com.codegus.codegus.models.assistance.dto.AssistanceItem;
import com.codegus.codegus.models.assistance.dto.AssistanceRequest;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AssistanceMapper extends BaseMapper<Assistance, AssistanceItem, AssistanceDto, AssistanceRequest>{

    @Override
    Assistance requestToEntity(AssistanceRequest request);

    @Override
    AssistanceDto entityToDto(Assistance entity);

    @Override
    List<AssistanceItem> entityListToItemList(List<Assistance> entityList);

}
