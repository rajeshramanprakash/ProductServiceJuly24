package com.scaler.productservicejuly24.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//This class  host.
@RestController
@RequestMapping("/say")
public class SampleController {
    @GetMapping("/hello/{name1}/{time}")
    public  String sayHello(@PathVariable("name1") String om,
                            @PathVariable("time") int last_name){
        String  outpot = "";
        for (int i = 0; i < last_name; i++) {
            outpot += "hello  " +om;
        }
        return  outpot;
    }
    @GetMapping("/bye")
    public  String  sayBy(){
        return  "bye All";
    }
}
