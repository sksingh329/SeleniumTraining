package com.subodh.javatraining.javaBasic.methodsExample;

public class AddNumber {
    public static void main(String[] args) {
        byte a = 10, b = 20;
        System.out.println(add(a,b));
    }
    public static int add(String a, String b){
        return 0;
    }
    public static int add(int a, int b){
        System.out.println("Inside int");
        return a + b;
    }
    public static int add(byte a, byte b){
        System.out.println("Inside byte");
        return a + b;
    }
    public static float add(float a, float b){
        System.out.println("Inside byte");
        return a + b;
    }
}
