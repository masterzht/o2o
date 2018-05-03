package com.imooc.o2o.dao;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.entity.Area;
import com.imooc.o2o.entity.shop.Shop;
import com.imooc.o2o.entity.shop.ShopCategory;
import com.imooc.o2o.entity.user.PersonInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by masterzht on 2018/5/2.
 */
public class ShopDaoTest extends BaseTest {

    @Autowired
    private ShopDao shopDao;
    @Test
    public void insertShop() throws Exception {

        Shop shop=new Shop();




        PersonInfo owner=new PersonInfo();
        Area area=new Area();
        ShopCategory shopCategory=new ShopCategory();
        owner.setUserId(1L);
        area.setAreaId(2);
        shopCategory.setShopCategoryId(1L);
        shop.setOwner(owner);
        shop.setArea(area);
        shop.setShopCategory(shopCategory);

        shop.setShopName("测试店铺的名字");
        shop.setShopDesc("test");
        shop.setShopAddr("test");
        shop.setPhone("132142344324");
        shop.setShopImg("img");
        shop.setCreateTime(new Date());
        shop.setEnableStatus(1);
        shop.setAdvice("审核中");
        int effectedNum=shopDao.insertShop(shop);
        assertEquals(1,effectedNum);
    }

    @Test
    public void updateShop()  throws Exception{
        Shop shop=new Shop();



        /*定位到了要修改的shop*/
        shop.setShopId(2L);

/*在这里改*/
        shop.setShopName("改名字");

        /*改*/
        int effectedNum=shopDao.updateShop(shop);
        assertEquals(1,effectedNum);
    }
}