package org.learning.designpattern.creataional.singleton;

public class EagerSingleton {

    private final static EagerSingleton eagerinstance = new EagerSingleton();

    private EagerSingleton(){
    }
    public static EagerSingleton getEagerinstance(){
        return eagerinstance;
    }

}
