package com.example.automationapp;

import org.example.programmaticaly.RunTestSuite;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;
//@CrossOrigin(origins = "http://domain2.com", maxAge = 3600)
@Controller
@RequestMapping
public class AutomationResultsController {

    @CrossOrigin
    @GetMapping("/")
    public ResponseEntity<Response> run() {
        System.out.println("Running Test Suites");
        String basePath = "src/main/resources/suites/";
        List<String> files = Arrays.asList(basePath + "testng.xml", basePath + "testng2.xml");
        RunTestSuite.run(files);
        System.out.println("Done Running Test Suites");
        return new ResponseEntity<>(new Response(), HttpStatus.OK);
    }
}
