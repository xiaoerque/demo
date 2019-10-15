package com.pcwl.demo.test.OctAfter.ioTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;


public class OutputStreamTest {
    //
    public static void main(String[] args) throws Exception {
        File file = new File("E:"+File.separator+"Stream"+File.separator+"OutPut"+File.separator+"outPutStream.txt");
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        OutputStream output = new FileOutputStream(file,true);
        String str= "must byte\t\n";
        output.write(str.getBytes());
        output.close();
    }
}
