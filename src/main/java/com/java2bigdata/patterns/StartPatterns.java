package com.java2bigdata.patterns;

import java.util.Scanner;

public class StartPatterns {

    public static void main(String args[]){

       // System.out.println("Enter an integer which needed of pattern size :");
       // Scanner sc = new Scanner(System.in);
      //  int size = sc.nextInt();
        int size = 5;

       // patternSquare(size);
       // rightTriangle(size);
      //  leftTriangle(size);
      //  rightTri(size);
        leftTri(size);


    }
    public static void patternSquare(int n){
        System.out.println("patternSquare");
        System.out.println("==============");
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }


    public static void rightTriangle(int n){
        System.out.println("increasing triangle:");
        System.out.println("==============");

        System.out.println("");

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }



    public static void leftTriangle(int n){
        System.out.println("decreasing Triangle");
        System.out.println("==============");
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void rightTri(int n){
        System.out.println("right Triangle");
        System.out.println("==============");
         for(int i=1;i<=n;i++){


             for(int j=i;j<=n;j++){
                 System.out.print("  ");
             }


             for(int k=1;k<=i;k++){
                 System.out.print("* ");
             }


             System.out.println("");



         }


    }


    public static void leftTri(int n){


        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(int k=i;k<=n;k++){
                System.out.print("* ");
            }



            System.out.println("");
        }
    }



}
