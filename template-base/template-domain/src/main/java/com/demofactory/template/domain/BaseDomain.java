package com.demofactory.template.domain;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class BaseDomain implements Serializable {
    private static final long serialVersionUID = -762485231489634958L;
    private Long id;
    private LocalDateTime createTime;
    private LocalDateTime modifyTime;
}
