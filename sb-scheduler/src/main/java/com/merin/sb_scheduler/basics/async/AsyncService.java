package com.merin.sb_scheduler.basics.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class AsyncService {

    @Async
    public void longRunningTask() throws InterruptedException {
        System.out.println("Async Task Started: " + LocalTime.now());
        Thread.sleep(10000); // Simulate long task
        System.out.println("Async Task Finished: " + LocalTime.now());
    }
}

