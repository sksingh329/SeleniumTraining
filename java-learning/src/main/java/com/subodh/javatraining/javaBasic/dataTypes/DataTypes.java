package com.subodh.javatraining.javaBasic.dataTypes;

public class DataTypes {
    int x; //instance
    static char charA;
    public static void main(String[] args) {
        //System.out.println(getIntDefaultValue());
        byteDemo();
        //binaryDemo(-128);
    }

    public static int getIntDefaultValue(){
        return 0;
    }
    public static void byteDemo(){
        char charDemo = 'a';
        String strName = "a";
        int a; // local
        System.out.println(charA);
        a = 10;
        //System.out.println(a); // Local variable are not given any default value
    }
    public static void binaryDemo(int val){
        System.out.println(Integer.toBinaryString(val));
        byte b1 = (byte) val;
        String s1 = String.format("%8s", Integer.toBinaryString(b1 & 0xFF)).replace(' ', '0');
        System.out.println(s1);

        int numberGears = 10;
    }
}