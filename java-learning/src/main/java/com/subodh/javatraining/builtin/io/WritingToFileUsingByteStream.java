package com.subodh.javatraining.builtin.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingToFileUsingByteStream {
    public static void main(String[] args) {
        String directoryPath = System.getProperty("user.dir");
        String fileName = directoryPath+"/java-learning/src/main/resources/files/writeText.txt";
        try(FileOutputStream fileOutputStream = new FileOutputStream(fileName,true)){
            String fileText = "tomorrow is 30th December 2020 and day is wednesday.\n"
                    +"Not sure what I will work tomorrow.";
            byte[] byteArray = fileText.getBytes();
            fileOutputStream.write(byteArray);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
