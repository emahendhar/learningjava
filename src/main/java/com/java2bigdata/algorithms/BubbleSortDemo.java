package com.java2bigdata.algorithms;

public class BubbleSortDemo {

    public static void print(int[] input){
        for (int i:input) {
            System.out.print(i +" ");
        }
    }
    public static void main(String[] args) {
        int arry[] = {7, 8, 3, 1, 2};

        //bubble sort tech
        System.out.println(arry.length);

        //complexity O(n2)
        for (int i = 0; i < arry.length- 1; i++) { // n-1

            for(int j=0;j<arry.length-i-1;j++){
                if(arry[j]>arry[j+1]) {
                    //swap
                    int temp = arry[j];
                    arry[j] = arry[j + 1];
                    arry[j + 1] = temp;
                }
            }
        }
        print(arry);
    }

}
