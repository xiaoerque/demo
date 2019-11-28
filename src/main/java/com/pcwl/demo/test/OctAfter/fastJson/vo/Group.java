package com.pcwl.demo.test.OctAfter.fastJson.vo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Group {
    private Long id;
    private String name;
    private List<User> users = new ArrayList<User>();
}
