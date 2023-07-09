package com.geekster.EcommerceAPI.service;

import com.geekster.EcommerceAPI.model.Category;
import com.geekster.EcommerceAPI.model.Product;
import com.geekster.EcommerceAPI.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    IProductRepo productRepo;

    public String addProduct(Product product) {
        productRepo.save(product);
        return "Product Added";
    }

    public Iterable<Product> getAllProducts() {
        return productRepo.findAll();
    }


    public List<Product> getProductByCategory(Category category) {
        return productRepo.findProductByCategory(category);
    }

    public String deleteProduct(Integer id) {
        productRepo.deleteById(id);
        return "Deleted Product";
    }
}
