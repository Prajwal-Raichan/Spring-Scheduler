package com.merin.sb_scheduler.basics;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
public class CronScheduler {

    @Scheduled(cron = "0 0/1 * * * ?") // Runs every 1 minute
    public void runTask() {
        System.out.println("Cron task executed at: " + LocalTime.now());
    }
}

/*

Expression	Execution Schedule
"0 0 12 * * ?"	Runs at 12:00 PM daily
"0 15 10 * * ?"	Runs at 10:15 AM daily
"0 0/5 * * * ?"	Runs every 5 minutes

 */