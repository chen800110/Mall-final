package com.louis.mallfinal.controller;

import com.louis.mallfinal.dto.ProductRequest;
import com.louis.mallfinal.model.Product;
import com.louis.mallfinal.service.ProductSevice;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    private ProductSevice productSevice;

    @GetMapping("products/{productId}")
    public ResponseEntity<Product> getProduct(@PathVariable Integer productId) {
    Product product = productSevice.getProductById(productId);

    if (product != null) {
        return ResponseEntity.status(HttpStatus.OK).body(product);
    }else {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
    }


    @PostMapping("/products")
    public ResponseEntity<Product> createProduct(@RequestBody @Valid ProductRequest productRequest) {
       Integer productId= productSevice.createProduct(productRequest);
       Product product = productSevice.getProductById(productId);
       return ResponseEntity.status(HttpStatus.CREATED).body(product);

    }
}
