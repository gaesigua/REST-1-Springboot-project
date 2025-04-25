package com.tin.REST_1_Springboot_project;

import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

//    1. A simple Get Request

    @GetMapping("/hallos")
    public String HalloAusControllerMethod1(){
        return "Hallo Aus Erste Controller Method1";
    }

//    2. A simple second Get Request

    @GetMapping("/hallos-2")
    public String HalloAusControllerMethod2(){
        return "Hallo Aus Erste Controller Method2";
    }

//    3. A Post Request using a strong message enter in Postman body

    @PostMapping("/posts")
    public String postMessage(@RequestBody String message){
        return "The Post Request Message is: " + message;
    }

//    4. A Post Request using an Object from another class we called OrderDetails, and since it does not return a string object, we have to convert it into a a string

    @PostMapping("/posts-orders")
    public String postMessage2(@RequestBody OrderDetails orderDetails){
        return "The Post Request OrderDetails Message is: " + orderDetails.toString();
    }

//    5. A Post Request using an Object from a RECORD, instead of using a normal java object (Plain Old Java Object) like we did earlier

    @PostMapping("/posts-orders-record")
    public String postRecord(@RequestBody OrderRecord orderRecord){
        return "The Post Request OrderRecord Message is: " + orderRecord.toString();
    }

    // 6. How can we pass a variable/parameter to our path....as a PATH VARIABLE
          //something like this: http://localhost:8080/hallos3/gaesigua tin
          //the Path variable annotation is used in Spring MVC when a value you want is part of the URL

    @GetMapping("/hallos3/{user-name}")

    public String myPathVariable(@PathVariable("user-name") String userName) {
        return "My Path Variable is: " + userName;
    }

    //7 Now How can we pass a variable/parameter as a REQUEST PARAM, in this case below, we are going to add 2 params
         //something like this: http://localhost:8080/hallos4?param-name1=paramvalue1&param-name2=paramvalue2
        //the RequestParam annotation is used in Spring MVC to extract Query parameters from the URL; Query parameters are typically used to carry contexts information
        //for the request and they differ from the Path Variable to the use of the question mark and

    @GetMapping("/hallos4/")
    public String myRequestParam(@RequestParam("first-name") String firstName, @RequestParam("last-name") String lastName){
        return "My Request Parameter is : " + firstName + " for the First Name, and " + lastName + " for the Last Name";
    }
}




