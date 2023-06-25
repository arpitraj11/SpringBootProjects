package com.guptaas.Restaurantmodel.factory;

import com.guptaas.Restaurantmodel.model.Restaurant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class BeanFactory {

    @Bean
    Map<Integer , Restaurant> getRestaturantMap(){
        return new HashMap<>();
    }
}
