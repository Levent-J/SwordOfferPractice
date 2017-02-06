package com.levent_j.Exercise_16;



/**
 * Created by levent_j on 17-2-6.
 */
public class Test {
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
       print(node1);
       print(new Exercise_16().reverseList(null));
    }
    public static void print(ListNode head){
        ListNode ptr = head;
        while (ptr!=null){
            System.out.print(ptr.value+"-->");
            ptr = ptr.next;
        }
        System.out.println("null");
    }
}
