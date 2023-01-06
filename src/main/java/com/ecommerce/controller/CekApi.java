package com.ecommerce.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cekapi")
public class CekApi {

    @GetMapping("/get")
    public String getDatas(){
        return "Hallo nama saya ilham maulaans";
    }
}
