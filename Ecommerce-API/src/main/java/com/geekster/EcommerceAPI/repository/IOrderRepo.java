package com.geekster.EcommerceAPI.repository;

import com.geekster.EcommerceAPI.model.Order;
import com.geekster.EcommerceAPI.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepo extends CrudRepository<Order, Integer> {


    User findUserOrderByOrderId(Integer orderId);
}
