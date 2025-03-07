package com.merin.sb_scheduler.basics;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
public class ConfigurableScheduler {

    @Value("${scheduler.cron}")
    private String cronExpression;

    @Value("${scheduler.fixedRate}")
    private long fixedRate;

    @Scheduled(cron = "${scheduler.cron}")
    public void runCronTask() {
        System.out.println("Configurable Cron Task executed at: " + LocalTime.now());
    }

    @Scheduled(fixedRateString = "${scheduler.fixedRate}")
    public void runFixedRateTask() {
        System.out.println("Configurable Fixed Rate Task executed at: " + LocalTime.now());
    }
}

