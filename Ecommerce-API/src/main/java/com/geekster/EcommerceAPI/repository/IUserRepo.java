package com.geekster.EcommerceAPI.repository;

import com.geekster.EcommerceAPI.model.User;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends CrudRepository<User, Integer> {

    User findByUserId(Integer userId);



}
