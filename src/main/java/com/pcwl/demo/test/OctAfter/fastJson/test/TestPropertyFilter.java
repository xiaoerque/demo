package com.pcwl.demo.test.OctAfter.fastJson.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.pcwl.demo.test.OctAfter.fastJson.vo.User;

public class TestPropertyFilter {
    public static void main(String[] args) {
        PropertyFilter filter = new PropertyFilter() {
            @Override
            public boolean apply(Object object, String name, Object value) {
                System.out.println("----------source=" + object);
                System.out.println("name=" + name);
                System.out.println("value=" + value);
                return true;
            }
        };

        User user = new User();
        user.setId(99L);
        user.setName("测试PropertyFilter");
        System.out.println(JSON.toJSONString(user,filter));

        user.setId(101L);
        System.out.println(JSON.toJSONString(user,filter));
    }
}
