package com.example.planetapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = "text/plain")
public class HelloController {

    @GetMapping("/helloWorld")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/helloMercury")
    public String helloMercury() {
        return "Hello Mercury";
    }

    @GetMapping("/helloVenus")
    public String helloVenus() {
        return "Hello Venus";
    }

    @GetMapping("/helloEarth")
    public String helloEarth() {
        return "Hello Earth";
    }

    @GetMapping("/helloMars")
    public String helloMars() {
        return "Hello Mars";
    }

    @GetMapping("/helloJupiter")
    public String helloJupiter() {
        return "Hello Jupiter";
    }

    @GetMapping("/helloSaturn")
    public String helloSaturn() {
        return "Hello Saturn";
    }

    @GetMapping("/helloUranus")
    public String helloUranus() {
        return "Hello Uranus";
    }

    @GetMapping("/helloNeptune")
    public String helloNeptune() {
        return "Hello Neptune";
    }
}
