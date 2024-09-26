package com.project.shopapp.services;

import com.project.shopapp.dtos.OrderDTO;
import com.project.shopapp.exceptions.DataNotFoundException;
import com.project.shopapp.models.Order;
import com.project.shopapp.responses.OrderResponse;

import java.util.List;

public interface IOrderService {
    Order createOrder (OrderDTO orderDTO) throws Exception;
    Order updateOrder (Long id, OrderDTO orderDTO) throws DataNotFoundException;
    Order getOrder(Long orderID);
    void deleteOrder(Long id);
    List<Order> getAllOrdersByUserId(Long userId);
}
