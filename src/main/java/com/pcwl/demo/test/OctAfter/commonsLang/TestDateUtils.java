package com.pcwl.demo.test.OctAfter.commonsLang;


import org.apache.commons.lang3.time.DateUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

import static java.util.Calendar.*;
import static org.apache.commons.lang3.time.DateUtils.*;

public class TestDateUtils {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DateFormat pointFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
      //addDays:
        //System.out.println("添加两天:"+ sdf.format(DateUtils.addDays(date,2)));
      //addHours:Adds a number of hours to a date returning a new object. The original Date is unchanged
        //System.out.println("增加两个小时:"+sdf.format(DateUtils.addHours(date,2)));
      //addMinutes:Adds a number of minutes to a date returning a new object. The original Date is unchanged
        //System.out.println("增加两分钟:"+sdf.format(DateUtils.addMinutes(date,2)));
      //ceiling:Gets a date ceiling, leaving the field specified as the most significant field
        /*System.out.println("向上取整年:"+sdf.format(ceiling(date,1)));
        System.out.println("向上取整月:"+sdf.format(ceiling(date,2)));
        System.out.println("向上取整时:"+sdf.format(ceiling(date,HOUR)));
        */
      //getFragment*:Returns the number of days within the fragment
        /*System.out.println("当年过了多少天:"+DateUtils.getFragmentInDays(date,YEAR));
        System.out.println("当月过了多少天:"+DateUtils.getFragmentInDays(date,MONTH));
        System.out.println("当年过了多少时:"+DateUtils.getFragmentInHours(date,YEAR));
        System.out.println("当年过了多少分:"+DateUtils.getFragmentInMinutes(date,YEAR));
        System.out.println("当年过了多少秒:"+DateUtils.getFragmentInSeconds(date,YEAR));
        */
      //isSameDay:Checks if two calendar objects are on the same day ignoring time
        /*System.out.println("判断今天是不是2019-10-21:"+DateUtils.isSameDay(date,pointFormat.parse("2019-10-21")));
        System.out.println("判断今天是不是2019-10-22:"+DateUtils.isSameDay(date,new SimpleDateFormat("yyyy-MM-dd").parse("2019-10-22")));
        */
      //iterator的使用:不太会使用,不知道开工作中是否有什么作用!
        /*Iterator<Calendar> iterator = DateUtils.iterator(date, RANGE_WEEK_CENTER);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
      //parseDate()的使用:下面这个报错
        //System.out.println(DateUtils.parseDate("20181223 12:34:23",  Locale.TRADITIONAL_CHINESE,"yyyy-MM-dd HH:mm:ss"));
      //setYears()
        //System.out.println(sdf.format(DateUtils.setYears(date,2011)));
      //toCalendar():转化的类型是一个calendar日历类型
        /*Calendar calendar = DateUtils.toCalendar(date);
        System.out.println("这是一个Calendar日历类型:"+ calendar);
        System.out.println(sdf.format(calendar.getTime()));
        */
      //truncate():Truncates a date, leaving the field specified as the most significant field.
        //System.out.print(sdf.format(DateUtils.truncate(date,1)));
      //truncateEquals():Determines if two dates are equal up to no more than the specified most significant field
        System.out.println("判断两个日期是不是同一年:"+DateUtils.truncatedEquals(date, pointFormat.parse("2018-01-02"), 1));


    }
}
