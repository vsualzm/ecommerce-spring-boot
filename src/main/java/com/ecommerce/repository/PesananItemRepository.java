package com.ecommerce.repository;

import com.ecommerce.entity.Pesanan;
import com.ecommerce.entity.PesananItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PesananItemRepository extends JpaRepository<PesananItem,String> {

}
