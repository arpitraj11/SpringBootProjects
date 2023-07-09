package com.geekster.EcommerceAPI.controller;

import com.geekster.EcommerceAPI.model.Order;
import com.geekster.EcommerceAPI.model.User;
import com.geekster.EcommerceAPI.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("userOrder")
    public String createOrder(@RequestBody Order userorder){
        return orderService.createOrder(userorder);
    }

    @GetMapping("userOrder/{orderId}")
    public User getUserById(@PathVariable Integer orderId){
        return orderService.getuserOrderByOrderId(orderId);
    }
}
