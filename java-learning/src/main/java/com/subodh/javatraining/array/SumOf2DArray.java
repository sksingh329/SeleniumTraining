package com.subodh.javatraining.array;

public class SumOf2DArray {
    public static void main(String[] args) {
        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[2][3];
        int[][] sum  = new int[2][3];

        arr1[0] = new int[]{1, 2, 3};
        arr1[1] = new int[]{4,5,6};
        arr2[0] = new int[]{1, 2, 3};
        arr2[1] = new int[]{4,5,6};

        for(int i = 0; i< arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        for (int[] x: sum){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}
