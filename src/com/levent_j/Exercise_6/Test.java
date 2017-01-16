package com.levent_j.Exercise_6;

/**
 * Created by levent_j on 17-1-16.
 */
public class Test {
    public static void main(String[] args){
        int[] pre = new int[]{1,2,4,7,3,5,6,8};
        int[] in = new int[]{4,7,2,1,5,3,8,6};
        printTreePre(new Exercuse_6().construct(pre,in));
//        int[] num = new int[0];
//        System.arraycopy(pre,0,num,0,0);
//        System.out.print(num==null);
    }

    public static void printTreePre(TreeNode root){
        if (root==null){
            return;
        }
        System.out.print(root.value);
        printTreePre(root.left);
        printTreePre(root.right);
    }
}
