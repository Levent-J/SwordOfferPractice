package com.levent_j.Exercise_6;

/**
 * Created by levent_j on 17-1-16.
 */
public class Exercuse_6 {
    public TreeNode construct(int[] preorder,int[] inorder){
        if (preorder==null||inorder==null){
            return null;
        }

        if (preorder.length<1||inorder.length<1){
            return null;
        }

        TreeNode root = new TreeNode(preorder[0]);
        root.left=null;
        root.right=null;

        int i=0;

        for (; i < inorder.length; i++) {
            if (root.value==inorder[i]){
                //找到了
                break;
            }
        }

        int[] lp = new int[i];
        System.arraycopy(preorder,1,lp,0,i);
        int[] li = new int[i];
        System.arraycopy(inorder,0,li,0,i);

        int[] rp = new int[preorder.length-i-1];
        System.arraycopy(preorder,i+1,rp,0,preorder.length-i-1);
        int[] ri = new int[inorder.length-i-1];
        System.arraycopy(inorder,i+1,ri,0,inorder.length-i-1);

        root.left = construct(lp,li);
        root.right = construct(rp,ri);

        return root;
    }
}
