package com.jh.halterocmsapi.controller;

import com.jh.halterocmscore.model.ExampleDTO;
import com.jh.halterocmscore.service.ExampleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ExampleController {

    private final ExampleService exampleService;

    public ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    @GetMapping("/examples")
    public ExampleDTO getExamples(){
        return this.exampleService.getExampleDTO();
    }
}
