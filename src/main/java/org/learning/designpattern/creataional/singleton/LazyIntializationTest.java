package org.learning.designpattern.creataional.singleton;

public class LazyIntializationTest {
    public static void main(String[] args) {
        Lazyintialization obj1 = Lazyintialization.getInstance();
        Lazyintialization obj2 = Lazyintialization.getInstance();
        System.out.println(obj1==obj2);
    }
}
