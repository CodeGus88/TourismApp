package com.codegus.codegus.mappers.socialmedia;

import com.codegus.codegus.mappers.BaseMapper;
import com.codegus.codegus.models.apply.socialmedia.TravelAgencySocialMedia;
import com.codegus.codegus.dtos.socialmedia.SocialMediaDto;
import com.codegus.codegus.dtos.socialmedia.SocialMediaItem;
import com.codegus.codegus.dtos.socialmedia.SocialMediaRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface TravelAgencySocialMediaMapper extends BaseMapper<TravelAgencySocialMedia, SocialMediaItem, SocialMediaDto, SocialMediaRequest> {

    @Override
    @Mappings({
            @Mapping(source = "foreignKey", target = "travelAgency.id")
    })
    TravelAgencySocialMedia requestToEntity(SocialMediaRequest request);

    @Override
    @Mappings({
            @Mapping(source = "travelAgency.id",  target = "foreignKey")
    })
    SocialMediaDto entityToDto(TravelAgencySocialMedia entity);

}
