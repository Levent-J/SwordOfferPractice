package com.levent_j.Exercise_22;

/**
 * Created by levent_j on 17-2-9.
 */
public class Test {
    public static void main(String[] args){
        int[] push = new int[]{1,2,3,4,5};
        int[] pop = new int[]{4,5,3,1,2};
        System.out.print(new Solution().isPopOrder(push,pop));
    }
}
