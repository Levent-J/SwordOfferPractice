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
    //快速排序
    public void quick(int[] nums,int start,int end){
        int key = nums[start];
        int i=start;
        int j=end;
        while (i<j){
            while (nums[j]>key&&j>i){
                j--;
            }
            nums[i] = nums[j];
            while (nums[i]<key&&j>i){
                i++;
            }
            nums[j] = key;
        }

        if (i-1>start){
            quick(nums,start,i-1);
        }
        if (i+1<end){
            quick(nums,i+1,end);
        }
    }
    //选择排序
    public void select(int[] nums){
        if (nums.length<2){
            return;
        }

        for (int i=0;i<nums.length;i++){
            int minIndex = i;
            for (int j=i+1;j<nums.length;j++){
                if (nums[j]<nums[minIndex]){
                    minIndex = j;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
    }
}
