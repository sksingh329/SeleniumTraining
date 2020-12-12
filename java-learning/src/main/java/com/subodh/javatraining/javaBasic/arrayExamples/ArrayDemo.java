package com.subodh.javatraining.javaBasic.arrayExamples;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {100,20,40,100,10};
        int search = 10;
        int max = arr[0];
        for(int i=1; i< arr.length; i++){
            if(arr[i] <= max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
