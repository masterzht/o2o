package com.imooc.o2o.dao;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.imooc.o2o.entity.Test;

public interface TestDao {

    int insert(@Param("pojo") Test pojo);

    int insertList(@Param("pojos") List< Test> pojo);

    List<Test> select(@Param("pojo") Test pojo);

    int update(@Param("pojo") Test pojo);

}
