package com.java2bigdata.leetcode.arrays.easy;

import java.util.HashMap;
public class GoodPairArray {

    public static void main(String[] args) {

        System.out.println(numIdenticalPairs0(new int[]{1,2,3,1,1,3}));
        System.out.println(numIdenticalPairs1(new int[]{1,2,3,1,1,3}));
        System.out.println(numIdenticalPairs2(new int[]{1,2,3,1,1,3}));
    }


    public static int numIdenticalPairs0(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int numIdenticalPairs1(int[] input) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : input) {
            // Increment count for each existing occurrence of num
            count += map.getOrDefault(num, 0);
            // Increment the occurrence of num in the map
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;
    }


    public static int numIdenticalPairs2(int[] nums) {
        int[] frequency = new int[101];
        // Assuming the numbers in nums are between 1 and 100
        int count = 0;

        for (int num : nums) {
            // Increment count for each existing occurrence of num
            count += frequency[num];
            System.out.println(count + " count");
            // Increment the occurrence of num in the array
            frequency[num]++;
        }

        return count;
    }
}
