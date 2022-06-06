package com.codegus.codegus.mappers.socialmedia;

import com.codegus.codegus.mappers.BaseMapper;
import com.codegus.codegus.models.socialmedia.SocialMedia;
import com.codegus.codegus.models.socialmedia.dto.SocialMediaDto;
import com.codegus.codegus.models.socialmedia.dto.SocialMediaItem;
import com.codegus.codegus.models.socialmedia.dto.SocialMediaRequest;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

public interface SocialMediaMapper extends BaseMapper<SocialMedia, SocialMediaItem, SocialMediaDto, SocialMediaRequest> {

    @Override
    SocialMedia requestToEntity(SocialMediaRequest request);

    @Override
    SocialMediaDto entityToDto(SocialMedia entity);

    @Override
    @Mappings({
            @Mapping(source = "serviceId", target = "service.id")
    })
    List<SocialMediaItem> entityListToItemList(List<SocialMedia> entityList);

}
