package com.demofactory.template.api;

import com.baomidou.mybatisplus.extension.service.IService;
import com.demofactory.template.domain.demo.Demo;

import java.util.List;

public interface DemoService extends IService<Demo> {

    /**
     * 测试mybatis-plus的默认插入和数据库转换枚举类
     * @param demo
     * @return
     */
    int testInsert(Demo demo);

    /**
     * 测试带条件的查询
     * @return
     */
    List<Demo> testConditionalQuery();

    /**
     * 测试mapper文件里的自定义sql
     * @return
     */
    List<Demo> testSQL();
}
