package com.geoxus.mapstruct;


import com.geoxus.dto.req.UserReqDto;
import com.geoxus.dto.res.UserResDto;
import com.geoxus.entities.UserEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapstruct {
    UserEntity dtoToEntity(UserReqDto usersDto);

    UserReqDto entityToDto(UserEntity entity);

    List<UserResDto> list(List<UserEntity> list);
}
