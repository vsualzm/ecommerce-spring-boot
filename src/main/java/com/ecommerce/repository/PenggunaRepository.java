package com.ecommerce.repository;


import com.ecommerce.entity.Pengguna;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PenggunaRepository extends JpaRepository<Pengguna, String> {

}
