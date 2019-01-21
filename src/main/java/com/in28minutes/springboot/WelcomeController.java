package com.in28minutes.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

        // Auto wiring
        @Autowired
        private WelcomeService service = new WelcomeService();

        @RequestMapping("/welcome")
        public String Welcome() {
            return service.retrieveWelcomeMessage();
        }
}


@Component
class WelcomeService {
    public String retrieveWelcomeMessage() {

        return "Good Morning from Spring DI!" ;
    }
}