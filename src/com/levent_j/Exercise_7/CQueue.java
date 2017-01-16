package com.levent_j.Exercise_7;

import java.util.Stack;

/**
 * Created by levent_j on 17-1-16.
 */
public class CQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public CQueue() {
        this.stack1 = new Stack<Integer>();
        this.stack2 = new Stack<Integer>();
    }

    public void add(int num){
        stack1.push(num);
    }

    public int out(){
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }
}
