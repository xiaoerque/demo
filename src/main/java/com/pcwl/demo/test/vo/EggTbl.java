package com.pcwl.demo.test.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class EggTbl implements Serializable {
    private static final String NAME_BY_WHO = "迎风布阵";

    private Integer id;
    private String name;
    private String remark;

    private Map<String,String> remarkMap = new HashMap();
}
