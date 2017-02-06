package com.levent_j.Exercise_16;

/**
 * Created by levent_j on 17-2-6.
 */
public class Exercise_16 {
    public ListNode reverseList(ListNode head){
        if (head==null||head.next==null){
            return head;
        }
        ListNode left = head;
        ListNode mid = head.next;
        ListNode right;
        head.next = null;
        while (mid!=null){
            right = mid.next;
            mid.next = left;
            left = mid;
            mid = right;
        }
        return left;
    }
}
