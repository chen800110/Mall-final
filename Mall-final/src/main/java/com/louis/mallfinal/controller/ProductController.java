package com.louis.mallfinal.controller;

import com.louis.mallfinal.model.Product;
import com.louis.mallfinal.service.ProductSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
}
