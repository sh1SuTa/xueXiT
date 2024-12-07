package com.putileaf.xuexit.service;

import com.putileaf.xuexit.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class TimeService {
    @Autowired private MyService myService;
    @Scheduled(cron = "0 50 9 * * ?")
    public void timeTask(){
        Mono<String> mono = myService.getCheckCode();
        String checkCode = mono.block();
        System.out.println("checkCode值：" + checkCode);
        Mono<String> mono1 = myService.sendFormData(checkCode);
        String result = mono1.block();
        System.out.println("result值：" + result);
    }
}
