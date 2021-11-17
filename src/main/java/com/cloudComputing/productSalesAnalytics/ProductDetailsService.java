package com.cloudComputing.productSalesAnalytics;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductDetailsService {

    @Autowired
    private ProductDetailsRepository productDetailsRepository;

    public Boolean existsByProductId(Integer id) {
        return productDetailsRepository.existsByProductId(id);
    }
}
