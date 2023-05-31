package com.dh.forrajeriaiguazu.service;


import com.dh.forrajeriaiguazu.Model.Product;
import com.dh.forrajeriaiguazu.Model.ProductDTO;
import com.dh.forrajeriaiguazu.repository.IProductRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private IProductRepository productRepository;

    public List<Product> getProductosVendedor() {
        return productRepository.findAll();
    }

    public List<ProductDTO> getProductosProveedor() {
        List<Product> allProducts = productRepository.findAll();
        List<ProductDTO> allProductsProveedor = new ArrayList<>();

        for (Product product: allProducts) {
            ObjectMapper mapper = new ObjectMapper();
            ProductDTO productDTO = mapper.convertValue(product, ProductDTO.class);
            System.out.println(productDTO.getNombre_prod());
            allProductsProveedor.add(productDTO);
        }

        System.out.println(allProductsProveedor.size());
        return allProductsProveedor;
    }

}
