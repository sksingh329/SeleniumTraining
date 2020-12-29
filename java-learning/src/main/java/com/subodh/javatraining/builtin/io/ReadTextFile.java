package com.subodh.javatraining.builtin.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadTextFile {
    public static void main(String[] args) {
        int i;
        String directoryPath = System.getProperty("user.dir");
        String fileName = directoryPath+"/java-learning/src/main/resources/files/readText.txt";
        try(FileOutputStream fileOutputStream = new FileOutputStream(fileName)){
            fileOutputStream.write(68);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(FileInputStream fileInputStream = new FileInputStream(fileName)){
            do{
                i = fileInputStream.read();
                if(i != -1) System.out.println((char) i);
            } while(i!=-1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    String name = "subodh";
    }
}
