package com.louis.mallfinal.service.Impl;

import com.louis.mallfinal.dao.ProductDao;
import com.louis.mallfinal.model.Product;
import com.louis.mallfinal.service.ProductSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductSeviceImpl implements ProductSevice {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer ProductId) {
        return productDao.getProductById(ProductId);
    }
}
