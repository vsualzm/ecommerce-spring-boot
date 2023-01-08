//package com.ecommerce.controller;
//
//
//import com.ecommerce.entity.Kategori;
//import com.ecommerce.entity.Keranjang;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api")
//public class KeranjangControllers {
//
//    @Autowired
//    KeranjangService keranjangService;
//
//    @GetMapping("/keranjang")
//    public List<Keranjang> findAll(){
//        return keranjangService.findAll();
//    }
//
//    @GetMapping("/keranjang/{id}")
//    public Keranjang findById(@PathVariable("id") String id){
//        return keranjangService.findById(id);
//    }
//
//    @PostMapping("/keranjang")
//    public Keranjang create(@RequestBody Keranjang keranjang){
//        return keranjangService.create(keranjang);
//    }
//
//    @PutMapping("/keranjang")
//    public Keranjang edit(@RequestBody Keranjang keranjang){
//        return keranjangService.edit(keranjang);
//    }
//
//    @DeleteMapping("/keranjang/{id}")
//    public void deleteById(@PathVariable("id") String id){
//        keranjangService.deleteById(id);
//    }
//
//}
