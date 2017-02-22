package com.levent_j.Exercise_30;

/**
 * Created by levent_j on 17-2-21.
 */
public class Test {
    public static void main(String[] agrs){
        int[] nums = new Solution().getLastMinNumbers(new int[]{4,5,1,6,2,7,3,8},4);

        for (int num : nums) {
            System.out.print(" "+num);
        }

        System.out.println();
        String s = "12345";
        System.out.print(s.substring(s.length()-1));
    }
}
