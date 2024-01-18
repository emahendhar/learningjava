package com.java2bigdata.algorithms;

import java.util.Arrays;

public class BubbleSortRecursions {
    public static void main(String[] args) {

        int arr[] = {64, 34, 25, 12, 22, 11, 90};

        bubbleSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSort(int[] a,int n){

        if(n==1)
            return;

        int count=0;

        for(int i=0;i<n-1;i++){
            if(a[i]>a[i+1]) {
                //swap
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
                count = count + 1;
            }

            if(count==0)
                return;

            bubbleSort(a,n-1);
        }
    }

}
