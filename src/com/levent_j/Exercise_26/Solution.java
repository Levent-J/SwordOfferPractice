package com.levent_j.Exercise_26;

/**
 * Created by levent_j on 17-2-14.
 */
public class Solution {
    public ComplexListNode copyComplexList(ComplexListNode head){
        if (head==null){
            return null;
        }
        head = copyEveryNodes(head);
        head = copyOtherPointer(head);
        head = divideNodes(head);
        return head;
    }

    private ComplexListNode copyEveryNodes(ComplexListNode head) {
        ComplexListNode current = head;
        while (current!=null){
            ComplexListNode node = new ComplexListNode(current.value);
            node.next = current.next;
            current.next = node;
            current = current.next.next;
        }
        return head;
    }

    private ComplexListNode copyOtherPointer(ComplexListNode head) {
        ComplexListNode current = head;
        while (current!=null){
            if (current.other!=null){
                current.next.other = current.other.next;
            }
            current = current.next.next;
        }
        return head;
    }

    private ComplexListNode divideNodes(ComplexListNode head) {
        ComplexListNode c = head;
        ComplexListNode newHead = head.next;
        while (c!=null&&c.next.next!=null){
            ComplexListNode t = c.next;
            c.next = c.next.next;
            t.next = t.next.next;
            c=c.next;
        }
        c.next = null;
        return newHead;
    }
}
