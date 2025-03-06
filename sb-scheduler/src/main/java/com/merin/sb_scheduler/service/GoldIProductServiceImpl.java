package com.merin.sb_scheduler.service;

import com.merin.sb_scheduler.entity.GoldProduct;
import com.merin.sb_scheduler.repository.GoldIProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

@Slf4j
@Service
public class GoldIProductServiceImpl implements GoldIProductService {

    @Autowired
    private GoldIProductRepository productRepository;

    // Method to update product prices
    public void updateProductPrices() {
        List<GoldProduct> products = productRepository.findAll();
        Random random = new Random();

        for (GoldProduct product : products) {
            // Generate a random price between 100 and 1000
            double newPrice = 100 + (1000 - 100) * random.nextDouble();
            product.setPrice(newPrice);
            product.setLastUpdated(LocalDateTime.now());
            productRepository.save(product);
        }
    }

    // Method to fetch all products
    public List<GoldProduct> getAllProducts() {
        return productRepository.findAll();
    }
}
