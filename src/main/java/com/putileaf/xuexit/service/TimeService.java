package com.putileaf.xuexit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class TimeService {
    @Autowired private MyService myService;
    //定时打卡，每天8：01
    @Scheduled(cron = "0 01 8 * * ?",zone = "Asia/Shanghai")
    public void time0801(){
        runYun("Your_Cookie");
        runYun("Your_Cookie2");
    }
    //定时打卡，每天8：30
    @Scheduled(cron = "0 30 8 * * ?",zone = "Asia/Shanghai")
    public void time0900(){
        runYun("Your_Cookie");
        runYun("Your_Cookie2");

    }



    public void runYun(String User_Cookie){
        Mono<String> checkMono = myService.getCheckCode(User_Cookie);
        String checkCode = checkMono.block();
        System.out.println("checkCode值：" + checkCode);
        Mono<String> sendMono = myService.sendFormData(checkCode,User_Cookie);
        String result = sendMono.block();
        System.out.println("result值：" + result);
    }

}
