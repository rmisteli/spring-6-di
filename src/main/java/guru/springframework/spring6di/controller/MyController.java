package guru.springframework.spring6di.controller;

import guru.springframework.spring6di.service.GreetingService;
import guru.springframework.spring6di.service.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }


    public String sayHello() {
        System.out.println("I'm in MyController");

        return greetingService.sayGreeting();
    }
}
