package com.java2bigdata.designpatterns.singleton;

public class EagerInitializedSingleton {
    public static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton(){}

   public static EagerInitializedSingleton getInstance(){
        return instance;
   }

}
