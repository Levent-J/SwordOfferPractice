package com.levent_j.Exercise_5;

import javax.swing.tree.TreeNode;
import java.util.Stack;

/**
 * Created by levent_j on 17-1-9.
 */
public class Exercise_5 {
    public static void printFlip(ListNode head){
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode current = head;
        while (current!=null){
            stack.push(current);
            current = current.next;
        }
        while (!stack.isEmpty()){
            ListNode node = stack.pop();
            System.out.print("|"+node.value);
        }
    }

    public static void printFlip2(ListNode head){
        if (head!=null){
            printFlip2(head.next);
            System.out.print("||"+head.value);
        }
    }
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        printFlip2(head);
    }
}
