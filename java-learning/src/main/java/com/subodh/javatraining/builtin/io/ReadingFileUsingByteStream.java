package com.subodh.javatraining.builtin.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingFileUsingByteStream {
    public static void main(String[] args) {
        String directoryPath = System.getProperty("user.dir");
        String fileName = directoryPath+"/java-learning/src/main/resources/files/readText.txt";
        try(FileInputStream fileInputStream = new FileInputStream(fileName)) {
            int size = fileInputStream.available();
            System.out.println("Total Available Bytes: "+size);
            //for(int i =1;i<=size;i++)
                System.out.println((char) fileInputStream.read());
            fileInputStream.skip(10);
            byte b[] = new byte[10];
            fileInputStream.read(b,0,5);
            for(byte b1:b)
                System.out.print((char)b1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } ;
    }
}
