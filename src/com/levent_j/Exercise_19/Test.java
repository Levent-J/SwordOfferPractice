package com.levent_j.Exercise_19;

/**
 * Created by levent_j on 17-2-8.
 */
public class Test {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        printTreeBefore(root);
        System.out.println();
        printTreeBefore(new Solution().MirrorTree(root));
    }

    public static void printTreeBefore(TreeNode root){
        if (root==null){
            System.out.print("["+"  "+"]");
            return;
        }
        System.out.print("["+root.value+"]");
        printTreeBefore(root.left);
        printTreeBefore(root.right);
    }
}
