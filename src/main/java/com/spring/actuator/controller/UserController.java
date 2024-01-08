package com.spring.actuator.controller;

import com.spring.actuator.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
/*Combination of @Controller & @ResponseBody
    @Controller - Meta annotation of @Component which automatically registers instance in application context.
    @ResponseBody - Tells the controller that the object returned is automatically serialized into JSON and
                    passed back into the HttpResponse object.
 */
@RequestMapping("/user")
/*

    @RequestMapping - It is a handler method which maps HTTP requests.
                      Dispatcher servlet is responsible for routing incoming HTTPRequest to handler methods
                      of controllers.
 */
public class UserController {

    @Autowired // Forcefully injects beans into class.
    User user;

    @GetMapping("/data")
    /*
    Meta annotation of Request mapping used for handling get Http request.
     */
    public User getUser(){
        return user;
    }
}
