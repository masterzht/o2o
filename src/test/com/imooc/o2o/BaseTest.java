package com.imooc.o2o;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 配置spring和junit整合，junit启动时加载springioc
 * Created by masterzht on 2018/4/29.
 */
/*用什么类跑单元测试*/
@RunWith(SpringJUnit4ClassRunner.class)
/*告诉junit spring配置文件位置*/
@ContextConfiguration({"classpath:spring/spring-dao-druid.xml","classpath:spring/spring-service.xml"})

public class BaseTest {
}
