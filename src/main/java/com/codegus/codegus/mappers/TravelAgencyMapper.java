package com.codegus.codegus.mappers;
import com.codegus.codegus.models.travelagency.TravelAgency;
import com.codegus.codegus.models.travelagency.dtos.TravelAgencyDto;
import com.codegus.codegus.models.travelagency.dtos.TravelAgencyItem;
import com.codegus.codegus.models.travelagency.dtos.TravelAgencyRequest;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TravelAgencyMapper extends BaseMapper<TravelAgency, TravelAgencyItem, TravelAgencyDto, TravelAgencyRequest>{

    @Override
    TravelAgency requestToEntity(TravelAgencyRequest request);

    @Override
    TravelAgencyDto entityToDto(TravelAgency entity);

    @Override
    List<TravelAgencyItem> entityListToItemList(List<TravelAgency> entityList);
}
