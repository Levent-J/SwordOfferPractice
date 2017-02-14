package com.levent_j.Exercise_26;

/**
 * Created by levent_j on 17-2-14.
 */
public class Test {
    public static void main(String[] args){
        ComplexListNode head = new ComplexListNode(1);
        ComplexListNode node2 = new ComplexListNode(2);
        ComplexListNode node3 = new ComplexListNode(3);
        ComplexListNode node4 = new ComplexListNode(4);
        ComplexListNode node5 = new ComplexListNode(5);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        head.other = node3;
        node2.other = node5;
        node4.other = node2;

        head = new Solution().copyComplexList(head);
        print(head);
    }

    public static void print(ComplexListNode head){
        ComplexListNode current = head;
        while (current!=null){
            System.out.print(current.value);
            if (current.other!=null){
                System.out.print("(-->"+current.other.value+")");
            }
            System.out.print("-->");
            current = current.next;
        }
        System.out.println();
    }
}
