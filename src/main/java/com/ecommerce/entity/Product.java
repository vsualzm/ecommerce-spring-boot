package com.ecommerce.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Data
public class Product implements Serializable {

    @Id
    private String id;

    private String nama;

    private String deskripsi;

    private String gambar;

    @JoinColumn
    @ManyToOne
    private Kategori kategori;

    private BigDecimal harga;

    private Double stock;
}
