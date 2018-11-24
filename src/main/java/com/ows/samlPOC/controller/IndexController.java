package com.ows.samlPOC.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "<html><body><h1>This output is returned from a valid index page </h1></body></html>";
    }
    
    @GetMapping("/samlTest")
    public String getTestedSaml() {
    	return "<html><body><h1>This output is returned from a valid saml page </h1></body></html>";
    }
}