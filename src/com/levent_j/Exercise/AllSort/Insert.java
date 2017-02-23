package com.levent_j.Exercise.AllSort;

/**
 * Created by levent_j on 17-2-23.
 */
public class Insert {
    //直接插入
    public int[] DirectInsert(int[] nums){
        if (nums==null||nums.length<1){
            return null;
        }

        for (int i=1;i<nums.length;i++){
            int j=i-1;
            int num = nums[i];
            for (;j>=0;j--){
                if (num>nums[j]){
                    break;
                }else {
                    nums[j+1] = nums[j];
                    nums[j] = num;
                }
            }
        }

        return nums;
    }

    //希尔排序
    public int[] ShellSort(int[] nums){
        if (nums==null||nums.length<1){
            return null;
        }


        int group = nums.length/2;
        if (nums.length%2!=0){
            group++;
        }

        int space = nums.length/group;

        while (group>0){
            for (int i=0;i<nums.length;i+=space){
                int length = 0;
                if (i+space<nums.length){
                    length = space;
                }else {
                    length = nums.length-i;
                }
                int[] change = new int[length];
                System.arraycopy(nums,i,change,0,length);
                DirectInsert(change);
                System.arraycopy(change,0,nums,i,length);
            }

            if (group==1){
                break;
            }
            if (group%2!=0){
                group = group/2 + 1;
            }else {
                group /= 2;
            }
            space = nums.length/group;
        }

        return nums;

    }
}
