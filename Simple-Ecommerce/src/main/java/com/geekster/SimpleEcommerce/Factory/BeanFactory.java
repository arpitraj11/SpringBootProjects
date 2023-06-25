package com.geekster.SimpleEcommerce.Factory;

import com.geekster.SimpleEcommerce.Model.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class BeanFactory {

    @Bean
    Map<Integer, Product> getProductMap(){
        return new HashMap<>();
    }
}
