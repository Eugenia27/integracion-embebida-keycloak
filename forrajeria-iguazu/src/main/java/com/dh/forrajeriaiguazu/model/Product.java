package com.dh.forrajeriaiguazu.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    private Long id_producto;
    @Column
    private String nombre_prod;
    @Column
    private Double precio_prod;
    @Column
    private Double peso_prod;

}
