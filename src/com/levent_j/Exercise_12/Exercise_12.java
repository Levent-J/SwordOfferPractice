package com.levent_j.Exercise_12;

/**
 * Created by levent_j on 17-2-5.
 */
public class Exercise_12 {
    public void Print1ToMax(int num){
        if (num<1){
            return;
        }
        int[] nums = new int[num];
        while (!increment(nums)){
            print(nums);
            System.out.println();
        }
    }

    private boolean increment(int[] num){
        boolean overFlow = false;

        int takeOver = 0;
        for (int i=num.length-1;i>=0;i--){
            int sum = takeOver+num[i];
            if (i==num.length-1){
                sum++;
            }
            if (sum>=10){
                if (i==0){
                    overFlow = true;
                }else {
                    takeOver = 1;
                    sum = sum - 10;
                    num[i] = sum;
                }
            }else {
                num[i] = sum;
                break;
            }
        }

        return overFlow;
    }

    private void print(int[] num){
        boolean isBeginning = false;
        for (int i=0;i<num.length;i++){
            if (!isBeginning&&num[i]!=0){
                isBeginning = true;
            }

            if (isBeginning){
                System.out.print(num[i]);
            }
        }
    }
}
