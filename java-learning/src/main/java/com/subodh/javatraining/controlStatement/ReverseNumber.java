package com.subodh.javatraining.controlStatement;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 26;
        int reverse  = 0, remender = 0;
        while(num > 0){
            remender = num % 10;
            reverse = (reverse * 10) + remender;
            num = num / 10;
        }
        System.out.println(reverse);
    }
}

