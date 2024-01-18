package com.java2bigdata.one;

import java.util.Scanner;

public class ArthemeticOperators {
    public static void main(String[] args) {
        int a=10;
        int b=3;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a%b);

        Scanner sc= new Scanner(System.in);

        // 3 int one string and then get the one char from string

        int var1=sc.nextInt();
        int var2=sc.nextInt();
        int var3=sc.nextInt();
        String str= sc.next();
        char ch=str.charAt(0);

        int min=Integer.MIN_VALUE;
        int max= Integer.MAX_VALUE;
        System.out.println(min +" min "+ max);
        System.out.println('a'+1);




    }
}
