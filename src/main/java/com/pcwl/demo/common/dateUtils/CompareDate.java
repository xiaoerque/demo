package com.pcwl.demo.common.dateUtils;

import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CompareDate {
    public static void main(String[] args) throws ParseException {
        Date now = new Date();
        Date testTime = new SimpleDateFormat("yyyy-MM-dd").parse("2020-01-15");
        System.out.println("当前的时间:"+ DateFormatUtils.format(now,"yyyy-MM-dd"));
        System.out.println("测试的时间:"+ DateFormatUtils.format(testTime,"yyyy-MM-dd"));

        System.out.println("当前时间比测试时间:1----------->"+DateUtils.truncatedCompareTo(now,testTime,Calendar.YEAR));
        System.out.println("当前时间比测试时间:2----------->"+DateUtils.truncatedCompareTo(now,testTime,Calendar.MONTH));
        System.out.println("当前时间比测试时间:5----------->"+DateUtils.truncatedCompareTo(now,testTime,Calendar.DATE));
        System.out.println("当前时间比测试时间:4----------->"+DateUtils.truncatedCompareTo(now,testTime,Calendar.HOUR));
    }
}
