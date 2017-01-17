package com.levent_j.Exercise.Tree;

import java.util.Stack;

/**
 * Created by levent_j on 17-1-17.
 */
public class TreeExercise {
    public void preOrderTraverse(TreeNode root){
//        //递归
//        if (root==null){
//            return;
//        }
//        System.out.print("["+root.value+"]");
//        preOrderTraverse(root.left);
//        preOrderTraverse(root.right);
        //循环
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode p = root;
        while (p!=null||!stack.isEmpty()){
            while (p!=null){
                System.out.print("["+p.value+"]");
                stack.push(p);
                p=p.left;
            }
            if (!stack.isEmpty()){
                p = stack.pop().right;
            }
        }
    }

    public void midOrderTraverse(TreeNode root){
//        //递归
//        if (root==null){
//            return;
//        }
//        midOrderTraverse(root.left);
//        System.out.print("["+root.value+"]");
//        midOrderTraverse(root.right);
        //循环
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode p  = root;
        while (p!=null||!stack.isEmpty()){
            while (p!=null){
                stack.push(p);
                p = p.left;
            }
            if (!stack.isEmpty()){
                p=stack.pop();
                System.out.print("["+p.value+"]");
                p=p.right;
            }
        }
    }

    public void rearOrderTraverse(TreeNode root){
//        //递归
//        if (root==null){
//            return;
//        }
//        rearOrderTraverse(root.left);
//        rearOrderTraverse(root.right);
//        System.out.print("["+root.value+"]");
        //循环
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode pre = null;
        TreeNode cur = root;
        stack.push(cur);
        while (!stack.isEmpty()){
            cur = stack.peek();
            if ((cur.left==null&&cur.right==null)||
                    ((pre!=null)&&(pre==cur.left||pre==cur.right))){
                System.out.print("["+cur.value+"]");
                stack.pop();
                pre = cur;
            }else {
                if (cur.right!=null){
                    stack.push(cur.right);
                }
                if (cur.left!=null){
                    stack.push(cur.left);
                }
            }
        }
    }
}
