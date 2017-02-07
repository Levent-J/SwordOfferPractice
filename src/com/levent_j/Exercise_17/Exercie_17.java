package com.levent_j.Exercise_17;

/**
 * Created by levent_j on 17-2-7.
 */
public class Exercie_17 {
    public ListNode merge(ListNode head1,ListNode head2){
        if (head1==null){
            return head2;
        }else if (head2==null){
            return head1;
        }

        ListNode head;
        if (head1.value<head2.value){
            head = head1;
            head.next = merge(head1.next,head2);
        }else {
            head = head2;
            head.next = merge(head1,head2.next);
        }

        return head;
    }
}
