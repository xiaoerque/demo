package com.pcwl.demo.test.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class Egg extends EggTbl {

    public String getRemarkMap(Egg egg,String key){
        return getRemarkMap(egg.getRemarkMap(),key);
    }
    private String  getRemarkMap(Map<String,String> map,String key){
        String val = null;
        if(null != map){
            val = map.get(key);
        }
        return val;
    }
}
