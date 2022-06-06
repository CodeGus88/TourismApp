package com.codegus.codegus.repositories.apply.socialmedia;

import com.codegus.codegus.models.socialmedia.RestaurantSocialMedia;
import com.codegus.codegus.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RestaurantSocialMediaRepository extends BaseRepository<RestaurantSocialMedia, UUID> {



}
