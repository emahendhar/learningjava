package com.java2bigdata.corejava.arrays;

//Given 2D array calculate the sum of diagonal elements.
//myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
//
//sumDiagonalElements(myArray2D) # 15
public class Aarray2D {

    public static void main(String[] args) {
        int[][] a2D={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(a2D.length);
        int primarySum=0;
        int secondarySum=0;
        for(int i=0;i<a2D.length;i++){
            for(int j=0;j<a2D.length;j++){

                if(i==j){
                    primarySum+=a2D[i][j];
                }


            }
        }


    }
}
