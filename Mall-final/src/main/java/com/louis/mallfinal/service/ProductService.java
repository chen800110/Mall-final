package com.louis.mallfinal.service;

import com.louis.mallfinal.dto.ProductQueryParams;
import com.louis.mallfinal.dto.ProductRequest;
import com.louis.mallfinal.model.Product;

import java.util.List;

public interface ProductService {

    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer ProductId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer ProductId, ProductRequest productRequest);

    void deleteProductById(Integer ProductId);

}
