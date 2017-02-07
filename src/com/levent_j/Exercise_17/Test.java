package com.levent_j.Exercise_17;


import com.levent_j.Exercise_16.Exercise_16;

/**
 * Created by levent_j on 17-2-6.
 */
public class Test {
    public static void main(String[] args){
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(3);
        head1.next.next = new ListNode(5);
        head1.next.next.next = new ListNode(7);

        ListNode head2 = new ListNode(2);
        head2.next = new ListNode(4);
        head2.next.next = new ListNode(6);
        head2.next.next.next = new ListNode(8);

        print(head1);
        print(head2);
        print(new Exercie_17().merge(head1,head2));

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
