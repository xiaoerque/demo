package com.pcwl.demo.test.OctAfter.ioTest;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class WriterTest {
    public static void main(String[] args) throws Exception{
        File file = new File("E:"+File.separator+"Stream"+File.separator+"OutPut"+File.separator+"writerTest.txt");
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        Writer writer = new FileWriter(file,true);
        writer.write("天使的翅膀!\t\n");
        writer.append("给你想要的飞翔!");
        writer.close();
    }
}
