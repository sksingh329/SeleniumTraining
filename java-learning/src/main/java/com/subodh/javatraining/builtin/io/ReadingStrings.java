package com.subodh.javatraining.builtin.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingStrings {
    public static void main(String[] args) throws IOException {
        String input;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter character, 'stop' to quit");
        do{
            input = bufferedReader.readLine();
            System.out.println(input);
        }while (!input.equals("stop"));
    }
}
