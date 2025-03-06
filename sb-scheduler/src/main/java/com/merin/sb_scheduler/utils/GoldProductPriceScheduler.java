package com.merin.sb_scheduler.utils;

import com.merin.sb_scheduler.service.GoldIProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class GoldProductPriceScheduler {

    @Autowired
    private GoldIProductService productService;

    // Schedule the task to run every day at 7:30 PM IST
    @Scheduled(cron = "0 10 20 * * ?", zone = "IST")
    public void updateProductPricesDaily() {

        productService.updateProductPrices();
        log.info("Product prices updated at: " + java.time.LocalDateTime.now());
    }

    /*

    0 → Seconds (0th second of the minute)
    30 → Minutes (30th minute of the hour)
    19 → Hours (7 PM in 24-hour format)
    * → Day of the month (every day)
    * → Month (every month)
    ? → Day of the week (no specific day, since we are using the day of the month)

    */
}
