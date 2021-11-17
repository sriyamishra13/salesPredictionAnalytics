package com.cloudComputing.productSalesAnalytics;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductDetailsRepository extends PagingAndSortingRepository<ProductDetails, Integer> {

        Boolean existsByProductId(Integer id);

        Boolean existsProductDetailsByProductId(Integer id);

        Boolean existsDistinctByProductCost(Long cost);
}
