//package com.ecommerce.controller;
//
//
//import com.ecommerce.entity.Pesanan;
//import com.ecommerce.entity.Product;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api")
//public class PesananControllers {
//
//
//    @Autowired
//    PesananService pesananService;
//
//    @GetMapping("/pesanan")
//    public List<Pesanan> findAll(){
//        return pesananService.findAll();
//    }
//
//    @GetMapping("/pesanan/{id}")
//    public Pesanan findById(@PathVariable("id") String id){
//        return pesananService.findById(id);
//    }
//
//    @PostMapping("/pesanan")
//    public Pesanan create(@RequestBody Pesanan pesanan){
//        return pesananService.create(pesanan);
//    }
//
//    @PutMapping("/pesanan")
//    public Pesanan edit(@RequestBody Pesanan pesanan){
//        return pesananService.edit(pesanan);
//    }
//
//    @DeleteMapping("/pesanan/{id}")
//    public void deleteById(@PathVariable("id") String id){
//        pesananService.deleteById(id);
//    }
//}
