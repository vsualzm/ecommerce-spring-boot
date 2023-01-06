package com.ecommerce.repository;

import com.ecommerce.entity.Keranjang;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PenggunaRepository extends JpaRepository<Keranjang, String> {

}
