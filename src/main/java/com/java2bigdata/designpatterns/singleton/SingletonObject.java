package com.java2bigdata.designpatterns.singleton;

public class SingletonObject {

    // creational design pattern

    //create an object of SingleObject as private static
    private static SingletonObject singleObject=null;


    //make the constructor private so that this class cannot be instantiated
    private SingletonObject(){}

    public static synchronized SingletonObject getSingletonObject(){

        if(singleObject==null)
            return singleObject=new SingletonObject();

        return singleObject;


    }

    public void displayMessage(){
        System.out.println("Singleton object display message");
    }

}
