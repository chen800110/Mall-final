package com.louis.mallfinal.dao;

import com.louis.mallfinal.dto.CreateOrderRequest;
import com.louis.mallfinal.model.Order;
import com.louis.mallfinal.model.OrderItem;

import java.util.List;

public interface OrderDao {

    Order getOrderById(Integer orderId);

    List<OrderItem>getOrderItemsByOrderId(Integer orderId);
    Integer createOrder(Integer userId,Integer totalAmount);
    void createOrderItem(Integer orderId, List<OrderItem> orderItemList);
}