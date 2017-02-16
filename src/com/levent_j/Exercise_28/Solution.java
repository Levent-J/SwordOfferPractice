package com.levent_j.Exercise_28;

/**
 * Created by levent_j on 17-2-16.
 */
public class Solution {
    public void Permutation(String str){
        Permutation(str.toCharArray(),0);
    }

    private void Permutation(char[] chars, int begin) {
        if (begin>=chars.length){
            return;
        }
        if (begin==chars.length-1){
            System.out.println("str:"+String.valueOf(chars));
        }else {
            for (int i=begin;i<chars.length;i++){
                char temp = chars[i];
                chars[i] = chars[begin];
                chars[begin] = temp;

                Permutation(chars,begin+1);

                temp = chars[i];
                chars[i] = chars[begin];
                chars[begin] = temp;
            }
        }
    }
}
