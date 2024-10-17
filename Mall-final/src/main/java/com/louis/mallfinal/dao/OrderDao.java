package com.louis.mallfinal.dao;

import com.louis.mallfinal.dto.CreateOrderRequest;
import com.louis.mallfinal.model.OrderItem;

import java.util.List;

public interface OrderDao {
    Integer createOrder(Integer userId,Integer totalAmount);
    void createOrderItem(Integer orderId, List<OrderItem> orderItemList);
}