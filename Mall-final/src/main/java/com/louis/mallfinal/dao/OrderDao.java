package com.louis.mallfinal.dao;

import com.louis.mallfinal.dto.CreateOrderRequest;
import com.louis.mallfinal.dto.OrderQueryParams;
import com.louis.mallfinal.model.Order;
import com.louis.mallfinal.model.OrderItem;

import java.util.List;

public interface OrderDao {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    List<OrderItem> getOrderItemsByOrderId(Integer orderId);

    Integer createOrder(Integer userId,Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}