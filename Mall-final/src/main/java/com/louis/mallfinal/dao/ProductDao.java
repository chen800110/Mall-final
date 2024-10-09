package com.louis.mallfinal.dao;

import com.louis.mallfinal.dto.ProductRequest;
import com.louis.mallfinal.model.Product;

public interface ProductDao {
    Product getProductById(Integer ProductId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer ProductId, ProductRequest productRequest);

    void deleteProductById(Integer ProductId);
}
