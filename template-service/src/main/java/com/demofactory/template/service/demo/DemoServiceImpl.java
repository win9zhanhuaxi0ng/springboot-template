package com.demofactory.template.service.demo;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demofactory.template.api.demo.DemoService;
import com.demofactory.template.dao.demo.DemoDao;

import com.demofactory.template.domain.demo.Demo;
import com.demofactory.template.domain.enums.ValidEnum;
import org.apache.dubbo.config.annotation.Service;


import javax.annotation.Resource;
import java.util.List;

/**
 * @author wy
 */
@Service
public class DemoServiceImpl extends ServiceImpl<DemoDao, Demo> implements DemoService {

    @Resource
    private DemoDao demoDao;

    @Override
    public int testInsert(Demo demo) {
        demo.setName("wy");
        demo.setStatus(ValidEnum.VALID);
        return demoDao.insert(demo);
    }

    @Override
    public List<Demo> testConditionalQuery() {
        QueryWrapper<Demo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("status",ValidEnum.DELETED.getCode());
        return demoDao.selectList(queryWrapper);
    }

    @Override
    public List<Demo> testSQL() {
        return demoDao.test2();
    }
}
