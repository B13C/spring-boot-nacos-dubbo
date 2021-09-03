package com.geoxus.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.geoxus.dto.res.UserResDto;
import com.geoxus.entities.UserEntity;
import com.geoxus.framework.dao.GXBaseDao;
import com.geoxus.mapper.UserMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDao extends GXBaseDao<UserMapper, UserEntity> {
    public List<UserResDto> listOrSearch(IPage<UserResDto> page) {
        return baseMapper.listOrSearch(page);
    }
}
