package com.geoxus.provider.mapstruct;

import com.geoxus.dto.UserAddressResDto;
import com.geoxus.entities.UserAddress;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring")
@Component
public interface UserAddressMapStruct {
    @Mapping(source = "userAddress" , target = "userAddress01")
    List<UserAddressResDto> entitiesToDto(List<UserAddress> users);
}
