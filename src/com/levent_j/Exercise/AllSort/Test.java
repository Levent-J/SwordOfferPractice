package com.levent_j.Exercise.AllSort;

/**
 * Created by levent_j on 17-2-23.
 */
public class Test {
    public static void main(String[] args){
        int[] nums = new int[]{2,4,1,3,7,5,8,9,6};
        printNums(nums);
        System.out.println("直接插入：");
        printNums(new Insert().DirectInsert(nums));
        System.out.println("希尔排序：");
        printNums(new Insert().ShellSort(nums));
        System.out.println("直接选择：");
        printNums(new Select().DirectSelect(nums));
        System.out.println("冒泡排序：");
        printNums(new Swap().BubbleSort(nums));
        System.out.println("快速排序：");
        printNums(new Swap().QuickSort(nums));
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
