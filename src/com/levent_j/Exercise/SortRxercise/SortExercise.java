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
    //冒泡排序
    public void bubble(int[] nums){
        if (nums.length<2){
            return;
        }
        int p = 0;
        int k = nums.length-1;
        boolean sorted = true;
        for (int i=0;i<nums.length-1;i++){
            for (int j=0;j<k;j++){
                if (nums[j]>nums[j+1]){
                    sorted = false;
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    p = j+1;
                }
            }
            k=p;
            if (sorted){
                break;
            }else {
                sorted = true;
            }
        }

        for (int num : nums) {
            System.out.print("["+num+"]");
        }
    }
}
