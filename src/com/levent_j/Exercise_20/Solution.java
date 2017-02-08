package com.levent_j.Exercise_20;

/**
 * Created by levent_j on 17-2-8.
 */
public class Solution {
    public void PrintMatrix(int[][] matrix){
        if (matrix==null||matrix[0].length<1){
            return;
        }
        //列
        int columns = matrix[0].length;

        //行
        int rows = matrix.length;

        int start = 0;
        while (columns>start*2&&rows>start*2){
            PrintMatrixCircle(matrix,columns,rows,start);
            start++;
        }
    }

    private void PrintMatrixCircle(int[][] matrix, int columns, int rows, int start) {
        int endX = columns-1-start;
        int endY = rows-1-start;

        //从左向右
        for (int i=start;i<=endX;i++){
            System.out.print(" "+matrix[start][i]);
        }

        if (start<endY){
            //从上向下
            for (int i=start+1;i<=endY;i++){
                System.out.print(" "+matrix[i][endX]);
            }
        }

        if (start<endX&&start<endY){
            //从右向左
            for (int i=endX-1;i>=start;i--){
                System.out.print(" "+matrix[endY][i]);
            }
        }

        if (start<endX&&start<endY-1){
            //从下到上
            for (int i=endY-1;i>=start+1;i--){
                System.out.print(" "+matrix[i][start]);
            }
        }
    }
}
