//package com.ecommerce.controller;
//
//import com.ecommerce.entity.Pesanan;
//import com.ecommerce.entity.PesananItem;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api")
//public class PesananItemControllers {
//
//    @Autowired
//    private PesananItemService pesananItemService;
//
//    @GetMapping("/pesananitem")
//    public List<PesananItem> findAll(){
//        return pesananItemService.findAll();
//    }
//
//    @GetMapping("/pesananitem/{id}")
//    public PesananItem findById(@PathVariable("id") String id){
//        return pesananItemService.findById(id);
//    }
//
//    @PostMapping("/pesananitem")
//    public PesananItem create(@RequestBody PesananItem pesananItem){
//        return pesananItemService.create(pesanan);
//    }
//
//    @PutMapping("/pesananitem")
//    public PesananItem edit(@RequestBody PesananItem pesananItem){
//        return pesananItemService.edit(pesanan);
//    }
//
//    @DeleteMapping("/pesananitem/{id}")
//    public void deleteById(@PathVariable("id") String id){
//        pesananItemService.deleteById(id);
//    }
//}
//}
