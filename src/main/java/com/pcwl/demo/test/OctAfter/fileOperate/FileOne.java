package com.pcwl.demo.test.OctAfter.fileOperate;


import java.io.File;

public class FileOne {

    public static void main(String[] args) throws Exception{
        File file = new File("E:"+File.separator+"fileName.log");//separator:Windows是\Linux是/;So 用separator做分隔符
        if(!file.getParentFile().exists()){ //父路径不存在
            file.getParentFile().mkdirs();  //创建父路径
        }
        if(file.exists()){
            System.out.println("文件:fileName存在");
            file.delete();
            System.out.println("文件:fileName删除");
        }else{
            file.createNewFile();
            System.out.println("创建一个文件:fileName");
        }
    }
}
