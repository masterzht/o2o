package com.imooc.o2o.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.imooc.o2o.entity.Test;
import com.imooc.o2o.dao.TestDao;

@Service
public class TestService {

    @Resource
    private TestDao testDao;

    public int insert(Test pojo){
        return testDao.insert(pojo);
    }

    public int insertList(List< Test> pojos){
        return testDao.insertList(pojos);
    }

    public List<Test> select(Test pojo){
        return testDao.select(pojo);
    }

    public int update(Test pojo){
        return testDao.update(pojo);
    }

}
