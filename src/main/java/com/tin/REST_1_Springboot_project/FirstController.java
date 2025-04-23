package com.tin.REST_1_Springboot_project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/hallos")
    public String HalloAusControllerMethod1(){
        return "Hallo Aus Erste Controller Method1";
    }

    @GetMapping("/hallos-2")
    public String HalloAusControllerMethod2(){
        return "Hallo Aus Erste Controller Method2";
    }

    @PostMapping("/posts")
    public String postMessage(@RequestBody String message){
        return "The Post Request Message is: " + message;
    }

    @PostMapping("/posts-orders")
    public String postMessage2(@RequestBody OrderDetails orderDetails){
        return "The Post Request OrderDetails Message is: " + orderDetails.toString();
    }

    @PostMapping("/posts-orders-record")
    public String postRecord(@RequestBody OrderRecord orderRecord){
        return "The Post Request OrderRecord Message is: " + orderRecord.toString();
    }
}
