package com.java2bigdata.leetcode.arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContainsCharArray {

    public static void main(String[] args) {

        findWordsContaining(new String[]{"leet","code"},'e');
        System.out.println(findWordsContaining(new String[]{"leet","code"},'e'));
    }

    public static List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer> list = new ArrayList<>();
        int index=0;
        for (String word:words) {
       if(word.indexOf(x)!=-1){
           list.add(index);
       }
        index++;
        }


        return list;
    }
}
