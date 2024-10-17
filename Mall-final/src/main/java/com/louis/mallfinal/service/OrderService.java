package com.louis.mallfinal.service;

import com.louis.mallfinal.dto.CreateOrderRequest;

public interface OrderService {
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
