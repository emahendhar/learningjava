package com.java2bigdata.leetcode.arrays.easy;

public class IncreDecreArray {

    public static void main(String[] args) {

        int finalValue = finalValueAfterOperations(new String[]{"--X","X++","++X"});
        System.out.println(finalValue);
    }

    public static int finalValueAfterOperations(String[] input){
         int x = 0;

        for (String s:input) {

            if(s.charAt(1)=='-') {
                x--;
                }else{
                x++;
            }
        }

        return x;
    }




}
