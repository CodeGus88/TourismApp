package com.codegus.codegus.repositories.apply;

import com.codegus.codegus.models.apply.User;
import com.codegus.codegus.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends BaseRepository<User, UUID> {



}
