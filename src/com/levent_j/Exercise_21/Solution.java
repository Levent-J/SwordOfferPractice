package com.levent_j.Exercise_21;

import java.util.Stack;

/**
 * Created by levent_j on 17-2-9.
 */
public class Solution {
    private Stack<Integer> stack;
    private Stack<Integer> mins;
    private int minNumber;

    public Solution() {
        stack = new Stack<Integer>();
        mins = new Stack<Integer>();
        minNumber = Integer.MAX_VALUE;
    }

    public void push(int num){
        stack.push(num);
        if (num<minNumber){
            minNumber = num;
        }
        mins.push(minNumber);
    }

    public int pop(){
        if (stack.empty()){
            System.out.println("栈已空");
            return 0;
        }
        mins.pop();
        if (!mins.empty()){
            minNumber = mins.peek();
        }
        return stack.pop();
    }

    public int getMin(){
        return minNumber;
    }
}
