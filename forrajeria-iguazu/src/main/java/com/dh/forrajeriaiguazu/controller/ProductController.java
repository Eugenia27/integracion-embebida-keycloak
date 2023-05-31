package com.dh.forrajeriaiguazu.controller;


import com.dh.forrajeriaiguazu.Model.Product;
import com.dh.forrajeriaiguazu.Model.ProductDTO;
import com.dh.forrajeriaiguazu.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/vendedor")
    public ResponseEntity<List<Product>> getProductosVendedor() {
        return ResponseEntity.ok().body(productService.getProductosVendedor());
    }

    @GetMapping("/proveedor")
    public ResponseEntity<List<ProductDTO>> getProductosProveedor() {
        return ResponseEntity.ok().body(productService.getProductosProveedor());
    }

}
