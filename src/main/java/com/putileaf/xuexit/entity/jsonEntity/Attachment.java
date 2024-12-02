package com.putileaf.xuexit.entity.jsonEntity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Attachment {
    private int attachmentType;
    @JsonProperty("att_web")
    private AttWeb att_web;
}
