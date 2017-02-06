package com.levent_j.Exercise_15;

/**
 * Created by levent_j on 17-2-6.
 */
public class Exercise_15 {
    public ListNode findLastKthNode(ListNode head,int k){
        if (head==null||k==0){
            return null;
        }
        ListNode left;
        ListNode right = head;
        for (int i=0;i<k;i++){
            if (right.next==null){
                return null;
            }
            right = right.next;
        }
        left = head;
        while (right!=null){
            right = right.next;
            left = left.next;
        }
        return left;
    }
}
