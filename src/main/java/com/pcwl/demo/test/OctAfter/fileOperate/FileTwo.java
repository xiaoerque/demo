package com.pcwl.demo.test.OctAfter.fileOperate;

import java.io.File;
import java.text.SimpleDateFormat;

class MathUtil{//手写四舍五入
    private MathUtil(){}
    public static double round(double num,int scale){
        return Math.round(Math.pow(10,scale)*num)/Math.pow(10,scale);
    }
}

public class FileTwo {
    public static void main(String[] args) {
        File file = new File("E:"+File.separator+"File"+File.separator+"2"+File.separator+"4.png");
        System.out.println("该路径文件名称:"+file.getName());
        System.out.println("该路径文件是否可读:"+file.canRead());
        System.out.println("该路径文件是否可写:"+file.canWrite());
        System.out.println("该路径是否是文件夹:"+file.isDirectory());
        System.out.println("该路径是否是文件:"+file.isFile());
        System.out.println("该路径文件大小:"+MathUtil.round((double)file.length()/1024/1024,2));//返回的类型是long字节形
        //System.out.println("为该文件改名是否成功:"+file.renameTo();
        //System.out.println("改名后路径文件名称:"+file.getName());
        System.out.println("上次修改时间:"+new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(file.lastModified()));
    }
}
