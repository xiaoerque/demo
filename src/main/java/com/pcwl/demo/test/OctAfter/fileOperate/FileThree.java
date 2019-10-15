package com.pcwl.demo.test.OctAfter.fileOperate;

import java.io.File;

public class FileThree {//用递归的方式列出目录结构
    public static void main(String[] args) {
        File file = new File("E:"+File.separator+"File");
        listDir(file);
    }
    private static void listDir(File file){
        if(file.isDirectory()){
           File[] list = file.listFiles();
            if(list!=null){
                for (int i = 0; i < list.length; i++) {
                    listDir(list[i]);
                }
            }
        }
        System.out.println(file.getName());
    }
}
