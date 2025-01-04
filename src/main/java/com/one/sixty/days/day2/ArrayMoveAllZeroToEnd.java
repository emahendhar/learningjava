package com.one.sixty.days.day2;

public class ArrayMoveAllZeroToEnd {

    public static void main(String[] args){

        int arr1[] = {1, 2, 0, 4, 6, 0, 5, 0};
        int  arr2[] = new int[]{10,0,20,0,40};
        int[] arr3 = {0, 0};
        int[] arr4 = java.util.stream.IntStream.of(2,4,6,0,3,0,1,0).toArray();

        pushAllElementToEndApproach1(arr1);
        displayArray(arr1);

        System.out.println();

        pushAllElementToEndApproach2(arr4);
        displayArray(arr4);

        System.out.println();

        pushAllElementToEndApproach3(arr2);
        displayArray(arr2);

        System.out.println();

    }

    public static void pushAllElementToEndApproach1(int[] arr){

        int n=arr.length;
        int[] temp = new int[n];

        int j=0;
        for(int i=0;i<n;i++) {
            if (arr[i] != 0)
                temp[j++] = arr[i];
        }

        while(j<n)
            temp[j++]=0;

          for(int k=0;k<n;k++)
              arr[k]=temp[k];

    }

    public static void pushAllElementToEndApproach2(int[] arr){


        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }
        }

        while (count<arr.length)
            arr[count++]=0;
    }


    public static void pushAllElementToEndApproach3(int[] arr){
        int count=0;

        for(int i=0;i<arr.length;i++){

            if(arr[i]!=0){

                int temp= arr[i];
                arr[i] = arr[count];
                arr[count]=temp;
                count++;
            }

        }
    }

    public static void displayArray(int[] arr){
        for (int ele:arr)
            System.out.print(ele + " ");

    }

}
