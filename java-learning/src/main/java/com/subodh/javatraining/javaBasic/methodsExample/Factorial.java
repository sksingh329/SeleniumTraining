package com.subodh.javatraining.javaBasic.methodsExample;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(6));
    }
    static int fact(int n){
        int result;
        if(n == 1) return 1;
        result = fact(n - 1) * n;
        return result;
    }
}
