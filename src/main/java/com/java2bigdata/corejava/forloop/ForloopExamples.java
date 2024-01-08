package com.java2bigdata.corejava.forloop;

public class ForloopExamples {
    public static void main(String[] args) {

        //forloop : all 3 parts of for loop are independent of each other and optional

      /*

      case 1: unreachable statement
      for(int i=0;;i++){                 // for(int i=0;true;i++){  or for(int i=0;false;i++){
            System.out.println(i);
        }
        System.out.println("test");
       */

       /*
       case 2: declared variable are final then again unreachable statement

        final int a =10,b=20;
        for(int i=0;a<b;i++){
            System.out.println("a<b");
        }
        System.out.println("outside for");
    }

        */

        int a = 10, b = 20;
        for (int i = 0; a < b; i++) {
            System.out.println("a<b");
            //a=30;          to exit below code added this entry to avoid infinite loop
        }
        System.out.println("outside for");



    /*
    case 3: we can take any valid java statement including system.out.println
     */
        int j = 0;
        for ( System.out.println("Hello"); j < 5; System.out.println("Bye")) {

            j++;
        }

    }

}
