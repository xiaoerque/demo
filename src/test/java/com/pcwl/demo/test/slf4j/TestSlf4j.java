package com.pcwl.demo.test.slf4j;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestSlf4j {
    Logger logger =LoggerFactory.getLogger(getClass());
    @Test
    public void LogLevel(){
        //测试日志级别
        logger.trace("这是trace事务级别!");
        logger.debug("这是debug事务级别!");
        logger.info("这是info事务级别!");
        logger.warn("这是warn事务级别!");
        logger.error("这是error事务级别!");
        //以上级别依次增大:默认开启info级别,可在配置文件中进行配置
    }
}
