package com.levent_j.Exercise_25;

import sun.reflect.generics.tree.Tree;

import java.util.Stack;

/**
 * Created by levent_j on 17-2-13.
 */
public class Solution {
    public void FindPath(TreeNode root,int sum){
        if (root==null){
            return;
        }
        Stack<TreeNode> path = new Stack<TreeNode>();
        int currentSum = 0;
        FindPath(root,sum,path,currentSum);
    }

    private void FindPath(TreeNode root, int exceptSum, Stack<TreeNode> path, int currentSum) {
        currentSum+=root.value;
        path.push(root);

        if ((currentSum==exceptSum)&&((root.left==null)&&(root.right==null))){
            System.out.print("找到一条路径：");
            for (TreeNode treeNode : path) {
                System.out.print("["+treeNode.value+"]");
            }
            System.out.println();
        }

        if (root.left!=null){
            FindPath(root.left,exceptSum,path,currentSum);
        }
        if (root.right!=null){
            FindPath(root.right,exceptSum,path,currentSum);
        }

        path.pop();

    }
}
