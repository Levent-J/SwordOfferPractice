package com.levent_j.Exercise.AllSort;

/**
 * Created by levent_j on 17-2-23.
 */
public class Select {
    //直接选择
    public int[] DirectSelect(int[] nums){
        if (nums==null||nums.length<1){
            return null;
        }

        for (int i = 0; i < nums.length; i++) {
            int index = i;
            for (int j=i+1;j<nums.length;j++){
                if (nums[j]<nums[index]){
                    index = j;
                }
            }
            if (index!=i){
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
            }
        }

        return nums;
    }

    //堆排序
    //好鸡儿麻烦 不写了 艹
}
