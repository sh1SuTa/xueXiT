package com.putileaf.xuexit;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.putileaf.xuexit.entity.AInbox;
import com.putileaf.xuexit.entity.Inbox;
import com.putileaf.xuexit.entity.jsonEntity.Attachment;
import com.putileaf.xuexit.entity.jsonEntity.Notice;
import com.putileaf.xuexit.service.TimeService;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
@Slf4j
@SpringBootApplication
@EnableScheduling
public class XueXiTApplication {
    @Autowired private TimeService timeService;
    public static void main(String[] args) throws JsonProcessingException {
        SpringApplication.run(XueXiTApplication.class, args);

        log.info("项目启动成功");
        WebClient webClient1 = WebClient.builder()
                .baseUrl("https://notice.chaoxing.com")
                .build();









        //String attachment = result.getNotices().getList().get(1).getAttachment();
//        System.out.println("attachment为："+attachment);
//        ObjectMapper objectMapper = new ObjectMapper();
//        try {
//            // 解析为 List
//            List<Attachment> objects = objectMapper.readValue(attachment, new TypeReference<List<Attachment>>(){});
//
//            // 取出第一个元素
//            Attachment firstObject = objects.get(0);
//
//            // 输出结果
//            System.out.println(firstObject.getAttachmentType());
//            System.out.println("要访问的url："+firstObject.getAtt_web().getUrl());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
