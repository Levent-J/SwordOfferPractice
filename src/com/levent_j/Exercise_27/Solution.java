package com.levent_j.Exercise_27;

/**
 * Created by levent_j on 17-2-15.
 */
public class Solution {

    public BinaryTreeNode convertToList(BinaryTreeNode root){
        BinaryTreeNode c = convert(root);
        while (c!=null&&c.left!=null){
            c = c.left;
        }
        return c;
    }

    private BinaryTreeNode convert(BinaryTreeNode root){
        if (root==null){
            return null;
        }

        BinaryTreeNode leftNode = convert(root.left);
        if (leftNode!=null){
            BinaryTreeNode c = leftNode;
            while (c.right!=null){
                c=c.right;
            }
            c.right = root;
            root.left = c;
        }
        BinaryTreeNode rightNode = convert(root.right);
        if (rightNode!=null){
            BinaryTreeNode c = rightNode;
            while (c.left!=null){
                c=c.left;
            }
            c.left = root;
            root.right = c;
        }
        return root;
    }
}
