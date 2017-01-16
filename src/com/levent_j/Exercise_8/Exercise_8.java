package com.levent_j.Exercise_8;

/**
 * Created by levent_j on 17-1-16.
 */
public class Exercise_8 {
    public int min(int[] numbers){
        if (numbers==null){
            return 0;
        }
        int indexLeft = 0;
        int indexRight = numbers.length-1;
        int indexMid = 0;
        while (numbers[indexLeft]>=numbers[indexRight]){
            if (indexRight-indexLeft==1){
                indexMid = indexRight;
                break;
            }
            indexMid = (indexLeft+indexRight)/2;

            if (numbers[indexLeft]==numbers[indexMid]&&
                    numbers[indexRight]==numbers[indexMid]){
                return minInOrder(numbers);
            }

            if (numbers[indexMid]>=numbers[indexLeft]){
                indexLeft = indexMid;
            }else if (numbers[indexMid]<=numbers[indexRight]){
                indexRight = indexMid;
            }
        }

        return numbers[indexMid];
    }

    private int minInOrder(int[] numbers) {
        int min = numbers[0];
        for (int number : numbers) {
            if (number<=min){
                min = number;
            }
        }
        return min;
    }
}
