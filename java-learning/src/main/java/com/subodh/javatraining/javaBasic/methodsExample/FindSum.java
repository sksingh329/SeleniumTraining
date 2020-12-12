package com.subodh.javatraining.javaBasic.methodsExample;

public class FindSum {
    public static void main(String...args) {
        int sum = findSum("qwqwqwq",10,30,20,1,100,10);
        System.out.println(sum);
    }
    public static int findSum(String b,int...args){
        int sum = 0;
        System.out.println(args.length);
        for (int num:args) {
            sum += num;
        }
        return sum;
    }
}
