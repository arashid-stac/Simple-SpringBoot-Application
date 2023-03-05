package com.sbtutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/greet")
    public Greeting greet(){
        Person alli = new Person("Alli", 25, 1000.00);
        Greeting response = new Greeting(
                "Hello",
                List.of("Java", "Python", "Javascript"),
                alli
        );
        return response;
    }

    record Person(String name, int age, double savings) {

    }
    record Greeting(String greet, List<String> faveProgrammingLanguages, Person person){

    }
}
