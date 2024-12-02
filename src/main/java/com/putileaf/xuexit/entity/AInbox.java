package com.putileaf.xuexit.entity;

import lombok.Data;

import java.util.List;

@Data
public class AInbox {
    private String attachment;
    private int collect;
    private String completeTime;
    private String content;
    private int count_all;
    private int count_read;
    private int createrId;
    private String createrName;
    private int createrPuid;
    private ExtendParam extendParam;
    private int foldId;
    private String idCode;
    private long insertTime;
    private int isRtf;
    private int isread;
    private String logo;
    private int personStatus;
    private List<ReceiverArray> receiverArray;
    private int recycle;
    private int redDot;
    private int reqSendParams;
    private String rtf_content;
    private String sendDuration;
    private int sendTag;
    private String sendTime;
    private int send_sign;
    private int sessionNum;
    private int source;
    private int sourceType;
    private int status;
    private String tag;
    private String title;
    private List<String> toNames;
    private String toclazzs;
    private int top;//共有
    private String users; //健康日报
    private String uuid; //共有
}
