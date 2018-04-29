package com.imooc.o2o.dao;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by masterzht on 2018/4/29.
 */

public class AreaDaoTest extends BaseTest {
    /*自动注入引入areadao*/
    @Autowired
    private AreaDao areaDao;



    @Test
    public void testQueryArea(){
        List<Area> areaList=areaDao.queayArea();
        assertEquals(2,areaList.size());
        System.out.print("啊啊啊啊啊啊啊"+areaList.get(1).getAreaName());

    }

}