package com.levent_j.Exercise_31;

/**
 * Created by levent_j on 17-2-22.
 */
public class Solution {
    public int findMaxSumInNums(int[] nums){
        if (nums==null||nums.length<1){
            return 0;
        }

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (currentSum<=0){
                currentSum = nums[i];
            }else {
                currentSum += nums[i];
            }

            if (currentSum>=maxSum){
                maxSum = currentSum;
            }
        }

        return maxSum;
    }
}
