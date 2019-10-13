package com.pcwl.demo.test.OctBefore;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("testRedis")
public class RedisController {
    @Resource
    private RedisTemplate<String,String> template;
    @RequestMapping(value = {"dd"},produces = {"application/text"})
    public String testRedis(){
        template.opsForHash().putIfAbsent("hca","hhca","郝先生");
        System.out.println(template.opsForHash().get("hca","hhca"));
        template.opsForValue().set("gq","国强",50, TimeUnit.SECONDS);
        return "abcd";
    }
}
