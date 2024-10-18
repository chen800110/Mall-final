package com.louis.mallfinal.service;

import com.louis.mallfinal.dto.CreateOrderRequest;
import com.louis.mallfinal.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}