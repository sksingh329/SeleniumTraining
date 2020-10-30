package com.subodh.javatraining.javaBasic;

public class OperatorDemo {
    public static void main(String[] args) {
        byte val1 = 0b0011;
        byte val2 = 0b0000;

        System.out.println(val1&val2);
        System.out.println(val1|val2);
        System.out.println(val1>>1);
        System.out.println(val1<<1);
    }
}
