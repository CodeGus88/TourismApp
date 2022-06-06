package com.codegus.codegus.mappers;

import com.codegus.codegus.models.user.User;
import com.codegus.codegus.models.user.dto.UserDto;
import com.codegus.codegus.models.user.dto.UserItem;
import com.codegus.codegus.models.user.dto.UserRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper extends BaseMapper<User, UserItem, UserDto, UserRequest>{

}
