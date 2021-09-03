package com.geoxus.service.impl;

import cn.hutool.core.lang.Dict;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.geoxus.dao.UserDao;
import com.geoxus.dto.req.UserReqDto;
import com.geoxus.dto.res.UserResDto;
import com.geoxus.entities.UserEntity;
import com.geoxus.mapstruct.UserMapstruct;
import com.geoxus.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    @Resource
    private UserDao userDao;

    @Resource
    private UserMapstruct userMapstruct;

    @Override
    public List<UserResDto> listUser(Dict param) {
        IPage<UserResDto> page = new Page<>(1, 2);
        List<UserResDto> list = userDao.listOrSearch(page);
        return list;
    }

    @Override
    public Long createOrUpdate(UserReqDto userReqDto) {
        UserEntity userEntity = userMapstruct.dtoToEntity(userReqDto);
        userDao.saveOrUpdate(userEntity);
        return userEntity.getId();
    }
}
