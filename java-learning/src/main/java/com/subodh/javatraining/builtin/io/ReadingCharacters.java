package com.subodh.javatraining.builtin.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadingCharacters {
    public static void main(String[] args) throws IOException {
        //displayCharacter();
        PrintWriter pw = new PrintWriter(System.out,true);
        pw.println(addNumbers());
    }
    public static int addNumbers() throws IOException {
        int sum = 0;
        int num = 0;
        System.out.println("Enter numbers, '-1' to quit");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while(num != -1){
            num = Integer.parseInt(bufferedReader.readLine());
            if(num == -1) break;;
            sum += num;
        }
        return sum;
    }
    public static void displayCharacter() throws IOException {
        char c;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter character, 'q' to quit");
        do{
            c = (char) bufferedReader.read();
            System.out.println(c);
        }while (c != 'q');
    }
}

