package com.codegus.codegus.mappers.socialmedia;

import com.codegus.codegus.mappers.BaseMapper;
import com.codegus.codegus.models.socialmedia.AssistanceSocialMedia;
import com.codegus.codegus.models.socialmedia.dto.SocialMediaDto;
import com.codegus.codegus.models.socialmedia.dto.SocialMediaItem;
import com.codegus.codegus.models.socialmedia.dto.SocialMediaRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

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

    @Override
    List<SocialMediaItem> entityListToItemList(List<AssistanceSocialMedia> entityList);
}
