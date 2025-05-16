package org.learning.designpattern.creataional.singleton;

/*
pros : thread -safe
cons: instance created even if not used
 */
public class EagerSingletonTest {
    public static void main(String[] args) {
        EagerSingleton obj1 = EagerSingleton.getEagerinstance();
        EagerSingleton obj2 = EagerSingleton.getEagerinstance();

        System.out.println(obj1==obj2);
        System.out.println(obj1.hashCode() +"   "+ obj2.hashCode());
    }
}
