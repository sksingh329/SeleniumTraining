package com.subodh.javatraining.javaBasic.methodsExample;

public class ParameterPassingDemo {
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        System.out.println("First Element is "+arr[0]); //10
        takeArray(arr); // method call
        System.out.println("First Element is "+arr[0]); //50
        int[] newArr = addBy10(arr);

        for(int num:newArr)
            System.out.println(num);

        for(int i = 0; i < newArr.length; i++)
            System.out.println(newArr[i]);
    }
    static void takeArray(int[] array){
        array[0] = 50;
    }
    static int[] addBy10(int[] array){
        int[] output = new int[array.length];
        for(int i=0;i<array.length;i++){
            output[i] = array[i] + 10;
        }
        return output;
    }
}
