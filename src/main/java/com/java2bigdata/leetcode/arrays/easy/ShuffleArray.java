package com.java2bigdata.leetcode.arrays.easy;

import java.util.Arrays;

public class ShuffleArray {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(shuffleArr(new int[]{1,2,3,4,5,6},3)));

    }

    public static int[] shuffleArr(int[] input,int n){

    int[] ans;
    ans = new int[n*2];

    for(int i=0;i<n;i++){
        ans[2*i]=input[i];
        ans[2*i+1]=input[i+n];
    }

        return ans;
    }
}
