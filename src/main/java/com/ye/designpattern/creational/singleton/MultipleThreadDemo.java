package com.ye.designpattern.creational.singleton;

public class MultipleThreadDemo {
    public static void main(String[] args) {

        // The root issue is that a non-thread-safe Singleton allows
        // multiple threads to create multiple instances
        // of the class due to a lack of synchronization.

        Thread thread1 = new Thread(new ThreadBoo());
        Thread thread2 = new Thread(new ThreadFoo());

        thread1.start(); // output Boo
        thread2.start(); // output Foo
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("Foo");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBoo implements  Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("Boo");
            System.out.println(singleton.value);
        }
    }
}
