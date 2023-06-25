package com.geekster.SimpleEcommerce.Service;

import com.geekster.SimpleEcommerce.Model.Category;
import com.geekster.SimpleEcommerce.Model.Product;
import com.geekster.SimpleEcommerce.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

    public Map<Integer, Product> getallProducts() {
        return productRepo.getallproductList();
    }

    public String addAllProducts(List<Product> products) {

        Map<Integer, Product> productList= getallProducts();
        for(Product product : products){
            productList.put(product.getProductId() ,product);
        }
        return "products are added";
    }


    public List<Product> getallProductsBelowPriceRange(Double price) {

        List<Product> priceFilteredProd =new ArrayList<>();
        Map<Integer, Product> productList=getallProducts();
        for(Integer id : productList.keySet()){
            if(productList.get(id).getProductPrice() <= price){
                priceFilteredProd.add(productList.get(id));
            }
        }
        return priceFilteredProd;
    }

    public List<Product> getallProductsbyCategory(Category category) {
        List<Product> categoryFilteredProd =new ArrayList<>();
        Map<Integer, Product> productList=getallProducts();
        for(Integer id : productList.keySet()){
            if(productList.get(id).getProductCategory().equals(category)){
                categoryFilteredProd.add(productList.get(id));
            }
        }
        return categoryFilteredProd;
    }

    public String removeProducts(Integer pId) {
        Map<Integer, Product> productList=getallProducts();
        Product product= productList.get(pId);
        if(product != null){
            productList.remove(pId);
            return pId + "removed" ;
        }else{
            return pId + "Not Found";
        }
    }

    public String updateProductbyDiscount(Double discount) {
        Map<Integer, Product> productList=getallProducts();
        for(Integer id : productList.keySet()){
            Double actualPrice= productList.get(id).getProductPrice();
            Double discountedPrice = actualPrice +(1-(discount/(100.00)));
            productList.get(id).setProductPrice(discountedPrice);
        }
        return  " Price Updated";
    }
}
