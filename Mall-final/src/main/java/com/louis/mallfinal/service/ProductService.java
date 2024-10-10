package com.louis.mallfinal.service;

import com.louis.mallfinal.dto.ProductRequest;
import com.louis.mallfinal.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts();

    Product getProductById(Integer ProductId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer ProductId, ProductRequest productRequest);

    void deleteProductById(Integer ProductId);

}
