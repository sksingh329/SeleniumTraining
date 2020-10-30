package com.subodh.javatraining.javaBasic;

public class ArraysDemo {
    public static void main(String[] args) {
        int twoD[][] = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                twoD[i][j] = i + j;
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(twoD[i][j] +" ");
            }
            System.out.println();
        }
        //Print sum of each row
        int row[] = new int[3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                row[i] += twoD[i][j];
            }
        }
        System.out.println("Sum of each row are: ");
        for(int i = 0; i < 3; i ++){
            System.out.print(row[i] +" ");
        }
    }
}
