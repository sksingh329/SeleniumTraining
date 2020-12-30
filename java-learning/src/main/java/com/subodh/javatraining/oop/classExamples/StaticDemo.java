package com.subodh.javatraining.oop.classExamples;

public class StaticDemo {

    public static int count;
    public final int ARRAY_SIZE = 10;
    public int changeFinal(final int a, final int b){
        //ARRAY_SIZE = 12;
        //a = 10;
        final int sum;
        sum = a + b;
        //sum = 10;
        return sum;
    }

    static{
        count = 0;
        System.out.println("This is called inside static block");
    }

    public static int getCount(){
        return count;
    }
    public StaticDemo(){
        count++;
    }
}
