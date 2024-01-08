package com.java2bigdata.corejava.forloop;

public class EnhancedForLoop {

    public static void main(String[] args) {

        /*

        case 1:  for loop to enahnced for loop
        array:  int[] a={10,20,30,40};
        for(int i=0;i<a.length;i++)
        System.out.println(a[i])
         */

        int[] a={10,20,30,40};
        for(int x:a)
            System.out.println(x);


        /*
        case 2: two dimentional int array  for loop to enhanced for loop
        int[][] b = {{10.20,30},{40,50}};
        for(int i=0;i<b.length;i++){
            for(int j=0;j<a[i].length;j++){
            System.out.println(a[i][j]);
            }
        }
         */

        int[][] b = {{10,20,30},{40,50}};
        for(int[] x: b){
            for(int y:x)
                System.out.println(y);
        }


        /*
        case 3: enhanced loop is applicable for arrays and collection  no equivalent of for loop of this with enhanced for loop
         for(int i=0;i<5;i++)
         System.out.println(i);

         */

    }


}
