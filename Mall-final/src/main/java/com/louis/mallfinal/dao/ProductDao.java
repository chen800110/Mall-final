package com.louis.mallfinal.dao;

import com.louis.mallfinal.constant.ProductCategory;
import com.louis.mallfinal.dto.ProductQueryParams;
import com.louis.mallfinal.dto.ProductRequest;
import com.louis.mallfinal.model.Product;

import java.util.List;

public interface ProductDao {

    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer ProductId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer ProductId, ProductRequest productRequest);

    void deleteProductById(Integer ProductId);
}
