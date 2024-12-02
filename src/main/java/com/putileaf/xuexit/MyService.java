package com.putileaf.xuexit;

import com.putileaf.xuexit.entity.Inbox;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class MyService {

    private final WebClient webClient;
    private final String User_Cookie = "请填写自己的cookie";

    public MyService(WebClient webClient) {
        this.webClient = webClient;
    }

    public Mono<Inbox> getInbox() {
        MultiValueMap<String, String> formData = new LinkedMultiValueMap<>();
        formData.add("type", "2");
        formData.add("year", "2024");
        formData.add("queryFolderNoticePrevYear", "0");
        return this.webClient.post()
                .uri("/pc/notice/getNoticeList")
                .header("Cookie", User_Cookie)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_FORM_URLENCODED_VALUE)
                .bodyValue(formData)
                .retrieve()
                .bodyToMono(Inbox.class);
    }
    public Mono<String> sendFormData() {
        // 创建表单数据
        MultiValueMap<String, String> formData = new LinkedMultiValueMap<>();
        formData.add("formId", "819284");  // 添加表单字段
        formData.add("version", "1");
        formData.add("formIdValueData", "{\"63\":{\"compt\":\"editinput\",\"groupValues\":[{\"values\":[[]],\"isShow\":false}],\"inDetailGroupIndex\":-1,\"id\":63,\"fromDetail\":false,\"hasAuthority\":true},\"74\":{\"compt\":\"radiobutton\",\"groupValues\":[{\"values\":[[{\"val\":\"健康\",\"isOther\":false,\"color\":\"#2DBE62\",\"score\":\"\"}]],\"isShow\":true}],\"inDetailGroupIndex\":-1,\"id\":74,\"fromDetail\":false,\"hasAuthority\":true},\"75\":{\"compt\":\"location\",\"groupValues\":[{\"values\":[[{\"lat\":31.130105004243,\"lng\":106.65690751858,\"address\":\"别发你那破比每日打卡\"}]],\"isShow\":true}],\"inDetailGroupIndex\":-1,\"id\":75,\"fromDetail\":false,\"hasAuthority\":true}}");
        formData.add("t", "1");
        formData.add("enc", "e841476e440b01fb736891518a4186d0");
        formData.add("uuid", "1db440dc8d25494bac3dd14defcd47b8");
        formData.add("checkCode", "bd30227106e74fbf9d826b711e175ea3");
        formData.add("submitVersion", "1724904540000");

        // 发送 POST 请求，Content-Type 为 application/x-www-form-urlencoded
        return this.webClient.post()
                .uri("/data/apps/forms/fore/user/save")
                .header("Cookie", User_Cookie)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_FORM_URLENCODED_VALUE)  // 设置表单提交类型
                .bodyValue(formData)  // 将表单数据作为请求体发送
                .retrieve()
                .bodyToMono(String.class);
    }
}
