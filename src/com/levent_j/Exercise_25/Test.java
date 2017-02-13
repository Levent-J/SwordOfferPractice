package com.levent_j.Exercise_25;

/**
 * Created by levent_j on 17-2-13.
 */
public class Test {
    public static void main(String[] args){
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(12);
        
        root.left.right = new TreeNode(7);

        new Solution().FindPath(root,15);
    }
}
