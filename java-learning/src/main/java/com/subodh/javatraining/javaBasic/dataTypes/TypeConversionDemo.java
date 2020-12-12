package com.subodh.javatraining.javaBasic.dataTypes;

public class TypeConversionDemo {
    public static void main(String[] args) {
        byte b;
        int i = 140;
        char a ='a';
        String name = "Subodh";
        boolean flag  = true;
        b = (byte) i; //-128 to 127
        //a = name;
        //b = flag;
        System.out.println(b);
    }
}
