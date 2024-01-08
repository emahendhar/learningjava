package com.java2bigdata.examples.breakcontinue;

public class BreakContinueExamples {


    public static void main(String[] args) {


    /*
    break:
    inside switch
    inside block   -- based on some condition
    inside loops      - based on some condition

    continue:
    only in loops -- to skip the current iteration & continue for the next iteration.
    other wise continue out-side of loop.
     */

    int a=2;
    switch(a){
        case 1:
            System.out.println("switch with option 1");
            break;
        case 2:
            System.out.println("switch with option 2");
            break;
        default:
            System.out.println("Invalid switch option");

    }


    //for loop

        int x=10;
    for(int i=9;i<30;i++){
        System.out.println("hello forloop block befor break i=" +i);
        if(x==i) {
            System.out.println("in side if x==i  :" + x + "==" + i);
            break;
        }
        System.out.println(i);

    }



    //if
        /*

      break out side switch or loop
        if(x==10)
            break;

         */


        block1:{
            System.out.println("inside block");
            if(x==10)
                break block1;
            System.out.println("end of block");
        }
        System.out.println("out side of block1");

    //continue

        for(int i=0;i<10;i++){
            if(i%2==0)
                continue;
            System.out.print(i +" ");   //output: 1 3 5 7 9
        }

        System.out.println();

        // break or continue outputs


        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j)
                    break;
                System.out.println(i+"______break_______"+j);
            }
        }


        /* output:
        1______break_______0
        2______break_______0
        2______break_______1
         */

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j)
                    continue;
                System.out.println(i+"_____continue________"+j);
            }
        }

        /*
        0_____continue________1
        0_____continue________2
        1_____continue________0
        1_____continue________2
        2_____continue________0
        2_____continue________1

         */


        //do - while continue
        System.out.println("do while loop: ");
        int y=0;
        do{
            y++;
            System.out.println(y);
            if(++y<5)
                continue;
            y++;
            System.out.println(y);
        }while(++y<10);

/*
output:
1
4
6
8
10
 */


        //compiler wont check unreachable code in if else - it will check only in iterative statements

        if(true){
            System.out.println("true");
        }else{
            System.out.println("else flase");
        }

    }
}
