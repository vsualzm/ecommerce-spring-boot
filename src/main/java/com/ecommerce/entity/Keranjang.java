package com.ecommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


@Data
@Entity
public class Keranjang implements Serializable {

    @Id
    private String id;

    @JoinColumn
    @ManyToOne
    private Product product;

    @JoinColumn
    @ManyToOne
    private Pengguna pengguna;

    private Double kuantitas;

    private BigDecimal harga;

    private BigDecimal jumlah;

    private Date waktuDibuat;

}
