package com.pcwl.demo.common.dateUtils;

import org.apache.commons.lang.time.DateFormatUtils;

import java.util.Date;

public class CompareDate {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.printf("系统的当前时间:"+ DateFormatUtils.format(now,"yyyy-MM-dd"));
    }
}
