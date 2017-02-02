package com.levent_j.Exercise_11;

/**
 * Created by levent_j on 17-2-2.
 */
public class Exercise_11 {
    public double Power(double base,int exponent){
        if (exponent==0){
            return 1;
        }
        if (exponent==1){
            return base;
        }
        double result = Power(base,exponent>>1);
        result *= result;
        if ((exponent & 0x1 )== 1){//判断是奇数
            result *= base;
        }
        return result;
    }
}
