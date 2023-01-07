package com.ecommerce.controller;


import com.ecommerce.entity.Kategori;
import com.ecommerce.entity.Product;
import com.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductControllers {


    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public List<Product> findAll(){
        return productService.findAll();
    }

    @GetMapping("/product/{id}")
    public Product findById(@PathVariable("id") String id){
        return productService.findById(id);
    }

    @PostMapping("/product")
    public Product create(@RequestBody Product product){
        return productService.create(product);
    }

    @PutMapping("/product")
    public Product edit(@RequestBody Product product){
        return productService.edit(product);
    }

    @DeleteMapping("/product/{id}")
    public void deleteById(@PathVariable("id") String id){
        productService.deleteById(id);
    }



}
