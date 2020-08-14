package com.demofactory.template.controller.admin.demo;


import com.demofactory.template.api.DemoService;
import com.demofactory.template.domain.demo.Demo;

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

    // check = false 不检查服务到底有没有，没有不报错
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
}
