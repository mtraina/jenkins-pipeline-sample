package com.mtraina;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/greeting")
    public Greeting greeting(){
        return new Greeting("hello world");
    }

    private static final class Greeting {
        private final String text;

        public Greeting(String text) {
            this.text = text;
        }

        public String getText(){
            return text;
        }

    }
}
