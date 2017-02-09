package com.levent_j.Exercise_20;

/**
 * Created by levent_j on 17-2-8.
 */
public class Test {
    public static void main(String[] args){
        int[][] matrix = new int[][]{
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25},
        };
        print(matrix);
        System.out.println();
        new Solution().PrintMatrix(matrix);
    }

    private static void print(int[][] matrix){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                System.out.print(" "+matrix[i][j]);
            }
            System.out.println();
        }
    }
}
