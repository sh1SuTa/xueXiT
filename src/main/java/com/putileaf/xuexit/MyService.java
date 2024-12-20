package com.putileaf.xuexit;

import com.putileaf.xuexit.entity.Inbox;
import org.springframework.context.annotation.Bean;
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
import java.util.List;
import java.util.Map;
@Service
public class MyService {


    //private final String User_Cookie = "lv=4; fid=39037; _uid=243384068; uf=94ffe74515793f36d488096901cdbd6364f990704c6e96de590dba88a500cf731ff8b6f8377690bb859b88ee41442c35748a002894d7f44e88b83130e7eb470447967f06c3529f39c04fd8193a78cec6d3d56c5b6a42238d8160bc962e4f9f7651455a92467ce8e3aa2ebad65cd196bb; _d=1732935234496; UID=243384068; vc=C941131FB5ECBDFF0CB8F796FEDCB3F2; vc2=E60184F2E70498BA528557FB06661F4A; vc3=D%2F54ZarxT4VI76GobnQOJ%2FXti6YZGW%2F1l%2Bqf1a0bYwThfvSp6cRxDqfNrWIEldhQszaZZWkYxY7OZhVN2DtkKEDo4ji3Qg70XJGx6v96IEJzLpjhEpX1TcNhfhqMRCwbjNpteT9DU5kRZB7PDwZWalbEen08BxtwCEiYoVKWo6s%3D76a29728adc2c4167452d28fa9b75c37; cx_p_token=10ab27ed16bc97ebdc29142d8e6db485; p_auth_token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOiIyNDMzODQwNjgiLCJsb2dpblRpbWUiOjE3MzI5MzUyMzQ0OTgsImV4cCI6MTczMzU0MDAzNH0.7-KN1jJj5P4muOJB9QTIB7uI96mdibwbbkvWWh2bNZo; xxtenc=5616ace91ecb229d53b09d89adcee84c; DSSTASH_LOG=C_38-UN_3626-US_243384068-T_1732935234498; session_oa=YmI1MDRmNTMtMjgxMC00NWViLTgxMjQtMDkyMDNiZmE5ODli; route=0e7a7ba0b4a26dbaeb04f5ae63e030b8; oa_deptid=39037; oa_uid=243384068; oa_name=%E6%B1%AA%E9%87%91%E7%94%B0; oa_enc=bd88f43908c678667db34da45c8894de";
    //private final String User_Cookie = "你的Cookie";



    WebClient webClient = WebClient.builder()
            .baseUrl("https://office.chaoxing.com")
            .build();

    public Mono<Inbox> getInbox(String User_Cookie) {

        MultiValueMap<String, String> formData = new LinkedMultiValueMap<>();
        formData.add("type", "2");
        formData.add("year", "2024");
        formData.add("queryFolderNoticePrevYear", "0");
        return webClient.post()
                .uri("/pc/notice/getNoticeList")
                .header("Cookie", User_Cookie)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_FORM_URLENCODED_VALUE)
                .bodyValue(formData)
                .retrieve()
                .bodyToMono(Inbox.class);
    }
    public Mono<String> sendFormData(String checkCode,String User_Cookie) {
        // 创建表单数据
        MultiValueMap<String, String> formData = new LinkedMultiValueMap<>();
        formData.add("formId", "819284");  // 添加表单字段
        formData.add("version", "1");
        formData.add("formIdValueData", "{\"63\":{\"compt\":\"editinput\",\"groupValues\":[{\"values\":[[]],\"isShow\":false}],\"inDetailGroupIndex\":-1,\"id\":63,\"fromDetail\":false,\"hasAuthority\":true},\"74\":{\"compt\":\"radiobutton\",\"groupValues\":[{\"values\":[[{\"val\":\"健康\",\"isOther\":false,\"color\":\"#2DBE62\",\"score\":\"\"}]],\"isShow\":true}],\"inDetailGroupIndex\":-1,\"id\":74,\"fromDetail\":false,\"hasAuthority\":true},\"75\":{\"compt\":\"location\",\"groupValues\":[{\"values\":[[{\"lat\":31.130105004243,\"lng\":106.65690751858,\"address\":\"别发你那破比每日打卡\"}]],\"isShow\":true}],\"inDetailGroupIndex\":-1,\"id\":75,\"fromDetail\":false,\"hasAuthority\":true}}");
        formData.add("t", "1");
        formData.add("enc", "e841476e440b01fb736891518a4186d0");
        formData.add("uuid", "1db440dc8d25494bac3dd14defcd47b8");
        formData.add("checkCode", checkCode);
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
