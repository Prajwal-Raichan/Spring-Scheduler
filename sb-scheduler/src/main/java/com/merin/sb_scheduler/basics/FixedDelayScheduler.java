package com.merin.sb_scheduler.basics;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Slf4j
@Component
public class FixedDelayScheduler {

    @Scheduled(fixedDelay = 5000) // Executes 5 seconds after the last execution finishes
    public void runTask() {
        log.info("Fixed delay task executed at: " + LocalTime.now());
    }
}