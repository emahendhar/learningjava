package com.java2bigdata.leetcode.arrays.easy;



/*
Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.



Example 1:

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
Example 2:

Input: nums = [1,3,2,1]
Output: [1,3,2,1,1,3,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
- ans = [1,3,2,1,1,3,2,1]


Constraints:

n == nums.length
1 <= n <= 1000
1 <= nums[i] <= 1000

 */
public class ConcatArray {


    public static void main(String[] args) {
            ConcatArray ca= new ConcatArray();

        int[] num={1,2,1};

        int[] output = ca.getConcatArray(num);
        ca.displayArray(output);
        ca.displayArray(ca.getConcatArray(new int[]{1,3,2,1}));

    }

    public void displayArray(int[] input){
        System.out.print("{ ");
        for (int x:input
        ) {
            System.out.print(x + " ");
        }
        System.out.println("}");

    }


    public int[] getConcatArray(int[] input){

        int[] ans ;
        ans= new int[input.length*2];

       for(int j=0;j<input.length;j++){
           ans[j]=input[j];
           ans[j+input.length] = input[j];
       }

        return  ans;
    }

}
