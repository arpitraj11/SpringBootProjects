package com.geekster.SimpleEcommerce.Controller;

import com.geekster.SimpleEcommerce.Model.Category;
import com.geekster.SimpleEcommerce.Model.Product;
import com.geekster.SimpleEcommerce.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    //get all products
    @GetMapping("products")
    public Map<Integer,Product> getallProducts(){

        return productService.getallProducts();
    }

    //add multiple products
    @PostMapping("products")
    public String addAllProducts(List<Product> products){
        return productService.addAllProducts(products);
    }
    //get all products below a price range
    @GetMapping("products/{price}")
    public List<Product> getallProductsBelowPriceRange(@PathVariable Double price){

        return productService.getallProductsBelowPriceRange(price);
    }
    //get all products belonging to a category
    @GetMapping("products/category/{category}")
    public List<Product> getallProductsbyCategory(@PathVariable Category category){

        return productService.getallProductsbyCategory(category);
    }

    @DeleteMapping("products/{pId}")
    public String removeProducts(@PathVariable Integer pId){
        return productService.removeProducts(pId);
    }

    // update price of products on some discount
    @PostMapping("products/discount/{discount}")
    public String updateProductbyDiscount(@PathVariable Double discount){
        return  productService.updateProductbyDiscount(discount);
    }




}
