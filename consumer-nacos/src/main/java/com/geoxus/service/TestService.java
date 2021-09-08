package com.geoxus.service;

import cn.hutool.core.lang.Dict;
import com.geoxus.dto.req.UserReqDto;
import com.geoxus.dto.res.UserResDto;
import com.geoxus.framework.service.GXBusinessService;

import java.util.List;

public interface TestService extends GXBusinessService {
    List<UserResDto> listUser(Dict param);

    Long createOrUpdate(UserReqDto userReqDto);
}
