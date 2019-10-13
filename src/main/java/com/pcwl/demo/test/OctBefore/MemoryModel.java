package com.pcwl.demo.test.OctBefore;

import java.util.HashMap;

public class MemoryModel {
    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime();//取得Runtime类的对象
        System.out.println("MAX_MEMORY=" + run.maxMemory());//系统分配的运行空间
        System.out.println("TOTAL_MEMORY=" + run.totalMemory());
        System.out.println("FREE_MEMORY=" + run.freeMemory());
        //HashMap
    }
}
