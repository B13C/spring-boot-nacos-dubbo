package com.geoxus.config;

import com.alibaba.nacos.api.annotation.NacosProperties;
import com.alibaba.nacos.api.config.ConfigType;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@NacosPropertySource(dataId = "britton.test.yml", type = ConfigType.YAML, autoRefreshed = true, properties = @NacosProperties(
        namespace = "254cd78f-885d-4f05-b88d-bee895b7f0e9"
))
public class TestConfig {
    @NacosValue(value = "${my-name:1}", autoRefreshed = true)
    private String name;
}
