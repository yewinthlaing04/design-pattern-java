package com.ye.designpattern.creational.singleton;

public class ThreadSafeDemo {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new ThreadFoo());
        Thread thread2 = new Thread(new ThreadBoo());

        thread1.start();
        thread2.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance("Foo");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBoo implements Runnable {
        @Override
        public void run() {
            ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance("Boo");
            System.out.println(singleton.value);
        }
    }
}
