package com.levent_j.Exercise_18;

import com.levent_j.Exercise_17.Exercie_17;

/**
 * Created by levent_j on 17-2-7.
 */
public class Test {
    public static void main(String[] args){
        TreeNode rootA = new TreeNode(1);
        rootA.left = new TreeNode(2);
        rootA.right= new TreeNode(3);
        rootA.left.left = new TreeNode(4);
        rootA.left.right = new TreeNode(5);
        rootA.right.left = new TreeNode(6);
        rootA.right.right = new TreeNode(7);

        TreeNode rootB = new TreeNode(1);
        rootB.left = new TreeNode(2);


        System.out.print(new Exercise_18().HasSubTree(rootA,null));
    }
}
