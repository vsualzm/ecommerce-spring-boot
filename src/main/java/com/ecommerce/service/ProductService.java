package com.ecommerce.service;


import com.ecommerce.entity.Product;
import com.ecommerce.exception.BadRequestException;
import com.ecommerce.exception.ResourceNotFoundException;
import com.ecommerce.repository.KategoriRepository;
import com.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.UUID;

@Service
public class ProductService {

    @Autowired
    private KategoriRepository kategoriRepository;

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
        // Validation Manual
        if(!StringUtils.hasText(product.getNama())){
            throw new BadRequestException("nama produk tidak boleh kosong");
        }

        if(product.getKategori() == null){
            throw new BadRequestException("Kategori tidak boleh kosong");
        }

        if(!StringUtils.hasText(product.getKategori().getId())){
            throw new BadRequestException("kategori id tidak boleh kosong");
        }

        kategoriRepository.findById(product.getKategori().getId())
                .orElseThrow(() -> new BadRequestException
                        ("kategori ID" + product.getKategori().getId() + "tidak ditemukan dalam database" ));

        product.setId(UUID.randomUUID().toString());
        return productRepository.save(product);
    }

    public Product edit(Product product){

        if(!StringUtils.hasText(product.getId())){
            throw new BadRequestException("Product ID harus di isi");
        }

        // Validation Manual
        if(!StringUtils.hasText(product.getNama())){
            throw new BadRequestException("nama produk tidak boleh kosong");
        }

        if(product.getKategori() == null){
            throw new BadRequestException("Kategori tidak boleh kosong");
        }

        if(!StringUtils.hasText(product.getKategori().getId())){
            throw new BadRequestException("kategori id tidak boleh kosong");
        }

        kategoriRepository.findById(product.getKategori().getId())
                .orElseThrow(() -> new BadRequestException
                        ("kategori ID" + product.getKategori().getId() + "tidak ditemukan dalam database" ));


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
