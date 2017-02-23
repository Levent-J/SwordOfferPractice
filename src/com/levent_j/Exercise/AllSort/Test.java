package com.levent_j.Exercise.AllSort;

/**
 * Created by levent_j on 17-2-23.
 */
public class Test {
    public static void main(String[] args){
        int[] nums = new int[]{2,4,3,7,5,8,9,6};
        printNums(nums);
        printNums(new Insert().ShellSort(nums));
    }

    public static void printNums(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.print(" "+nums[i]);
        }
        System.out.println();
    }

    public static void change(int[] nums){
        nums[0] = 100;
    }
}
