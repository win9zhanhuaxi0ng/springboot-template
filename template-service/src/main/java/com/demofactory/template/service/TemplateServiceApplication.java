package com.demofactory.template.service;


import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan({"com.baomidou.mybatisplus.samples.quickstart.mapper", "com.demofactory.template.dao"})
public class TemplateServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TemplateServiceApplication.class, args);
        // 序列化枚举值为数据库存储值 https://baomidou.com/guide/enum.html#jackson mybatis-plus使用
        FastJsonConfig config = new FastJsonConfig();
        config.setSerializerFeatures(SerializerFeature.WriteEnumUsingToString);
    }

}
