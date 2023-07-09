package com.geekster.EcommerceAPI.controller;

import com.geekster.EcommerceAPI.model.Category;
import com.geekster.EcommerceAPI.model.Product;
import com.geekster.EcommerceAPI.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("product")
    public String addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }
    @GetMapping("products")
    public Iterable<Product> getAllProducts(){
        return productService.getAllProducts();
    }
    @GetMapping("product")
    public List<Product> getProductsByCategory(@RequestParam Category category){
        return productService.getProductByCategory(category);
    }

    @DeleteMapping("product/{id}")
    public String deleteProduct(@PathVariable Integer id){
        return productService.deleteProduct(id);
    }
}
