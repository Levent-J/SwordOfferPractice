package com.levent_j.Exercise_14;

/**
 * Created by levent_j on 17-2-5.
 */
public class Exercise_14 {
    public void reorder(int[] nums){
        if (nums==null||nums.length<1){
            return;
        }
        int left = 0;
        int right = nums.length-1;
        while (left<right){
            while (left<right&&(nums[left]&0x1)!=0){
                left++;
            }
            while (left<right&&(nums[right]&0x1)==0){
                right--;
            }
            if (left<right){
                int swap = nums[left];
                nums[left] = nums[right];
                nums[right] = swap;
            }
        }
    }
}
