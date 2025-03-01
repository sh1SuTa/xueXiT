package com.putileaf.xuexit.service;

import com.putileaf.xuexit.entity.Inbox;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
@Service
public class MyService {



    //private final String User_Cookie = "你的Cookie";



    WebClient webClient = WebClient.builder()
            .baseUrl("https://office.chaoxing.com")
            .build();

//    public Mono<Inbox> getInbox(String User_Cookie) {
//
//        MultiValueMap<String, String> formData = new LinkedMultiValueMap<>();
//        formData.add("type", "2");
//        formData.add("year", "2024");
//        formData.add("queryFolderNoticePrevYear", "0");
//        return webClient.post()
//                .uri("/pc/notice/getNoticeList")
//                .header("Cookie", User_Cookie)
//                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_FORM_URLENCODED_VALUE)
//                .bodyValue(formData)
//                .retrieve()
//                .bodyToMono(Inbox.class);
//    }
    public Mono<String> sendFormData(String checkCode,String User_Cookie) {
        // 创建表单数据
        MultiValueMap<String, String> formData = new LinkedMultiValueMap<>();
        formData.add("formId", "819284");  // 添加表单字段
        formData.add("version", "1");
        formData.add("formIdValueData", "{\"63\":{\"compt\":\"editinput\",\"groupValues\":[{\"values\":[[]],\"isShow\":false}],\"inDetailGroupIndex\":-1,\"id\":63,\"fromDetail\":false,\"hasAuthority\":true},\"74\":{\"compt\":\"radiobutton\",\"groupValues\":[{\"values\":[[{\"val\":\"健康\",\"isOther\":false,\"color\":\"#2DBE62\",\"score\":\"\"}]],\"isShow\":true}],\"inDetailGroupIndex\":-1,\"id\":74,\"fromDetail\":false,\"hasAuthority\":true},\"75\":{\"compt\":\"location\",\"groupValues\":[{\"values\":[[{\"lat\":31.130105004243,\"lng\":106.65690751858,\"address\":\"武汉晴川大学\"}]],\"isShow\":true}],\"inDetailGroupIndex\":-1,\"id\":75,\"fromDetail\":false,\"hasAuthority\":true}}");
        formData.add("t", "1");
        formData.add("enc", "e841476e440b01fb736891518a4186d0");
//        formData.add("uuid", "1db440dc8d25494bac3dd14defcd47b8");
        formData.add("uuid", "e60f53c2da7f4e3f9c155c37fe6cfdb3");
        formData.add("checkCode", checkCode);

        formData.add("submitVersion", "1739760175000");
        formData.add("stateFid", "39037");

        // 发送 POST 请求，Content-Type 为 application/x-www-form-urlencoded
        return this.webClient.post()
                .uri("/data/apps/forms/fore/user/save")
                .header("Cookie", User_Cookie)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_FORM_URLENCODED_VALUE)  // 设置表单提交类型
                .bodyValue(formData)  // 将表单数据作为请求体发送
                .retrieve()
                .bodyToMono(String.class);
    }

    public Mono<String> getCheckCode(String User_Cookie) {
        return this.webClient.get()
                .uri("/front/web/apps/forms/fore/apply?id=819284&enc=e841476e440b01fb736891518a4186d0&fidEnc=b06cba4a51ac2253")
                .header("Cookie", User_Cookie)
                .header("Sec-ch-ua-mobile", "?0")
                .header("Sec-ch-ua-platform", "\"Windows\"")
                .exchangeToMono(response -> {
                    if (response.statusCode().is3xxRedirection()) {
                        URI locationUri = response.headers().asHttpHeaders().getLocation();
                        try {
                            assert locationUri != null;
                            String queryParams = new URI(locationUri.toString()).getQuery();
                            Map<String, String> queryParamMap = parseQueryParams(queryParams);
                            String checkCode = queryParamMap.get("checkCode");
                            if (checkCode != null) {
                                return Mono.just(checkCode);
                            }
                        } catch (URISyntaxException e) {
                            e.printStackTrace();
                        }
                    }
                    return Mono.empty();
                });
    }
    private Map<String, String> parseQueryParams(String queryParams) {
        Map<String, String> params = new HashMap<>();
        if (queryParams != null) {
            for (String param : queryParams.split("&")) {
                String[] pair = param.split("=");
                if (pair.length == 2) {
                    String key = URLDecoder.decode(pair[0], StandardCharsets.UTF_8);
                    String value = URLDecoder.decode(pair[1], StandardCharsets.UTF_8);
                    params.put(key, value);
                }
            }
        }
        return params;
    }
}
