package com.codegus.codegus.mappers.socialmedia;

import com.codegus.codegus.mappers.BaseMapper;
import com.codegus.codegus.models.apply.socialmedia.RestaurantSocialMedia;
import com.codegus.codegus.dtos.socialmedia.SocialMediaDto;
import com.codegus.codegus.dtos.socialmedia.SocialMediaItem;
import com.codegus.codegus.dtos.socialmedia.SocialMediaRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

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
    SocialMediaDto entityToDto(RestaurantSocialMedia entity);;

}
