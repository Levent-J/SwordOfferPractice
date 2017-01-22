package com.levent_j.Exercise.SortRxercise;

/**
 * Created by levent_j on 17-1-22.
 */
public class Test {
    public static void main(String[] agrs){
        testSort(new int[]{1,2,3,4,5});
        testSort(new int[]{5,4,3,2,1});
        testSort(new int[]{1,4,3,2,5});
        testSort(new int[]{4,2,1,3,5});
    }

    private static void testSort(int[] nums) {
        new SortExercise().quick(nums,0,nums.length-1);
        for (int num : nums) {
            System.out.print("["+num+"]");
        }
        System.out.println();
    }
}
