package com.levent_j.Exercise_30;

import java.util.Stack;

/**
 * Created by levent_j on 17-2-21.
 */
public class Solution {
    public int[] getLastMinNumbers(int[] nums,int least){
        if (nums==null||nums.length<1){
            return null;
        }

        int[] minNumbers = new int[least];
        int emptySpace = least;

        for (int i = 0; i < nums.length; i++) {
            if (emptySpace>0){
                minNumbers[emptySpace-1] = nums[i];
                emptySpace--;
            }else {
                int maxIndex = getMaxIndex(minNumbers);
                if (minNumbers[maxIndex]>nums[i]){
                    minNumbers[maxIndex] = nums[i];
                }
            }
        }

        return minNumbers;
    }

    private int getMaxIndex(int[] nums) {
        int index = 0;
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>max){
                index = i;
                max = nums[i];
            }
        }
        return index;
    }
}
