/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.formhandler.controller;

import com.mycompany.formhandler.model.ResponseStuff;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Steed
 */
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class FormReceiver {

    @GetMapping("/getTest")
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<ResponseStuff> getTest() {
        System.out.println("Accessed the Form Receiver");
        return ResponseEntity.ok(new ResponseStuff("Hello Amal!"));
    }

    @GetMapping("/getOneParam")
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<ResponseStuff> getTestParam(@RequestParam String name) {
        System.out.println("Accessed getTestParam");
        return ResponseEntity.ok(new ResponseStuff("Hello" + name + "!"));
    }

    @GetMapping("/getTwoParam")
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<ResponseStuff> getTestParam(@RequestParam String name, @RequestParam Boolean success) {
        System.out.println("Accessed getTestParam");
        if (success) {
            System.out.println("Good scenario");
            return ResponseEntity.ok(new ResponseStuff("Hello" + name + "!"));
        } else {
            System.out.println("Bad scenario");
            return new ResponseEntity(HttpStatus.SERVICE_UNAVAILABLE);
        }
    }
}
