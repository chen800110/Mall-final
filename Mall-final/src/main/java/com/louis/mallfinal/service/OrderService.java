package com.louis.mallfinal.service;

import com.louis.mallfinal.dto.CreateOrderRequest;
import com.louis.mallfinal.dto.OrderQueryParams;
import com.louis.mallfinal.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);
    Order getOrderById(Integer orderId);
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}