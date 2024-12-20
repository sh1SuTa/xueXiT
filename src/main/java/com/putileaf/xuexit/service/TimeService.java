package com.putileaf.xuexit.service;

import com.putileaf.xuexit.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class TimeService {
    @Autowired private MyService myService;
    //定时打卡，每天7：59
    @Scheduled(cron = "0 59 7 * * ?")
    public void timeTask(){
        //汪
        runYun("YourCookie");
        //可以加多个
        runYun("Cookie2");

    }



    public void runYun(String User_Cookie){
        Mono<String> mono = myService.getCheckCode(User_Cookie);
        String checkCode = mono.block();
        System.out.println("checkCode值：" + checkCode);
        Mono<String> mono1 = myService.sendFormData(checkCode,User_Cookie);
        String result = mono1.block();
        System.out.println("result值：" + result);
    }

}
