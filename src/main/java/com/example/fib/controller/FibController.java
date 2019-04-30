package com.example.fib.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fib.service.FibService;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class FibController {
	
	
	
	@Autowired
	FibService fibService;
	
    @GetMapping("/get/fib/{nNumber}")
    public Map<String, String> getFib(@PathVariable("nNumber") int nNumber) {
    	
        return fibService.getFibValue(nNumber);
    }
    @GetMapping("/refresh/fib")
    public String refreshFib() {
    	
        return "admin access";
    }
}
