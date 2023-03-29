package com.example.springtesting;

import org.springframework.stereotype.Service;

@Service
public class ServiceExtension extends ServiceBaseObject {

    @Override
    public void doStuff() {
        super.doStuff();
        System.out.println(ServiceExtension.class.getSimpleName());
    }
}
