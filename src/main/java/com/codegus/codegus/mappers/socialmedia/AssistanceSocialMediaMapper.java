package com.codegus.codegus.mappers.socialmedia;

import com.codegus.codegus.mappers.BaseMapper;
import com.codegus.codegus.models.apply.socialmedia.AssistanceSocialMedia;
import com.codegus.codegus.dtos.socialmedia.SocialMediaDto;
import com.codegus.codegus.dtos.socialmedia.SocialMediaItem;
import com.codegus.codegus.dtos.socialmedia.SocialMediaRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


@Mapper(componentModel = "string")
public interface AssistanceSocialMediaMapper extends BaseMapper<AssistanceSocialMedia, SocialMediaItem, SocialMediaDto, SocialMediaRequest> {

    @Override
    @Mappings({
            @Mapping(source = "foreignKey", target = "assistance.id")
    })
    AssistanceSocialMedia requestToEntity(SocialMediaRequest request);

    @Override
    @Mappings({
            @Mapping(source = "assistance.id",  target = "foreignKey")
    })
    SocialMediaDto entityToDto(AssistanceSocialMedia entity);

}
