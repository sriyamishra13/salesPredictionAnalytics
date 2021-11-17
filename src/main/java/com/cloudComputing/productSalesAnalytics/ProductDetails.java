package com.cloudComputing.productSalesAnalytics;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.ZonedDateTime;

@Entity
@Table(name = "product_details", schema = "product_details")
@Getter
@Setter
public class ProductDetails {
    @Id
    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "product_quantity")
    private Integer productQuantity;

    @Column(name = "product_cost")
    private Integer productCost;

    @Column(name = "source_create_date")
    private ZonedDateTime sourceCreateDate;

    @Column(name = "source_update_date")
    private ZonedDateTime sourceUpdateDate;
}
