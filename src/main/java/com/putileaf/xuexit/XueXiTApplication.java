package com.putileaf.xuexit;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.putileaf.xuexit.entity.AInbox;
import com.putileaf.xuexit.entity.Inbox;
import com.putileaf.xuexit.entity.jsonEntity.Attachment;
import com.putileaf.xuexit.entity.jsonEntity.Notice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@SpringBootApplication
public class XueXiTApplication {

    public static void main(String[] args) throws JsonProcessingException {
        //SpringApplication.run(XueXiTApplication.class, args);
        WebClient webClient = WebClient.builder()
                .baseUrl("https://office.chaoxing.com")
                .build();
        WebClient webClient1 = WebClient.builder()
                .baseUrl("https://notice.chaoxing.com")
                .build();

        // 手动创建 MyService 实例
        MyService myService = new MyService(webClient);
        MyService myService1 = new MyService(webClient1);

        // 阻塞直到结果返回
        String result1 = myService.sendFormData().block();
        System.out.println("返回值："+result1);
        Inbox result = myService1.getInbox().block();

        String attachment = result.getNotices().getList().get(1).getAttachment();
        System.out.println("attachment为："+attachment);
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // 解析为 List
            List<Attachment> objects = objectMapper.readValue(attachment, new TypeReference<List<Attachment>>(){});

            // 取出第一个元素
            Attachment firstObject = objects.get(0);

            // 输出结果
            System.out.println(firstObject.getAttachmentType());
            System.out.println("要访问的url："+firstObject.getAtt_web().getUrl());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
