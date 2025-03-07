package com.merin.sb_scheduler.basics;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.time.LocalTime;

@Slf4j
@Component
public class FixedRateScheduler {

    @Scheduled(fixedRate = 5000) // Executes every 5 seconds
    public void runTask() {
        log.info("Fixed rate task executed at: " + LocalTime.now());
    }
}
