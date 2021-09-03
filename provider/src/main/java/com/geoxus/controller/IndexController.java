package com.geoxus.controller;

import com.geoxus.config.TestConfig;
import com.geoxus.dto.req.UserReqDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Api(description = "生产者进程API接口")
@RequestMapping("/provider")
@RestController
public class IndexController {
    @Resource
    private TestConfig testConfig;

    @ApiOperation(value = "测试接口", notes = "测试接口", produces = "application/json")
    @GetMapping("index")
    public String index() {
        return "Index 哈哈哈" + testConfig.getName();
    }

    @PostMapping("login")
    @ApiOperation("用户注册")
    public String login(@RequestBody UserReqDto userReqDto) {
        return "success";
    }
}
