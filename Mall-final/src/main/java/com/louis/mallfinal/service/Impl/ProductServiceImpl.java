package com.louis.mallfinal.service.Impl;

import com.louis.mallfinal.dao.ProductDao;
import com.louis.mallfinal.dto.ProductRequest;
import com.louis.mallfinal.model.Product;
import com.louis.mallfinal.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer ProductId) {
        return productDao.getProductById(ProductId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);

    }

    @Override
    public void updateProduct(Integer ProductId, ProductRequest productRequest) {
        productDao.updateProduct(ProductId, productRequest);
    }
}


