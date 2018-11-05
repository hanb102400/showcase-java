package com.rats.runnable;

public class MyThread2 implements Runnable {

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Implements Runnable" + i);
        }
    }

}
