package com.pcwl.demo.test.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class TestTask01 {

    private int count = 0;

    @Scheduled(cron = "*/6 * * * * ?")
    private void process(){
        //项目启动后就加载了这个定时任务!
        System.out.println("6秒一次哦!");
        System.out.println(String.format("[" + Thread.currentThread().getName() + "]" + "现在时间:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())));
    }
}
