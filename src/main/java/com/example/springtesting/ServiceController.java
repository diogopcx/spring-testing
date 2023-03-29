package com.example.springtesting;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ServiceController {

    @Qualifier("serviceBaseObject")
    private final ServiceInterface serviceBase;
    @Qualifier("serviceExtension")
    private final ServiceInterface serviceExtension;

    @GetMapping("/doStuff")
    public void getDoStuff() {
        serviceBase.doStuff();
        serviceExtension.doStuff();
    }
}
