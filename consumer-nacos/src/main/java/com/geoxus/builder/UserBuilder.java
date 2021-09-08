package com.geoxus.builder;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.geoxus.dto.res.UserResDto;
import org.apache.ibatis.jdbc.SQL;

public class UserBuilder {
    public String listOrSearch(IPage<UserResDto> page) {
        SQL sql = new SQL().SELECT("*").FROM("user");
        return sql.toString();
    }
}
