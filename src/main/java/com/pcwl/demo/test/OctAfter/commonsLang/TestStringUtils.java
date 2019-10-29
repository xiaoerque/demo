package com.pcwl.demo.test.OctAfter.commonsLang;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;

public class TestStringUtils {
    public static void main(String[] args) {
      //isEmpty的判断
        /*System.out.println("null:"+ StringUtils.isEmpty(null));
        System.out.println(""+StringUtils.isEmpty(""));
        System.out.println(" "+StringUtils.isEmpty(" "));
        System.out.println("上面两个分别是引号,和一个单个空格:"+StringUtils.isEmpty("上面两个分别是引号,和一个单个空格:"));
        */
      //isBlank是否为空的判断不同于isEmpty
        /*System.out.println("null:"+StringUtils.isBlank(null));
        System.out.println(""+StringUtils.isBlank(""));
        */
      //trim:Removes control characters (char <= 32) from both ends of this String, handling null by returning null.
        /*System.out.println(" blank :"+StringUtils.trim(" blank "));
        System.out.println(" blank blank :"+StringUtils.trim(" blank blank "));
        System.out.println(""+StringUtils.trimToNull(""));
        System.out.println(" "+StringUtils.trimToNull(" "));
        System.out.println("null:"+StringUtils.trimToEmpty(null));
        */
      //strip:Strips whitespace from the start and end of a String
      //strip(String str,String stripStr):Strips any of a set of characters from the start and end of a String
        /*System.out.println(" blank blank : "+StringUtils.strip(" blank blank : "));
        System.out.println(" abc def: "+StringUtils.strip(" abc def","ef"));
        String[] strStrip = new String[]{"aaBbCc","dDEeFf"};
        System.out.print("对数组stripAll的运用([\"aaBbCc\",\"dDEeFf\"],\"cd\"):");
        TestStripAll(strStrip,"cd");
        TestStripAll(new String[]{" 中华 ", "人 民 家 ", "共和 国 家"},"家");
        */
      //defaultString()和defaultString(String str,String defaultStr)
        /*System.out.println("null:"+StringUtils.defaultString(null));
        System.out.println("null:"+StringUtils.defaultString(null,"你输入的是null"));
        System.out.println(""+StringUtils.defaultString("","你什么都没有输入"));
        */
      //indexOf
        System.out.println(StringUtils.indexOf("soGood","G",2));
    }
    static void TestStripAll(String[] strs,String stripStr){
        String[] result = StringUtils.stripAll(strs,stripStr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }
}
