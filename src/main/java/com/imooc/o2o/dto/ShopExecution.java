package com.imooc.o2o.dto;

import com.imooc.o2o.entity.shop.Shop;
import com.imooc.o2o.enums.ShopStateEnum;

import java.util.List;

/**
 * Created by masterzht on 2018/5/5.
 */
public class ShopExecution {
    /**
     * 结果标识
     */
    private int state;

    /**
     * 状态表示的解释
     */
    private String stateInfo;

    /**
     * 店铺数量
     */
    private int count;

    /**
     * 操作的shop（增删改的时候用到）
     */
    private Shop shop;

    /*
    * shop列表（查询用
    * */
    private List<Shop> shopList;

    public ShopExecution(){

    }

    /*店铺操作失败的时候用的构造器*/
    public ShopExecution(ShopStateEnum stateEnum){
        this.state=stateEnum.getState();
        this.stateInfo=stateEnum.getStateInfo();
    }

    /*店铺操作成功的时候用的构造器*/
    public ShopExecution(ShopStateEnum stateEnum,Shop shop){
        this.state=stateEnum.getState();
        this.stateInfo=stateEnum.getStateInfo();
        this.shop=shop;
    }

    /*店铺操作成功的时候用的构造器*/
    public ShopExecution(ShopStateEnum stateEnum,List<Shop> shopList){
        this.state=stateEnum.getState();
        this.stateInfo=stateEnum.getStateInfo();
        this.shopList=shopList;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public List<Shop> getShopList() {
        return shopList;
    }

    public void setShopList(List<Shop> shopList) {
        this.shopList = shopList;
    }
}
