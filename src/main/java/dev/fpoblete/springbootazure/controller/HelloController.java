package dev.fpoblete.springbootazure.controller;

import dev.fpoblete.springbootazure.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    GreetingService greetingService;

    @RequestMapping("/")
    public String index() {
        return greetingService.sayHello();
    }

}
