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
    public Mono<String> sendFormData(String checkCode,String User_Cookie,String formIdValueData) {
        // 创建表单数据
        MultiValueMap<String, String> formData = new LinkedMultiValueMap<>();
        formData.add("formId", "819284");  // 添加表单字段
        formData.add("version", "1");
        //formData.add("formIdValueData", "{\"63\":{\"compt\":\"editinput\",\"groupValues\":[{\"values\":[[]],\"isShow\":false}],\"inDetailGroupIndex\":-1,\"id\":63,\"fromDetail\":false,\"hasAuthority\":true},\"74\":{\"compt\":\"radiobutton\",\"groupValues\":[{\"values\":[[{\"val\":\"健康\",\"isOther\":false,\"color\":\"#2DBE62\",\"score\":\"\"}]],\"isShow\":true}],\"inDetailGroupIndex\":-1,\"id\":74,\"fromDetail\":false,\"hasAuthority\":true},\"75\":{\"compt\":\"location\",\"groupValues\":[{\"values\":[[{\"lat\":31.130105004243,\"lng\":106.65690751858,\"address\":\"武汉晴川大学\"}]],\"isShow\":true}],\"inDetailGroupIndex\":-1,\"id\":75,\"fromDetail\":false,\"hasAuthority\":true}}");
        formData.add("formIdValueData",formIdValueData);
        formData.add("t", "1");

        formData.add("enc", "e841476e440b01fb736891518a4186d0");

//        formData.add("uuid", "da7da7d069c749af9097fb67bc909f2f");//云
        formData.add("uuid", "71738a58723d4dc087e30d409553e5fb");

        formData.add("checkCode", checkCode);

        formData.add("submitVersion", "1739760175000");//相同

        //formData.add("stateFid", "39037"); //云
        formData.add("stateFid", "142415");

        // 发送 POST 请求，Content-Type 为 application/x-www-form-urlencoded
        return this.webClient.post()
                .uri("/data/apps/forms/fore/user/save")
                .header("Cookie", User_Cookie).header("Sec-ch-ua-platform", "Android")
                .header("Origin", "https://office.chaoxing.com")
                .header("Host", "office.chaoxing.com")
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

//fid=39037; _uid=243384068; UID=243384068; xxtenc=5616ace91ecb229d53b09d89adcee84c; createSiteSource=num8; wfwEnc=54B973A6DBEB258A5A453B2A3D6CC026; vc2=4633035A8674D93358D5500E2B52D2C3; tl=1; uf=94ffe74515793f36d488096901cdbd6364f990704c6e96de590dba88a500cf73bbe0fa7ed8727a6d62e243d5ed1292d2748a002894d7f44e88b83130e7eb470447967f06c3529f39c04fd8193a78cec6260b22ede7461b6b98156c723ea5824ddc9b228978f8c2f7aa2ebad65cd196bb; _d=1741188242116; vc3=YHV13VzjTe2akYiVEUI8KB55TPus7k2g%2BMDJXJON29%2FAQd6%2BTaFYlJby%2FsIlkDlNo6MV47jv4n0owUKGkRM7GA4EwcTXXpIzXBZk%2FdSl5%2BnMr%2BoZRiCvAdTqn0iHJsUWR9IhTpX5EFX6ULqzCAywAxjeUfyzZnLIOvBEUvie4Jc%3Dea8340ab09bcfb805846361f5250838f; cx_p_token=33c50ee66875389d3960091afd18d619; p_auth_token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOiIyNDMzODQwNjgiLCJsb2dpblRpbWUiOjE3NDExODgyNDIxMTgsImV4cCI6MTc0MTc5MzA0Mn0.X0RxaGJiVRRnuCRJx_U6_avfiCKXCS8F_Wf3EP3sij4; DSSTASH_LOG=C_38-UN_3626-US_243384068-T_1741188242118; spaceFid=39037; spaceRoleId=3; session_oa=ZDczYWNkNzQtZmJiMC00YTVhLWE5NTItZGFlMWU5YTVhZWUw; route=573e9e76ad65823e6abdc6493dfb949c; oa_deptid=39037; oa_uid=243384068; oa_name=%E6%B1%AA%E9%87%91%E7%94%B0; oa_enc=bd88f43908c678667db34da45c8894de