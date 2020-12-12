package com.subodh.javatraining.javaBasic.controlStatementEx;

/***
 * Leap year - A year is a leap year not only if it is divisible by 4 --
 * it also has to be divisible by 400 if it is a centurial year.
 */
public class LeapYear {
    public static void main(String[] args) {
        int year = 2021;
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println("Leap year");
                }
                else
                    System.out.println("Not a Leap Year");
            }
            else
                System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}
