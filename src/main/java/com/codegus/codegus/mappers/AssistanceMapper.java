package com.codegus.codegus.mappers;

import com.codegus.codegus.models.apply.Assistance;
import com.codegus.codegus.dtos.assistance.AssistanceDto;
import com.codegus.codegus.dtos.assistance.AssistanceItem;
import com.codegus.codegus.dtos.assistance.AssistanceRequest;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface AssistanceMapper extends BaseMapper<Assistance, AssistanceItem, AssistanceDto, AssistanceRequest>{

    @Override
    Assistance requestToEntity(AssistanceRequest request);

    @Override
    AssistanceDto entityToDto(Assistance entity);

}
