package com.levent_j.Exercise_27;

/**
 * Created by levent_j on 17-2-15.
 */
public class Test {
    public static void main(String[] args){
        BinaryTreeNode root = new BinaryTreeNode(10);
        root.left = new BinaryTreeNode(6);
        root.right = new BinaryTreeNode(14);
        root.left.left = new BinaryTreeNode(4);
        root.left.right = new BinaryTreeNode(8);
        root.right.left = new BinaryTreeNode(12);
        root.right.right = new BinaryTreeNode(16);

        print(new Solution().convertToList(root));

    }

    public static void print(BinaryTreeNode head){
        BinaryTreeNode c = head;
        while (c.right!=null){
            System.out.print(c.value+"-->");
            c= c.right;
        }
        System.out.println(""+c.value);
        System.out.println("反过来：");
        while (c!=null){
            System.out.print(c.value+"-->");
            c= c.left;
        }
    }
}
