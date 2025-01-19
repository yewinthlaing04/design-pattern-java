package com.ye.designpattern.creational.singleton;

// to ensure immutability , thread safe and proper use of singleton principle
public final class ThreadSafeSingleton {

    // volatile keyword to ensure memory visibility and
    // prevents reordering of instructions.

    private static volatile ThreadSafeSingleton instance ;
    public String value ;

    private ThreadSafeSingleton( String value ) {
        this.value = value ;
    }

    public static ThreadSafeSingleton getInstance(String value ) {
        ThreadSafeSingleton result = instance ;
        if ( result != null ) {
            return result ; // return existing instance
        }
        synchronized ( ThreadSafeSingleton.class ) { // synchronized block
            if ( instance == null ) { // with double check
                instance = new ThreadSafeSingleton(value); // property assign to static instance
            }
            return instance ;  // Double Checked Locking
        }
    }
}
