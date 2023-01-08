package com.ecommerce.controller;

import com.ecommerce.entity.Pengguna;
import com.ecommerce.service.PenggunaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PenggunaControllers {

    @Autowired
    private PenggunaService penggunaService;

    @GetMapping("/pengguna")
    public List<Pengguna> findAll(){
        return penggunaService.findAll();
    }

    @GetMapping("/pengguna/{id}")
    public Pengguna findById(@PathVariable("id") String id){
        return penggunaService.findById(id);
    }

    @PostMapping("/pengguna")
    public Pengguna create(@RequestBody Pengguna pengguna){
        return penggunaService.create(pengguna);
    }

    @PutMapping("/pengguna")
    public Pengguna edit(@RequestBody Pengguna pengguna){
        return penggunaService.edit(pengguna);
    }

    @DeleteMapping("/pengguna/{id}")
    public String deleteById(@PathVariable("id") String id){
        penggunaService.deleteById(id);
        return "SUCCESS DELETE Pengguna";
    }
}
