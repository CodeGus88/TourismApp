package com.codegus.codegus.mappers;

import com.codegus.codegus.models.apply.User;
import com.codegus.codegus.dtos.user.UserDto;
import com.codegus.codegus.dtos.user.UserItem;
import com.codegus.codegus.dtos.user.UserRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper extends BaseMapper<User, UserItem, UserDto, UserRequest>{

}
