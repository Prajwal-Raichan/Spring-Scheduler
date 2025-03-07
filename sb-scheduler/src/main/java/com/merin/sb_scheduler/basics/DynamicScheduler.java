package com.merin.sb_scheduler.basics;

import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.concurrent.Executors;

@Component
public class DynamicScheduler implements SchedulingConfigurer {

    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        taskRegistrar.setScheduler(Executors.newSingleThreadScheduledExecutor());

        taskRegistrar.addCronTask(this::runTask, "0/10 * * * * *"); // Runs every 10 seconds
    }

    private void runTask() {
        System.out.println("Dynamic task executed at: " + LocalTime.now());
    }
}
