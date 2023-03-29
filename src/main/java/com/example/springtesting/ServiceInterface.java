package com.example.springtesting;

public interface ServiceInterface {

    default void doStuff() {
        System.out.println(ServiceInterface.class.getSimpleName());
    }
}
