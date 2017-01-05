package com.levent_j.Exercise_3;

public class Main {

    public boolean find(int[][] matrix,int number){
        for (int i=0;i<matrix.length;i++){
            for (int j=matrix[i].length-1;j>=0;j--){
                if (number<matrix[i][j]){
                    continue;
                }else if (number>matrix[i][j]){
                    break;
                }else {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
            {1,2,8,9},
            {2,4,9,12},
            {4,7,10,13},
            {6,8,11,15}
        };
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[");
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+",");
            }
            System.out.println("]");
        }

        System.out.print(new Main().find(matrix,111));
    }
}
