package com.pcwl.demo;

import com.pcwl.demo.test.ymlBean.YmlBeanMybatis;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    YmlBeanMybatis ybm;

    @Test
    public void YmlConfigration() {
        System.out.print(ybm);
    }
    @Test
    public void testSlf4j(){
        logger.trace("trace日志级别");
        logger.debug("debug日志级别");
        logger.info("info日志级别");
        logger.warn("warn日志级别");
        logger.error("error日志级别");
        //以上级别依次增大:默认开启info级别,可在配置文件中进行配置
    }

}
