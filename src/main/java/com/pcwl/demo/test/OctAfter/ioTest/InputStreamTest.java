package com.pcwl.demo.test.OctAfter.ioTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamTest {
    //字节的输入:不同的子类,方法可能不同
    public static void main(String[] args) throws Exception{
        File file = new File("E:"+File.separator+"Stream"+File.separator+"OutPut"+File.separator+"outPutStream.txt");
        InputStream input = new FileInputStream(file);
        byte data[] = new byte[1024];       //开辟一个字节输入流的缓冲区
        int len =input.read(data);
        System.out.println("["+new String(data,0,len)+"]");
        input.close();
    }
}
