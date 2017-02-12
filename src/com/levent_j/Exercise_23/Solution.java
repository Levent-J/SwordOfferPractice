package com.levent_j.Exercise_23;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by levent_j on 17-2-12.
 */
public class Solution {
    public void printTreeFromTopToBottom(TreeNode root){
        if (root==null){
            return;
        }
        Queue<TreeNode> queueA = new LinkedList<TreeNode>();
        Queue<TreeNode> queueB = new LinkedList<TreeNode>();
        queueA.add(root);
        boolean isLevel = true;
        while (!queueA.isEmpty()||!queueB.isEmpty()){
            while (isLevel&&!queueA.isEmpty()){
                TreeNode node = queueA.poll();
                if (node!=null) {
                    System.out.print("[" + node.value + "]");
                    queueB.offer(node.left);
                    queueB.offer(node.right);
                }
            }
            if (isLevel){
                isLevel = false;
            }else {
                isLevel = true;
            }
            while (isLevel&&!queueB.isEmpty()){
                TreeNode node = queueB.poll();
                if (node!=null){
                    System.out.print("["+node.value+"]");
                    queueA.offer(node.left);
                    queueA.offer(node.right);
                }
            }
            System.out.println();

        }
    }
}
