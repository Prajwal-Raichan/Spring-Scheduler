package com.merin.sb_scheduler.basics.threads;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Slf4j
@Component
public class MultiThreadedScheduler {

    private final ThreadPoolTaskScheduler scheduler;

    public MultiThreadedScheduler(ThreadPoolTaskScheduler scheduler) {
        this.scheduler = scheduler;
    }

    @Scheduled(fixedRate = 5000)
    public void runTask() {
        scheduler.submit(() -> {
           log.info(Thread.currentThread().getName() + " executing task at: " + LocalTime.now());
        });
    }
}

