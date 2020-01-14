package com.pcwl.demo.test.OctAfter.fastJson.test;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.ValueFilter;
import com.pcwl.demo.test.OctAfter.fastJson.vo.User;

public class TestPropertyFilter {
    public static void main(String[] args) {

        User man1 = new User();
        man1.setId(1L);
        man1.setName("大王");

        ValueFilter filter = new ValueFilter() {
            @Override
            public Object process(Object object, String name, Object value) {
                System.out.println("第一个参数Object:" + object);
                System.out.println("第二个参数Name:" + name);
                System.out.println("第三个参数Value:" + value);
                System.out.println("----------------------");
                User user = (User) object;
                if(user.getId().equals(1L)){
                    if ("name".equals(name)) {
                        if("大王".equals(value)){
                            return value + "叫我来巡山";
                        }else {
                            return value;
                        }
                    }else {
                        return value;
                    }
                }else {
                    return value;
                }
            }
        };

        String  jsonString = JSON.toJSONString(man1, filter);
        System.out.println("ValueFilter序列化man1：" + jsonString + "\n");

    }
}
