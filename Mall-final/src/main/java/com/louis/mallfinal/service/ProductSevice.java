package com.louis.mallfinal.service;

import com.louis.mallfinal.dto.ProductRequest;
import com.louis.mallfinal.model.Product;

public interface ProductSevice {
    Product getProductById(Integer ProductId);

    Integer createProduct(ProductRequest productRequest);
}
