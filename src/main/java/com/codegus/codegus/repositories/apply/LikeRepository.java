package com.codegus.codegus.repositories.apply;

import com.codegus.codegus.models.like.Like;
import com.codegus.codegus.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LikeRepository extends BaseRepository<Like, UUID> {



}
