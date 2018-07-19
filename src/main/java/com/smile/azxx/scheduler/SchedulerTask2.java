package com.smile.azxx.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

/**
 * Created by Smile on 2018/6/12.
 */
@Component
public class SchedulerTask2 {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");


    @Scheduled(fixedRate = 6000)
    public void reportCurrentTime(){
//        System.out.println("现在时间：" + sdf.format(new Date()));
    }
}
