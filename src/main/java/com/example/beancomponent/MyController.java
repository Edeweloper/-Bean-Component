package com.example.beancomponent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class MyController {
    @Autowired
    private  FirstClass firstClass;
    @Autowired
    private  SecondClass secondClass;
    @GetMapping(path = "/first")
    public String getFirstClass(){
        return  firstClass.getName();
    }
    @GetMapping(path = "/second")
    public String getSecondClass(){
        return  secondClass.getName();
    }
}
