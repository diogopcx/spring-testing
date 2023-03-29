package com.example.springtesting;

import org.springframework.stereotype.Service;

@Service
public class ServiceBaseObject implements ServiceInterface {

    @Override
    public void doStuff() {
        ServiceInterface.super.doStuff();
        System.out.println(ServiceBaseObject.class.getSimpleName());
    }
}
