package com.netease.model.team;

import com.common.util.IGlossary;

/**
 * 谁可以邀请他人入群
 */
public enum InvitemodeEnum implements IGlossary {
    ADMIN("管理员(默认)", 0),
    EVERYONE("所有人", 1);

    private String name;
    private Integer value;

    InvitemodeEnum(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
