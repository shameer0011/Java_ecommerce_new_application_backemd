package com.example.OrderApp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class orderController {

       @GetMapping("/getallorders")
    public ResponseEntity<String> getProduct() {
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }
    
}
