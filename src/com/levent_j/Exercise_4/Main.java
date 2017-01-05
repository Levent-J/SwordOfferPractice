package com.levent_j.Exercise_4;

public class Main {

    //时间复杂度为O(n)的解法
    public String replace(String s){
        char[] chars = s.toCharArray();
        int length = chars.length;
        for (char c : chars) {
            if (c==' '){
                length+=2;
            }
        }
        char[] newchars = new char[length];
        System.out.print(chars.length);
        for (int i = 0,j = 0; j < chars.length; i++,j++) {
            if (chars[j]!=' '){
                newchars[i] = chars[j];
            }else {
                newchars[i] = '%';
                newchars[i+1] = '2';
                newchars[i+2] = '0';
                i+=2;
            }
        }
        return String.copyValueOf(newchars);
    }

    public static void main(String[] args) {
        String words = "We are happy";
        System.out.print("new word=["+new Main().replace(words)+"]");
    }
}
