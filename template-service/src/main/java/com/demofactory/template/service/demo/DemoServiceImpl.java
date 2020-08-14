package com.demofactory.template.service.demo;


import com.demofactory.template.api.DemoService;
import com.demofactory.template.dao.DemoDao;

import com.demofactory.template.domain.demo.Demo;
import org.apache.dubbo.config.annotation.DubboService;


import javax.annotation.Resource;

/**
 * @author wy
 */
@DubboService
public class DemoServiceImpl implements DemoService {

    @Resource
    private DemoDao demoDao;

    @Override
    public int insert(Demo demo) {
        demoDao.insert(demo);
        return 1;
    }
}
