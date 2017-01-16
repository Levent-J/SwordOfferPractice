package com.levent_j.Exercise_7;

/**
 * Created by levent_j on 17-1-16.
 */
public class Test {
    public static void main(String[] args){
        CQueue cQueue = new CQueue();
        cQueue.add(1);
        cQueue.add(2);
        cQueue.add(3);
        cQueue.add(4);
        cQueue.add(5);
        for (int i=0;i<5;i++){
            System.out.print(cQueue.out());
        }
    }
}
