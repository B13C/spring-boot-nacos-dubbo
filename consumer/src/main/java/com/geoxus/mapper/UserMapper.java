package com.geoxus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.geoxus.builder.UserBuilder;
import com.geoxus.dto.res.UserResDto;
import com.geoxus.entities.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
    @SelectProvider(type = UserBuilder.class, method = "listOrSearch")
    List<UserResDto> listOrSearch(IPage<UserResDto> page);
}
