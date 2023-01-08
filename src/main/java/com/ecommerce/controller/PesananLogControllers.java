//package com.ecommerce.controller;
//
//
//import com.ecommerce.entity.PesananLog;
//import com.ecommerce.entity.Product;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api")
//public class PesananLogControllers {
//
//    @Autowired
//    private PesananLogService pesananLogService;
//
//    @GetMapping("/pesananlog")
//    public List<PesananLog> findAll(){
//        return pesananLogService.findAll();
//    }
//
//    @GetMapping("/pesananlog/{id}")
//    public PesananLog findById(@PathVariable("id") String id){
//        return pesananLogService.findById(id);
//    }
//
//    @PostMapping("/pesananlog")
//    public PesananLog create(@RequestBody PesananLog pesananLog){
//        return pesananLogService.create(pesananLog);
//    }
//
//    @PutMapping("/pesananlog")
//    public PesananLog edit(@RequestBody PesananLog pesananLog){
//        return pesananLogService.edit(pesananLog);
//    }
//
//    @DeleteMapping("/pesananlog/{id}")
//    public void deleteById(@PathVariable("id") String id){
//        pesananLogService.deleteById(id);
//    }
//}
