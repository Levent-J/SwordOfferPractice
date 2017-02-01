package com.levent_j.Exercise_10;

/**
 * Created by levent_j on 17-2-1.
 */
public class Exercise_10 {
    //常规解法
//    public int numberOf1(int num){
//        int count = 0;
//        int flag = 1;
//        while (flag!=0){
//            if ((num & flag) != 0){
//                count++;
//            }
//            flag = flag<<1;
//        }
//        return count;
//    }

    //特殊解法
    public int numberOf1(int num){
       int count = 0;
       while (num!=0){
           count++;
           num = num&(num-1);
       }
       return count;
    }
}
