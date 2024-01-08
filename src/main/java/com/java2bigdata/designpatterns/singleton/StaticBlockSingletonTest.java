package com.java2bigdata.designpatterns.singleton;

public class StaticBlockSingletonTest {
    public static void main(String[] args) {
        StaticBlockSingleton obj1 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton obj2 = StaticBlockSingleton.getInstance();

        if(obj2 == obj2)
            System.out.println("both are equal");
    }
}
