package com.subodh.javatraining.javaBasic.controlStatementEx;

public class SwitchDemo {
    public static void main(String[] args) {
        int val = 1;
        if(val == 1)
            System.out.println("One");
        else if(val == 2)
            System.out.println("Two");
        else
            System.out.println("Greater than 2");

        switch (val){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Greater than 2");
        }
    }
}
