package com.putileaf.xuexit;

import com.putileaf.xuexit.service.TimeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class XueXiTApplicationTests {
    @Autowired private TimeService timeService;
    @Test
    void contextLoads() {
        timeService.time0801();

    }

}
