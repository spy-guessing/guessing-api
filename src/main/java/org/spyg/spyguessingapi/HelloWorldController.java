package org.spyg.spyguessingapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping
    public String sayHello() {
        return "Hello, World!";
    }

}
