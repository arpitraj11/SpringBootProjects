package com.geekster.SimpleEcommerce.Repository;

import com.geekster.SimpleEcommerce.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class ProductRepo {

    @Autowired
    Map<Integer, Product> products;

    public Map<Integer, Product> getallproductList() {
        return products;
    }

}
