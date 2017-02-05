package com.levent_j.Exercise_13;

/**
 * Created by levent_j on 17-2-5.
 */
public class Exercise_13 {
    public ListNode deleteNode(ListNode head,ListNode delNode){
        if (delNode.next!=null){
            ListNode ptr = delNode.next;
            delNode.value = ptr.value;
            delNode.next = ptr.next;
            ptr.next = null;
        }else if (head!=delNode){
            ListNode ptr = head;
            while (ptr.next!=delNode){
                ptr = ptr.next;
            }
            ptr.next = null;
        }else {

            head = head.next;
        }
        return head;
    }
}
