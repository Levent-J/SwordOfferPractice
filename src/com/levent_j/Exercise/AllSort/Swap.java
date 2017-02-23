package com.levent_j.Exercise.AllSort;

/**
 * Created by levent_j on 17-2-23.
 */
public class Swap {
    //冒泡排序
    public int[] BubbleSort(int[] nums){
        if (nums==null||nums.length<1){
            return null;
        }

        for (int i = 0; i <= nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return nums;
    }

    //快速排序
    public int[] QuickSort(int[] nums){
        if (nums==null||nums.length<1){
            return null;
        }
        QuickSort(nums,0,nums.length-1);
        return nums;
    }

    private void QuickSort(int[] nums, int i, int j) {

        if (i<j){
            int left = i;
            int right = j;
            int num = nums[left];
            while (left<right){
                while (left<right && nums[right]>num){
                    right--;
                }
                if (left<right){
                    nums[left++] = nums[right];
                }
                while (left<right && nums[left]<num){
                    left++;
                }
                if (left<right){
                    nums[right] = nums[left];
                }
            }
            nums[left] = num;
            QuickSort(nums, i, right-1);
            QuickSort(nums, left+1, j);
        }

    }

}
