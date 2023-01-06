package com.ecommerce.repository;

import com.ecommerce.entity.Pesanan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PesananItemRepository extends JpaRepository<Pesanan,String> {

}
