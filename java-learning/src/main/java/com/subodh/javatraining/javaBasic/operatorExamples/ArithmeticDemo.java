package com.subodh.javatraining.javaBasic.operatorExamples;

public class ArithmeticDemo {
    public static void main(String[] args) {
        int x =5;
        int z = 2 * x++ + 3 * ++x;
        System.out.println(z);
    }
}
