package com.putileaf.xuexit.entity;

import lombok.Data;

import java.util.List;

@Data
public class Notices {
    private int lastPage;
    private String lastGetId;
    private List<AInbox> list;
}
