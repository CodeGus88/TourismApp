package com.codegus.codegus.mappers.socialmedia;

import com.codegus.codegus.mappers.BaseMapper;
import com.codegus.codegus.models.socialmedia.RestaurantSocialMedia;
import com.codegus.codegus.models.socialmedia.dto.SocialMediaDto;
import com.codegus.codegus.models.socialmedia.dto.SocialMediaItem;
import com.codegus.codegus.models.socialmedia.dto.SocialMediaRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RestaurantSocialMediaMapper extends BaseMapper<RestaurantSocialMedia, SocialMediaItem, SocialMediaDto, SocialMediaRequest> {

    @Override
    @Mappings({
            @Mapping(source = "foreignKey", target = "restaurant.id")
    })
    RestaurantSocialMedia requestToEntity(SocialMediaRequest request);

    @Override
    @Mappings({
            @Mapping(source = "restaurant.id", target = "foreignKey")
    })
    SocialMediaDto entityToDto(RestaurantSocialMedia entity);

    @Override
    List<SocialMediaItem> entityListToItemList(List<RestaurantSocialMedia> entityList);

}
