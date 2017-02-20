package com.levent_j.Exercise_29;

/**
 * Created by levent_j on 17-2-20.
 */
public class Solution {
    public int moreThanHalfMore(int[] nums){
        if (nums==null||nums.length<1){
            return 0;
        }

        int num = nums[0];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count==0){
                num = nums[i];
            }

            if (nums[i]==num){
                count++;
            }else {
                count--;
            }
        }

        return num;
    }
}
