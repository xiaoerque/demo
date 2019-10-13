package com.pcwl.demo.test.ymlBean;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestYml {

    @Autowired
    YmlBeanMybatis ybm;

    @Test
    public void ReadYmlConfigFile(){
        System.out.println(ybm);
    }
}
