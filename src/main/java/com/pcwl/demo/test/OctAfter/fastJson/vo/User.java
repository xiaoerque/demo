package com.pcwl.demo.test.OctAfter.fastJson.vo;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Long id;
    private String name;
    // 增加时间字段 测试的为TestDate
    private Date date;

}
