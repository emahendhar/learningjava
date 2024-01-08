package com.java2bigdata.designpatterns.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        SingletonObject object1= SingletonObject.getSingletonObject();

        SingletonObject object2= SingletonObject.getSingletonObject();

        System.out.println(object1.hashCode() +"  " +object2.hashCode());

        if(object1==object2){
            System.out.println("both are point to same memeory location");
        }
    }
}
