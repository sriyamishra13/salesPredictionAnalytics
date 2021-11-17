package com.cloudComputing.productSalesAnalytics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductSalesAPI {

    @Autowired
    private ProductDetailsService productDetailsService;

    @PostMapping
    public void postProductSales() {
        //200 OK dummy
    }

    @GetMapping(value = "/{id}")
    public String fetchProductSales(@PathVariable("id") Long id) {
       if(productDetailsService.existsByProductId(id.intValue())) {
           return "Product is already registered";
       } else {
           return "Product not found, please register the product!!";
       }
    }

}
