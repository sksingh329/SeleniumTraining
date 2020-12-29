package com.subodh.javatraining.builtin.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextEditor {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] fileContent = new String[100];
        System.out.println("Enter content of file, type stop to quit");
        for(int i = 0; i< 100; i++){
            fileContent[i] = bufferedReader.readLine();
            if(fileContent[i].equalsIgnoreCase("stop")) break;
        }
        System.out.println("File content");
        for(String line:fileContent){
            if(line.equalsIgnoreCase("stop")) break;
            System.out.println(line);
        }

    }
}
