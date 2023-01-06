package com.ecommerce.service;


import com.ecommerce.entity.Kategori;
import com.ecommerce.exception.ResourceNotFoundException;
import com.ecommerce.repository.KategoriRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class KategoriService {

    @Autowired
    private KategoriRepository kategoriRepository;

    public Kategori findById(String id){
        return kategoriRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Kategori dengan id " +  id + "tidak di temukan"));
    }

    public List<Kategori> findAll(){
        return kategoriRepository.findAll();
    }

    public Kategori create(Kategori kategori){
        kategori.setId(UUID.randomUUID().toString());
        return kategoriRepository.save(kategori);
    }

    public Kategori edit(Kategori kategori){
        return kategoriRepository.save(kategori);
    }

    public void deleteById(String id){
        kategoriRepository.deleteById(id);
    }
}
