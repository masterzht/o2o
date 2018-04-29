package com.imooc.o2o.dao;

import com.imooc.o2o.entity.Area;

import java.util.List;

/**
 * Created by masterzht on 2018/4/29.
 */
public interface AreaDao {

    /**
     * 列出区域列表
     * @return areaList
     */
    List<Area> queayArea() ;
}
