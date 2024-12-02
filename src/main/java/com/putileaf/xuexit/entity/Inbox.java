package com.putileaf.xuexit.entity;

import lombok.Data;

import java.util.List;

@Data
public class Inbox {
    private Notices notices;
    private List folders;
    private int mySendNoticeCount;
    private boolean status;
}
