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
        Date testTime = new SimpleDateFormat("yyyy-MM-dd").parse("2020-01-14");
        System.out.println("当前的时间:"+ DateFormatUtils.format(now,"yyyy-MM-dd HH:mm:ss"));
        System.out.println("测试的时间:"+ DateFormatUtils.format(testTime,"yyyy-MM-dd HH:mm:ss"));

        System.out.println("当前时间比测试时间:YEAR----------->"+DateUtils.truncatedCompareTo(now,testTime,Calendar.YEAR));
        System.out.println("当前时间比测试时间:MONTH----------->"+DateUtils.truncatedCompareTo(now,testTime,Calendar.MONTH));
        System.out.println("当前时间比测试时间:DATE----------->"+DateUtils.truncatedCompareTo(now,testTime,Calendar.DATE));
        System.out.println("当前时间比测试时间:HOUR----------->"+DateUtils.truncatedCompareTo(now,testTime,Calendar.HOUR));
        System.out.println("当前时间比测试时间:MINUTE----------->"+DateUtils.truncatedCompareTo(now,testTime,Calendar.MINUTE));
        System.out.println("当前时间比测试时间:SECOND----------->"+DateUtils.truncatedCompareTo(now,testTime,Calendar.SECOND));
    }
}
