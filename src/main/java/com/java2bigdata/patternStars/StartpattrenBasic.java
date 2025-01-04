package com.java2bigdata.patternStars;

import java.util.Scanner;

public class StartpattrenBasic {

    public static void main(String[] args) {
        //Scanner sc= new Scanner(System.in);
        //System.out.println("enter number of rows you wanted");
        //int input = sc.nextInt(); //5
        int input=5;
        pattern1(5);
        System.out.println(" ");
        pattern2(input);

        pattern3(input); // increasing
        pattern4(input); // decreasing
    }


    static void pattern4(int decreseT){

        System.out.println("decreasing Triangle");

        for(int i=1;i<=decreseT;i++){
            for(int j=i;j<decreseT;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    //increasing triangle
    static void pattern3(int increseT){

        System.out.println("increasing triangle");

        for(int i=1;i<=increseT;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }

 //Nested loop
    static void pattern2(int input){

        // printing in single line
        for(int i=1;i<=input;i++){
            for(int j=1;j<=input;j++){
                System.out.print("* ");
            }
        }
        System.out.println("");
        System.out.println("printing matrix");
        //printing in matircs format
        for(int i=1;i<=input;i++){
            for(int j=1;j<=input;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }


//just * or #
    static void pattern1(int input){

        //method one i start with 0
        for(int i=0;i<input;i++){
            System.out.print("* ");
        }

        System.out.println("");
        for(int i=1;i<=input;i++){
            System.out.print("# ");
        }

    }

}
