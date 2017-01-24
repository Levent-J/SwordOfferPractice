package com.levent_j.Exercise_9;

/**
 * Created by levent_j on 17-1-24.
 */
public class Exercise_9 {
    public long Fibonacci(int num){
        //递归：效率太低
//        if (num<=0){
//            return 0;
//        }
//        if (num==1){
//            return 1;
//        }
//        return Fibonacci(num-1)+Fibonacci(num-2);

        if (num<2){
            return num;
        }
        long result = 0;
        long numLeft = 1;
        long numRight = 0;
        for (int i=2;i<=num;i++){
            result = numLeft+numRight;
            numRight = numLeft;
            numLeft = result;
        }
        return result;
    }
}
