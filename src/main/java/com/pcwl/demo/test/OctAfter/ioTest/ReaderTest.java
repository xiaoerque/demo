package com.pcwl.demo.test.OctAfter.ioTest;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderTest {
    public static void main(String[] args) throws IOException {
        File file = new File("E:"+File.separator+"Stream"+File.separator+"OutPut"+File.separator+"writerTest.txt");
        if(file.exists()){
            Reader reader = new FileReader(file);
            char getchar[] = new char[1024];
            int len = reader.read(getchar);
            System.out.println("读取内容:"+new String(getchar,0,len));
            reader.close();
        }else{
            System.out.println("没有该文件!");
        }

    }
}
