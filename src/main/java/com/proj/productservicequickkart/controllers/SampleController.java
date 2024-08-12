package com.proj.productservicequickkart.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SampleController {
    @GetMapping("/say/{name}/{surname}/{times}")
    public String hello(@PathVariable String name, @PathVariable String surname,
                        @PathVariable int times)
    {
        String str="";
        for(int i=0;i<times;i++)
        {
            str = i+" "+str + name + " "+surname;
        }
        return str;
    }
}
