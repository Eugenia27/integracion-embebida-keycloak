package com.dh.forrajeriaiguazu.repository;


import com.dh.forrajeriaiguazu.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends JpaRepository<Product,Long> {

    //@Query("select nombre_prod, precio_prod from productos")
    //List<ProductDTO> getProductosProveedor();

}
