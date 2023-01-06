package com.ecommerce.repository;

import com.ecommerce.entity.Kategori;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KategoriRepository extends JpaRepository<Kategori , String> {
}
