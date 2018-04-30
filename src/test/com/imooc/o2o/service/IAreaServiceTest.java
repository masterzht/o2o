package com.imooc.o2o.service;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by masterzht on 2018/4/30.
 */

public class IAreaServiceTest extends BaseTest{
    @Autowired
    private IAreaService iAreaService;

    @Test
    public void getAreaList() throws Exception {
        List<Area> areaList=iAreaService.getAreaList();
        assertEquals("东莞",areaList.get(1).getAreaName());
        System.out.println("hhh哈哈哈哈哈"+areaList.get(1).getAreaName());
    }

}