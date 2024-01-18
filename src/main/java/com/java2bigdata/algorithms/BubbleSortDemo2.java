package com.java2bigdata.algorithms;

public class BubbleSortDemo2 {

    public static void main(String[] args){

        int[] sortArray={ 3,6,62,24,74,2,5,1};
        int n=sortArray.length;
        bubbleSort(sortArray,n);
        printArray(sortArray);



    }


    static void bubbleSort(int[] a,int n){
    int i,j,temp;
        boolean swap;

    for(i=0;i<n-1;i++){
         swap=false;
        for(j=0;j<n-i-1;j++){
            if(a[j]>a[j+1]){
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
                swap=true;
            }
        }

        if(swap==false){
            break;
        }
    }


    }

    static void printArray(int[] input){
        for (int a:input) {
            System.out.print(a +" ");
        }
    }

}
