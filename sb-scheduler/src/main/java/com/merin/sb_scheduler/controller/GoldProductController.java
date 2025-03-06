package com.merin.sb_scheduler.controller;

import com.merin.sb_scheduler.entity.GoldProduct;
import com.merin.sb_scheduler.service.GoldIProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class GoldProductController {

    @Autowired
    private GoldIProductService productService;

    @GetMapping
    public List<GoldProduct> getAllProducts() {
        return productService.getAllProducts();
    }
}
