package com.rats;

import com.rats.callable.MyThread3;
import com.rats.runnable.MyThread2;
import com.rats.thead.MyThread1;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class App {

    public static void main(String[] args) {
        Thread thread1 = new MyThread1();
        thread1.start();

        Thread thread2 = new Thread(new MyThread2());
        thread2.start();

        try {
            Callable<String> thread3 = new MyThread3();
            FutureTask<String> future = new FutureTask<String>(thread3);
            new Thread(future).start();

            String result = future.get();
            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
