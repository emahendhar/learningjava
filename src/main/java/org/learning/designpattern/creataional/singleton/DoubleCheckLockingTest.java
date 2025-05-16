package org.learning.designpattern.creataional.singleton;

/*
pros : thread -safe
cons: instance created even if not used
 */
public class DoubleCheckLockingTest {
    public static void main(String[] args) {
        DoubleCheckLocking obj1 = DoubleCheckLocking.getInstance();
        DoubleCheckLocking obj2 = DoubleCheckLocking.getInstance();

        System.out.println(obj1==obj2);
        System.out.println(obj1.hashCode() +"   "+ obj2.hashCode());
    }
}
