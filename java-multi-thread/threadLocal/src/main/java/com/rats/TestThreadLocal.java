package com.rats;

public class TestThreadLocal {

    static ThreadLocal<String> localVariable =new ThreadLocal<String>();

    public void setValue(String value){
        localVariable.set(value);
    }

    public void sgetValue(){
        try{
        localVariable.get();
        } finally {
            localVariable.remove();
        }
    }

}
