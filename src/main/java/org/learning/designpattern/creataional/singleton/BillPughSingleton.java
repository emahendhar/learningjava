package org.learning.designpattern.creataional.singleton;

public class BillPughSingleton {

    //private static BillPughSingleton instance;

    private BillPughSingleton(){}

    private static class Holder{
    private static final BillPughSingleton instance= new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return Holder.instance;
    }
}
