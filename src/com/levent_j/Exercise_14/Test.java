package com.levent_j.Exercise_14;

/**
 * Created by levent_j on 17-2-5.
 */
public class Test {
    public static void main(String[] args){
        int[] nums = new int[]{1,2,3,4,5,6,7,8};
        for (int num : nums) {
            System.out.print("["+num+"] ");
        }
        new Exercise_14().reorder(nums);
        System.out.println();
        for (int num : nums) {
            System.out.print("["+num+"] ");
        }
    }
}
