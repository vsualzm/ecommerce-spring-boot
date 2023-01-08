package com.ecommerce.service;


import com.ecommerce.entity.Kategori;
import com.ecommerce.entity.Pengguna;
import com.ecommerce.exception.ResourceNotFoundException;
import com.ecommerce.repository.KategoriRepository;
import com.ecommerce.repository.PenggunaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PenggunaService {

    @Autowired
    private PenggunaRepository penggunaRepository;

    public Pengguna findById(String id){
        return penggunaRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Pengguna dengan id " +  id + "tidak di temukan"));
    }

    public List<Pengguna> findAll(){
        return penggunaRepository.findAll();
    }

    public Pengguna create(Pengguna Pengguna){
        Pengguna.setId(UUID.randomUUID().toString());
        return penggunaRepository.save(Pengguna);
    }

    public Pengguna edit(Pengguna Pengguna){
        return penggunaRepository.save(Pengguna);
    }

    public void deleteById(String id){
        penggunaRepository.deleteById(id);
    }
}
