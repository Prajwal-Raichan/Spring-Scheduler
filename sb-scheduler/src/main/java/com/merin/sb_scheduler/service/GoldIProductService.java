package com.merin.sb_scheduler.service;

import com.merin.sb_scheduler.entity.GoldProduct;

import java.util.List;

public interface GoldIProductService {

    void updateProductPrices();

    List<GoldProduct> getAllProducts();
}
