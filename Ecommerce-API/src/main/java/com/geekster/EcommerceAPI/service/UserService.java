package com.geekster.EcommerceAPI.service;

import com.geekster.EcommerceAPI.model.User;
import com.geekster.EcommerceAPI.repository.IUserRepo;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService  {

    @Autowired
    IUserRepo userRepo;

    public String addUser(User user) {
        userRepo.save(user);
        return "Added";
    }

    public User getUserById(Integer userId) {
        return userRepo.findByUserId(userId);
    }
}
