package com.geekster.EcommerceAPI.repository;

import com.geekster.EcommerceAPI.model.Category;
import com.geekster.EcommerceAPI.model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepo extends CrudRepository<Product , Integer> {

    @Query(value = "Select * from Product where Category =:category",nativeQuery = true)
    List<Product> findProductByCategory(Category category);

}
