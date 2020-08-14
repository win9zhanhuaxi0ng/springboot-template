package com.demofactory.template.domain.demo;

import com.demofactory.template.domain.BaseDomain;
import lombok.Data;
import lombok.EqualsAndHashCode;
@Data
@EqualsAndHashCode(callSuper = true)
public class Demo extends BaseDomain {

    private String name;
}
