package com.levent_j.Exercise.SortRxercise;

/**
 * Created by levent_j on 17-1-22.
 */
public class SortExercise {
    //直接插入
    public void insertDirect(int[] nums){
        if (nums.length<2){
            return;
        }
        for (int i=1;i<nums.length;i++){
            int num = nums[i];
            int j=i-1;
            for (;j>=0&&num<nums[j];j--){
                nums[j+1] = nums[j];
            }
            nums[j+1] = num;
        }
        for (int num : nums) {
            System.out.print("["+num+"]");
        }
    }
}
