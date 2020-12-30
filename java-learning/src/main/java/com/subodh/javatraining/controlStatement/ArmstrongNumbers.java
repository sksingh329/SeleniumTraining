package com.subodh.javatraining.controlStatement;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        int value = 370;
        int sumOfCube = 0;
        int remainder=0;
        int num = value;
        while(num>0){
            remainder = num % 10;
            sumOfCube += (remainder*remainder*remainder);
            num = num / 10;
        }
        if(sumOfCube == value)
            System.out.println("Armstrong number");
        else
            System.out.println("Not armstrong number");
    }
}

