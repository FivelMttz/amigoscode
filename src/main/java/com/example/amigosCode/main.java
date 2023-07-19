package com.example.amigosCode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class main
{

    public static void main(String[] args) {
        SpringApplication.run(main.class,args);

    }

    @GetMapping("/HelloWorld")
    public String getHelloWorld()
    {
        return "Hello World";
    }

    @GetMapping("/HEROKU")
    public String getHeroku()
    {
        return "Hello Heroku";
    }



    @GetMapping("/image")
    public String getImage()
    {
        return "  https://example.com/images/image.jpg ";
    }

    @GetMapping("/Saludo")
    public GreetResponse getSaludo()
    {
        return new GreetResponse("Hola");

    }

    record GreetResponse(String string){}



}