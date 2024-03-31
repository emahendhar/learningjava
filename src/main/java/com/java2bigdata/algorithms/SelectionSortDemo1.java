package com.java2bigdata.algorithms;

import java.util.Arrays;

public class SelectionSortDemo1 {

    public static void main(String[] args) {

        int[] arr={4,3,7,2,7,6,92,4,22,54};
        selectionSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    //O(n2)
    static void selectionSort(int[] a,int n){

        for(int i=0;i<n-1;i++){

             int minvalue_idx=i;

            for(int j=i+1;j<n;j++){

                if(a[j]<a[minvalue_idx]){
                    minvalue_idx=j;
                }
            }

            int temp= a[i];
            a[i]=a[minvalue_idx];
            a[minvalue_idx]=temp;


        }



    }
}
