package io.codementor.gtommee.rest_tutorial.models;

import static java.lang.Thread.*;

public class ThreadLearn {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread() {
            public void run() {
                System.out.println("hello world from new thread");
            }
        };

        thread.start();
        sleep(10);
        System.out.println("Hello from main thread");
        thread.join();
    }
}
