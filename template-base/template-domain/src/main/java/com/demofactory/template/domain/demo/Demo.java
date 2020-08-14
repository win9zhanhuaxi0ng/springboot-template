package com.demofactory.template.domain.demo;

import com.baomidou.mybatisplus.annotation.*;
import com.demofactory.template.domain.BaseDomain;
import com.demofactory.template.domain.enums.ValidEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "demo")
public class Demo extends BaseDomain {

    private String name;

    @EnumValue
    private ValidEnum status;
}
