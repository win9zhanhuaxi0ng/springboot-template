package com.demofactory.template.dao.demo;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demofactory.template.domain.demo.Demo;

import java.util.List;

public interface DemoDao extends BaseMapper<Demo> {
    List<Demo> test2();
}
