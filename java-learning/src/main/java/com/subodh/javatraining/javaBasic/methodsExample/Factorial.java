package com.subodh.javatraining.javaBasic.methodsExample;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(4));
    }
    static int fact(int n){
        int factNum=1;
        //if(n == 1) return 1;
        factNum = n * fact(n - 1);
        return factNum;
    }
}
