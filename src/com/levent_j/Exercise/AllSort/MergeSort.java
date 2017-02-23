package com.levent_j.Exercise.AllSort;

/**
 * Created by levent_j on 17-2-23.
 */
public class MergeSort {
    public void Road2MergeSort(int[] nums){
        if (nums==null||nums.length<1){
            return;
        }
        Road2MergeSort(nums,0,nums.length-1);
    }

    private void Road2MergeSort(int[] nums, int left, int right) {
        if (left>=right){
            return;
        }
        int mid = (right+left)/2;
        Road2MergeSort(nums,left,mid);
        Road2MergeSort(nums,mid+1,right);
        Merge(nums,left,mid,right);
    }

    private void Merge(int[] nums, int left, int mid, int right) {
        int[] swap = new int[right-left+1];
        int swapIndex = 0;
        int leftIndex = left;
        int rightIndex = mid+1;
        while (leftIndex<=mid&&rightIndex<=right){
            if (nums[leftIndex]<nums[rightIndex]){
                swap[swapIndex++] = nums[leftIndex++];
            }else {
                swap[swapIndex++] = nums[rightIndex++];
            }
        }
        while (leftIndex<=mid){
            swap[swapIndex++] = nums[leftIndex++];
        }
        while (rightIndex<=right){
            swap[swapIndex++] = nums[rightIndex++];
        }
//        while (left<=right){
//            nums[left++] = swap[left++];
//        }
        System.arraycopy(swap,0,nums,left,swap.length);
    }

}
