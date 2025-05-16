package org.learning.designpattern.creataional.singleton;

public class DoubleCheckLocking {

    private static DoubleCheckLocking instance;

    private DoubleCheckLocking(){

        //prevent reflection
        if(instance!=null)
            throw new RuntimeException("use getInstance()");
    }


    public static DoubleCheckLocking getInstance(){

        if(instance==null){
            synchronized (DoubleCheckLocking.class){
                if(instance==null){
                    instance=new DoubleCheckLocking();
                }
            }
        }

        return instance;
    }
}
