package com.codegus.codegus.mappers;
import com.codegus.codegus.models.apply.TravelAgency;
import com.codegus.codegus.dtos.travelagency.TravelAgencyDto;
import com.codegus.codegus.dtos.travelagency.TravelAgencyItem;
import com.codegus.codegus.dtos.travelagency.TravelAgencyRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TravelAgencyMapper extends BaseMapper<TravelAgency, TravelAgencyItem, TravelAgencyDto, TravelAgencyRequest>{

    @Override
    TravelAgency requestToEntity(TravelAgencyRequest request);

    @Override
    TravelAgencyDto entityToDto(TravelAgency entity);

}
