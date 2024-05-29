package com.danunaik.deploytest.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {
    @GetMapping
    public  Object hello(){
        Map<String,String> object=new HashMap<>();
        object.put("user details","values");
        object.put("name","Danesh Naik");
        object.put("email","danesh.naik@incture.com");
        object.put("city","Belagavi");
        object.put("Mobile Number","7022329220");

        return object;
    }


}
