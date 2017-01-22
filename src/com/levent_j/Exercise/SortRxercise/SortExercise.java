package com.levent_j.Exercise.SortRxercise;

/**
 * Created by levent_j on 17-1-22.
 */
public class SortExercise {
    //直接插入
    public void insertDirectSort(int[] nums){
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
    public void bubbleSort(int[] nums){
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
    public void quickSort(int[] nums, int start, int end){
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
            quickSort(nums,start,i-1);
        }
        if (i+1<end){
            quickSort(nums,i+1,end);
        }
    }
    //选择排序
    public void selectSort(int[] nums){
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
    //二路归并排序
    public void mergeSort(int[] nums){
        mergeSort(nums,0,nums.length-1);
    }

    private void mergeSort(int[] nums, int left, int right) {
        if (left>=right){
            return;
        }
        int mid = (left+right)/2;
        mergeSort(nums,left,mid);
        mergeSort(nums,mid+1,right);
        merge(nums,left,mid,right);
    }

    private void merge(int[] nums, int left, int mid, int right) {
        int[] tmp = new int[nums.length];
        int r2 = mid+1;
        int l2 = left;
        int s2 = left;
        int index = left;
        while (l2<=mid&&r2<=right){
            if (nums[l2]<nums[r2]){
                tmp[index++] = nums[l2++];
            }else {
                tmp[index++] = nums[r2++];
            }
        }
        while (s2<=right){
            nums[s2++] = tmp[s2++];
        }
    }
}
