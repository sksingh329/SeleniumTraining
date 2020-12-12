package com.subodh.javatraining.javaBasic.methodsExample;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 31;
        System.out.println("Is number "+num+ " is prime "+isPrime(num));
    }
    public static boolean isPrime(int num){
        boolean isPrime = true;
        for(int i = 2; i <= num /2 ; i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
