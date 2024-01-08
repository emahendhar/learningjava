package com.java2bigdata.designpatterns.singleton;

public class StaticBlockSingleton {

    public static StaticBlockSingleton instance;
    private StaticBlockSingleton(){}

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured while creating SingletonObject");
        }
    }

        public static StaticBlockSingleton getInstance(){
        return instance;
        }



}
