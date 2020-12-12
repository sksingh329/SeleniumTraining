package com.subodh.javatraining.javaBasic.controlStatementEx;

public class CheckPrime {
    public static void main(String[] args) {
        int num;
        boolean isPrime;
        num = 21;
        if(num<2) isPrime = false;
        else isPrime = true;

        for(int i = 2; i <= num/i; i++){
            System.out.println(i);
            if((num % i ) == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime) System.out.println("Prime");
        else System.out.println("Not prime");
    }
}
