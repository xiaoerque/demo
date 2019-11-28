package com.pcwl.demo.test.OctAfter.fastJson.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.pcwl.demo.test.OctAfter.fastJson.vo.User;

import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        User user = new User();
        user.setId(3L);
        user.setName("测试Date");
        user.setDate(new Date());

        //user序列化
        String userToStr = JSON.toJSONString(user);
        System.out.println(userToStr);

        //序列化处理时间一
        System.out.println("方式一"+JSON.toJSONStringWithDateFormat(user,"yyyy-MM-dd HH:mm"));

        //序列化处理时间二
        System.out.println("方式二"+JSON.toJSONString(user, SerializerFeature.UseISO8601DateFormat));

        //序列化处理时间三:全局设置变量
        JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
        System.out.println("方式三"+JSON.toJSONString(user,SerializerFeature.WriteDateUseDateFormat));
    }
}
