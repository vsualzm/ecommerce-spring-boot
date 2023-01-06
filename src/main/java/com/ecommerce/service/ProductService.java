package com.ecommerce.service;


import com.ecommerce.entity.Product;
import com.ecommerce.exception.ResourceNotFoundException;
import com.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findById(String id){
        return productRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Kategori dengan id " +  id + "tidak di temukan"));
    }

    public Product create(Product product){
        product.setId(UUID.randomUUID().toString());
        return productRepository.save(product);
    }

    public Product edit(Product product){
        return productRepository.save(product);
    }

    public Product ubahGambar(String id, String gambar){
        Product product = findById(id);
        product.setGambar(gambar);
        return productRepository.save(product);
    }

    public void deleteById(String id){
        productRepository.deleteById(id);
    }
}
