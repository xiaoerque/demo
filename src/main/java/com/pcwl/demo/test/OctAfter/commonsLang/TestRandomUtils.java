package com.pcwl.demo.test.OctAfter.commonsLang;

import org.apache.commons.lang3.RandomUtils;

public class TestRandomUtils {

    public static void main(String[] args) {
        //System.out.println(TestNextBoolean());//Returns a random boolean value
        //TestNextBytes(6);//Creates an array of random bytes
        //System.out.print(TestNextDouble());//Returns a random double within 0 - Double.MAX_VALUE
        //System.out.println(TestNextDouble(1,2));
        //System.out.println(TestNextFloat());//Returns a random float within the specified range
        //System.out.println(TestNextFloat(2,3));
        //System.out.println(TestNextInt());
        //System.out.println(TestNextInt(5,8));
        System.out.println(TestNextLong());
        System.out.println(TestNextLong(8,10));

    }

     static boolean TestNextBoolean(){
        return RandomUtils.nextBoolean();
    }
    static void TestNextBytes(int count){
        byte[] chars = RandomUtils.nextBytes(count);
        for (int i = 0; i < chars.length; i++) {
            System.out.print(i);
        }
    }
    static double TestNextDouble(){
        return RandomUtils.nextDouble();
    }
    static double TestNextDouble(double start,double end){
        return RandomUtils.nextDouble(start, end);
    }
    static float TestNextFloat(){
        return RandomUtils.nextFloat();
    }
    static float TestNextFloat(float start,float end){
        return RandomUtils.nextFloat(start, end);
    }
    static int TestNextInt(){
        return RandomUtils.nextInt();
    }
    static int TestNextInt(int start,int end){
        return RandomUtils.nextInt(start, end);
    }
    static long TestNextLong(){
        return RandomUtils.nextLong();
    }
    static long TestNextLong(long start,long end){
        return RandomUtils.nextLong(start, end);
    }
}


