package com.one.sixty.days.day1;

import java.util.Arrays;

public class ArraySecondLargest {

    public static void main(String[] args){
      int  arr1[] = {12, 35, 1, 10, 34, 1,2};
      int  []arr2 = new int[]{10, 5, 10,4};
      int[]  arr3 = {10, 10, 10};
      int[] arr4 = java.util.stream.IntStream.of(12, 35, 1, 10, 39, 1, 2).toArray();

        System.out.println(SecondLargestElementOfArray(arr1));
        System.out.println(SecondLargestElementApprocah2(arr2));
        System.out.println(SecondLargestApproach3(arr3));
        System.out.println(SecondLargestApproach3(arr4));
    }

    //array sort then compre last element with < for second largest
    //Best sorting nlogn and one time iterate n = nlogn+n - time complexity
    //space O(1)
    public static int SecondLargestElementOfArray(int[] arr){
        Arrays.sort(arr);
            // iterting once
        for(int i=arr.length-2;i>0;i--){
            if(arr[i] < arr[arr.length-1])
                return arr[i];
        }
        return -1;
    }


    //two iterations
    // n +n = 2n = n time complexity
    //O(1)

    public static int SecondLargestElementApprocah2(int[] arr){

        int largest=-1,secondlargest=-1;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>largest)
                largest=arr[i];
        }

        for(int j=0;j<arr.length-1;j++)
            if(arr[j]>secondlargest && arr[j]<largest)
                secondlargest=arr[j];

        return secondlargest;
    }


    public static int SecondLargestApproach3(int[] arr){

        int largest=-1,secondLargest=-1;

        for(int i=0;i<arr.length-1;i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];

            }
        }
        return secondLargest;
    }


}


