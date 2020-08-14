package com.demofactory.template.domain.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

@Getter
public enum ValidEnum {

    VALID(1, "有效"),
    NOT_VALID(2, "无效"),
    DELETED(3, "已删除");

    ValidEnum(int code, String value) {
        this.code = code;
        this.value = value;
    }

    @EnumValue
    private final int code;
    private final String value;
}
