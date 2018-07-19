package com.smile.azxx.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by Smile on 2018/6/12.
 */
@Component
public class SchedulerTask {

    private int count = 0;

    @Scheduled(cron="*/6 * * * * ?")
    private void process(){
//        System.out.println("this is scheduler task runing  "+(count++));
    }
}
