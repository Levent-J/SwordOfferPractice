package com.levent_j.Exercise_24;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by levent_j on 17-2-12.
 */
public class Solution {
    public boolean VerifySquenceOfBAST(int[] nums){
        if (nums==null||nums.length<1){
            return false;
        }
        int indexOfRoot = nums.length-1;

        int indexOfMid = 0;

        //查找左子树的数组
        for (;indexOfMid<indexOfRoot;indexOfMid++){
            if (nums[indexOfMid]>nums[indexOfRoot]){
                break;
            }
        }


        //检查右子数
        for (int i=indexOfMid;i<indexOfRoot;i++){
            if (nums[i]<nums[indexOfRoot]){
                return false;
            }
        }

        int[] left = new int[indexOfMid];
        int[] right = new int[indexOfRoot-indexOfMid];

        boolean isLeft = true;
        boolean isRight = true;

        if (indexOfMid>0){
            System.arraycopy(nums,0,left,0,indexOfMid);
            isLeft = VerifySquenceOfBAST(left);
        }
        if (indexOfMid<indexOfRoot){
            System.arraycopy(nums,indexOfMid,right,0,indexOfRoot-indexOfMid);
            isRight =VerifySquenceOfBAST(right);
        }

        return (isLeft&&isRight);
    }
}
