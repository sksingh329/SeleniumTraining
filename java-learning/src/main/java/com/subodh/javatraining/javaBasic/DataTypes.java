package com.subodh.javatraining.javaBasic;

public class DataTypes {
    static int b;
    public static void main(String[] args) {
        //System.out.println(getIntDefaultValue());
        //byteDemo();
        binaryDemo(9);
    }
    public static int getIntDefaultValue(){
        return b;
    }
    public static void byteDemo(){
        byte a = 127;
        byte c = (byte) (a + 2);
        System.out.println(c);
    }
    public static void binaryDemo(int val){
        System.out.println(Integer.toBinaryString(val));
    }
}