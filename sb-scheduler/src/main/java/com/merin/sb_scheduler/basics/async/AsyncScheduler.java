package com.merin.sb_scheduler.basics.async;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class AsyncScheduler {

    private final AsyncService asyncService;

    public AsyncScheduler(AsyncService asyncService) {
        this.asyncService = asyncService;
    }

    @Scheduled(fixedRate = 5000)
    public void runAsyncTask() throws InterruptedException {
        asyncService.longRunningTask();
    }
}

