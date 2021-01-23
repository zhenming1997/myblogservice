package com.zhen.myblogservice.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/*
* mybatis自动填充
* */
@Slf4j
@Component //处理器加入到IOC容器中
public class MybatisHandler implements MetaObjectHandler {
    //插入填充策略
    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("开始自动填充~~~insert");
        this.strictInsertFill(metaObject, "createTime", () -> LocalDateTime.now(), LocalDateTime.class);
    }

    //更新填充策略
    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("开始自动填充~~~update");
        this.strictUpdateFill(metaObject, "updateTime", () -> LocalDateTime.now(), LocalDateTime.class);
    }
}
