package com.geekster.EcommerceAPI.service;

import com.geekster.EcommerceAPI.model.Order;
import com.geekster.EcommerceAPI.model.User;
import com.geekster.EcommerceAPI.repository.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    IOrderRepo orderRepo;

    public String createOrder(Order userorder) {
        orderRepo.save(userorder);
        return "Order Placed";
    }


    public User getuserOrderByOrderId(Integer orderId) {
        return orderRepo.findUserOrderByOrderId(orderId);
    }
}
