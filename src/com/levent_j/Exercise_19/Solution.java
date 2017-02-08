package com.levent_j.Exercise_19;

/**
 * Created by levent_j on 17-2-8.
 */
public class Solution {
    public TreeNode MirrorTree(TreeNode root){
        if (root==null||(root.left==null&&root.right==null)){
            return root;
        }
        TreeNode swap = root.left;
        root.left = root.right;
        root.right = swap;

        root.left = MirrorTree(root.left);
        root.right = MirrorTree(root.right);
        return root;
    }
}
