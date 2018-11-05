package com.rats.thead;

public class MyThread1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Extend Thread" + i);
        }
    }

}
