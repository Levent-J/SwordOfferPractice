package com.levent_j.Exercise_13;

/**
 * Created by levent_j on 17-2-5.
 */
public class Test {
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        ListNode node = new ListNode(20);

        print(head);

        head = new Exercise_13().deleteNode(head,node6);

        print(head);
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
