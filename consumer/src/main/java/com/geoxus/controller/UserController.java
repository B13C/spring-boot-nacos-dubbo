package com.geoxus.controller;

import cn.hutool.core.lang.Dict;
import com.geoxus.dto.req.UserReqDto;
import com.geoxus.dto.res.UserResDto;
import com.geoxus.framework.utils.GXResultUtils;
import com.geoxus.service.TestService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
    @Resource
    private TestService testService;

    @PostMapping("list-or-search")
    public List<UserResDto> listUser(@RequestBody Dict param) {
        return testService.listUser(param);
    }

    @PostMapping("create")
    public GXResultUtils<Dict> createOrUpdate(@Validated @RequestBody UserReqDto userReqDto) {
        Long id = testService.createOrUpdate(userReqDto);
        return GXResultUtils.ok(Dict.create().set("id", id));
    }
}
