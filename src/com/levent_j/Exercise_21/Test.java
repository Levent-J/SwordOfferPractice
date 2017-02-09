package com.levent_j.Exercise_21;

/**
 * Created by levent_j on 17-2-9.
 */
public class Test {
    public static void main(String[] args){
        Solution solution = new Solution();
        solution.push(3);
        System.out.println("push 3-->最小值是："+solution.getMin());
        solution.push(5);
        System.out.println("push 5-->最小值是："+solution.getMin());
        solution.push(2);
        System.out.println("push 2-->最小值是："+solution.getMin());
        solution.push(1);
        System.out.println("push 1-->最小值是："+solution.getMin());
        solution.push(7);
        System.out.println("push 7-->最小值是："+solution.getMin());

        solution.pop();
        System.out.println("pop  -->最小值是："+solution.getMin());
        solution.pop();
        System.out.println("pop  -->最小值是："+solution.getMin());
        solution.pop();
        System.out.println("pop  -->最小值是："+solution.getMin());
        solution.pop();
        System.out.println("pop  -->最小值是："+solution.getMin());
        solution.pop();
        System.out.println("pop  -->最小值是："+solution.getMin());
        solution.pop();
        System.out.println("pop  -->最小值是："+solution.getMin());
    }
}
