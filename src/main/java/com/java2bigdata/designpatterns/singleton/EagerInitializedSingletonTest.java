package com.java2bigdata.designpatterns.singleton;

public class EagerInitializedSingletonTest {
    public static void main(String[] args) {
        EagerInitializedSingleton obj1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton obj2 = EagerInitializedSingleton.getInstance();

        if(obj2 == obj2)
            System.out.println("both are equal");
    }
}
