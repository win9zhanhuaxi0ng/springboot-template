package com.demofactory.template.controller.admin.demo;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.demofactory.template.api.DemoService;
import com.demofactory.template.domain.demo.Demo;

import com.demofactory.template.domain.enums.ValidEnum;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wy
 */
@RestController
@RequestMapping("demo")
public class DemoController {

    // 优先级高于配置文件中的 dubbo.consumer.check
    @DubboReference(check = false)
    private DemoService demoService;

    @GetMapping("test")
    public String test() {
        Demo demo = new Demo();
        int result = demoService.testInsert(demo);
        System.out.println("result" + result);
        return "result：------------" + result;
    }

    @GetMapping("test1")
    public String test1() {
        List<Demo> demoList = demoService.testConditionalQuery();
        System.out.println(demoList.size());
        return "result：------------" + demoList.size();
    }

    @GetMapping("test2")
    public String test2() {
        List<Demo> demoList = demoService.testSQL();
        System.out.println(demoList.size());
        return "result：------------" + demoList.size();
    }

    /**
     * 测试RPC调用（失败，mybatis-plus不支持而且不建议rpc调用传QueryWrapper）
     * @return
     */
    @GetMapping("test3")
    public String test3() {
        QueryWrapper<Demo> q = new QueryWrapper<>();
        q.eq("status", ValidEnum.DELETED.getCode());
        List<Demo> list = demoService.list(q);
        return "result：------------" + list.size();
    }

}
