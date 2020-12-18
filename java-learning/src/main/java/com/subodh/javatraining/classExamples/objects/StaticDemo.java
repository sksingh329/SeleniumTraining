package com.subodh.javatraining.classExamples.objects;

public class StaticDemo {

    public static int count;

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
