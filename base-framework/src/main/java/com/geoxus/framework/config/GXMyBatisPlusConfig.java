package com.geoxus.framework.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.autoconfigure.ConfigurationCustomizer;
import com.baomidou.mybatisplus.core.MybatisConfiguration;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.handler.TableNameHandler;
import com.baomidou.mybatisplus.extension.plugins.handler.TenantLineHandler;
import com.baomidou.mybatisplus.extension.plugins.inner.*;
import lombok.extern.slf4j.Slf4j;
import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.expression.LongValue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Configuration
public class GXMyBatisPlusConfig {
    private static void customize(MybatisConfiguration configuration) {
        //configuration.setUseDeprecatedExecutor(false);
    }

    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        // 防止全表更新与删除插件
        interceptor.addInnerInterceptor(new BlockAttackInnerInterceptor());
        // 乐观锁插件
        interceptor.addInnerInterceptor(new OptimisticLockerInnerInterceptor());
        // sql性能规范插件
        // interceptor.addInnerInterceptor(new IllegalSQLInnerInterceptor());
        // 多租户插件(请在相应的表中新增tenant_id字段)
        interceptor.addInnerInterceptor(new TenantLineInnerInterceptor(new TenantLineHandler() {
            /**
             * 获取租户 ID 值表达式，只支持单个 ID 值
             * <p>
             *
             * @return 租户 ID 值表达式
             */
            @Override
            public Expression getTenantId() {
                return new LongValue(1);
            }

            /**
             * 获取租户字段名
             * <p>
             * 默认字段名叫: tenant_id
             *
             * @return 租户字段名
             */
            @Override
            public String getTenantIdColumn() {
                return "tenant_id";
            }

            /**
             * 根据表名判断是否忽略拼接多租户条件
             * <p>
             * 默认都要进行解析并拼接多租户条件
             *
             * @param tableName 表名
             * @return 是否忽略, true:表示忽略，false:需要解析并拼接多租户条件
             */
            @Override
            public boolean ignoreTable(String tableName) {
                return false;
            }
        }
        ));
        // 分页插件
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        // 动态表名插件
        DynamicTableNameInnerInterceptor dynamicTableNameInnerInterceptor = new DynamicTableNameInnerInterceptor();
        Map<String, TableNameHandler> tableNameHandlerMap = new HashMap<>();
        tableNameHandlerMap.put("tableName", (sql, tableName) -> tableName);
        dynamicTableNameInnerInterceptor.setTableNameHandlerMap(tableNameHandlerMap);
        interceptor.addInnerInterceptor(dynamicTableNameInnerInterceptor);
        return interceptor;
    }

    @Bean
    public ConfigurationCustomizer configurationCustomizer() {
        return GXMyBatisPlusConfig::customize;
    }
}
