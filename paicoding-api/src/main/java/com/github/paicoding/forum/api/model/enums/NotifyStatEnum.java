package com.github.paicoding.forum.api.model.enums;

import lombok.Getter;

/**
 * @author Vio
 *
 * @date 2025-11-10
 */
@Getter
public enum NotifyStatEnum {
    UNREAD(0, "未读"),
    READ(1, "已读");


    private int stat;
    private String msg;

    NotifyStatEnum(int type, String msg) {
        this.stat = type;
        this.msg = msg;
    }
}
