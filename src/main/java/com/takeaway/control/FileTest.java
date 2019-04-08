package com.takeaway.control;


import java.io.*;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("./");
        eachfile(file);

    }

    private static void eachfile(File file){
        if (file.isDirectory()){
            for (File listFile : file.listFiles()){
                eachfile(listFile);
            }
        }
        System.out.println(file.getAbsolutePath());
        // 默认相对路径
    }
}
