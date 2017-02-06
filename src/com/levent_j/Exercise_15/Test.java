package com.levent_j.Exercise_15;


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

        print(head);
        System.out.println();
        try {
            System.out.print("倒数第"+1+"个是"+
                    new Exercise_15().findLastKthNode(head,8).value);
        }catch (NullPointerException e){
            System.out.print("没了");
        }
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
