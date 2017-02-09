package com.levent_j.Exercise_22;

import java.util.Stack;

/**
 * Created by levent_j on 17-2-9.
 */
public class Solution {
    public boolean isPopOrder(int[] pushNums, int[] popNums){
        if (pushNums==null||popNums==null||popNums.length!=pushNums.length){
            return false;
        }
        Stack<Integer> stack = new Stack<Integer>();
        int pushIndex = 0;
        for (int i=0;i<popNums.length;i++){
            int num = popNums[i];
            if (stack.empty()||(!stack.empty()&&stack.peek()!=num)){
                //栈为空|栈顶元素不对-->需要入栈
                if (pushIndex>=pushNums.length){
                    return false;
                }
                while (pushIndex<pushNums.length){
                    if (pushNums[pushIndex]!=num){
                        stack.push(pushNums[pushIndex]);
                        pushIndex++;
                    }else {
                        pushIndex++;
                        break;
                    }
                }
            }else {
                stack.pop();
            }
        }

        return true;
    }
}
