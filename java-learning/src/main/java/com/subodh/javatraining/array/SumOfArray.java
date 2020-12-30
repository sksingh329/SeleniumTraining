package com.subodh.javatraining.array;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {10,1000,30,90,50};
        System.out.println(arr[7]);
        int sum = 0;
        int search = 100;
        int index = -1;
        for(int num: arr)
            sum += num;
        //System.out.println("Sum is "+sum);
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == search){
                index = i;
                break;
            }
        }
        /*
        if(index >= 0)
            System.out.println("Element is found and index is "+index);
        else
            System.out.println("Element not found in array");
         */
        //Finding maximum value in array
        int max = Integer.MIN_VALUE;
        for(int num:arr){
            if(num > max)
                max = num;
        }
        System.out.println("Maximum value in array is "+max);
        //Second largest element
        int max1,max2;
        max1 = max2 = arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max1){
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i]>max2)
                max2 = arr[i];
        }
        System.out.println("Second highest value in array is "+max2);
    }

}
