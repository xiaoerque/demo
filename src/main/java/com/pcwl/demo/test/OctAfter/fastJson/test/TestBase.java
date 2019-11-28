package com.pcwl.demo.test.OctAfter.fastJson.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.pcwl.demo.test.OctAfter.fastJson.vo.Group;
import com.pcwl.demo.test.OctAfter.fastJson.vo.User;

import java.util.ArrayList;
import java.util.List;

public class TestBase {
    public static void main(String[] args) {
        Group group = new Group();
        group.setId(0L);
        group.setName("admin");

        User user0 = new User();
        user0.setId(0L);
        user0.setName("guest0");

        User user1 = new User();
        user1.setId(1L);
        user1.setName("guest1");

        List<User> users = new ArrayList<>();
        users.add(user0);
        users.add(user1);
        group.setUsers(users);

        //Group的序列化:
        String objToString = JSON.toJSONString(group);
        System.out.println(objToString);
        //Group的反序列化
        String jsonStr = "{\"id\":0,\"name\":\"admin\",\"users\":[{\"id\":0,\"name\":\"guest0\"},{\"id\":1,\"name\":\"guest1\"}]}";
        group = JSON.parseObject(jsonStr,Group.class);
        System.out.println(group);
        //List序列化
        String listToStr = JSON.toJSONString(users);
        System.out.println(listToStr);
        //List反序列化
        String strToList = "[{\"id\":0,\"name\":\"guest0\"},{\"id\":1,\"name\":\"guest1\"}]";
        users = JSON.parseObject(strToList,new TypeReference< List<User>>() {});
        System.out.print(users);
    }
}
