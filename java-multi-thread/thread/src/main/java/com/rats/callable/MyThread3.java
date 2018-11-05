package com.rats.callable;

import java.util.concurrent.Callable;

public class MyThread3 implements Callable<String> {

    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println("Implements Callable" + i);
        }
        return "call back";
    }
}
