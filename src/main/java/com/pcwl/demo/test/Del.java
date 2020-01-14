package com.pcwl.demo.test;


import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;

public class Del {

    public static void main(String[] args) {
        String str1 = "888中国工商银行666";
        String str2 = "上海6666银行";

        //System.out.println("银行名称:"+getBankName(str2,"银行"));

        BigDecimal decimal1 = new BigDecimal("66.66");
        BigDecimal decimal2 = new BigDecimal("66.6600");

        System.out.println("decimal1:"+decimal1);
        System.out.println("decimal2:"+decimal2);

        System.out.println("equals是否相等:"+decimal1.equals(decimal2));
        System.out.println("compareTo是否相等"+decimal1.compareTo(decimal2));
    }



    private static String getBankName(String str,String endIndexStr){
        Integer endIndex = str.indexOf(endIndexStr);
        String result = null;
        //和翠花规定:当有银行连个字时:截取银行前两个字;没有银行两个字时,截取前四个字
        if(endIndex < 0){
            result = StringUtils.substring(str,0,4) + "银行";
        }else {
            result = StringUtils.substring(str,endIndex-2,endIndex) + "银行";
        }
        return result;
    }

}
