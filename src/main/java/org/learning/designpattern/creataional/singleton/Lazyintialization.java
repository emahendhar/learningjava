package org.learning.designpattern.creataional.singleton;

/*
Not thread safe
 */
public class Lazyintialization {
    private static Lazyintialization lazyintialization;

    private Lazyintialization(){

    }

    public static Lazyintialization getInstance(){
        if(lazyintialization==null){
            lazyintialization = new Lazyintialization();
        }
     return lazyintialization;
    }
}
