package com.levent_j.Exercise_23;

/**
 * Created by levent_j on 17-2-12.
 */
public class Test {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
//        root.right.left = new TreeNode(6);
//        root.right.right = new TreeNode(7);

        new Solution().printTreeFromTopToBottom(root);

    }
}
