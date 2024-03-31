package com.java2bigdata.leetcode.arrays.easy;

public class PermutationArray {


    public static void main(String[] args) {

    PermutationArray parry= new PermutationArray();
     parry.displayArray(parry.buildArray(new int[]{0,2,1,5,3,4}));
        parry.displayArray(parry.buildArray(new int[]{5,0,1,2,3,4}));
    }

    public void displayArray(int[] input){
        System.out.print("[ ");
        for (int x:input
             ) {
            System.out.print(x + " ");
        }
        System.out.println(" ]");
    }


    public int[] buildArray(int[] input){
        int[] ans;
        ans=new int[input.length];
        for(int j=0;j<input.length;j++){
            ans[j]=input[input[j]];
        }
        return ans;
    }

}
