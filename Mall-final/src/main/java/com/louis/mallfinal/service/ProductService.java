package com.louis.mallfinal.service;

import com.louis.mallfinal.dto.ProductRequest;
import com.louis.mallfinal.model.Product;

public interface ProductService {
    Product getProductById(Integer ProductId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer ProductId, ProductRequest productRequest);
}
