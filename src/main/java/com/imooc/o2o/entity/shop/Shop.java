package com.imooc.o2o.entity.shop;

import com.imooc.o2o.entity.Area;

import java.util.Date;

/**
 * Created by masterzht on 2018/4/29.
 */
public class Shop {

    private Long shopId;

    private String shopName;
    private String shopDesc;
    /**
     * 店铺地址
     */
    private String shopAddr;
    private String phone;
    private String shopImg;

    private Integer priority;
    private Date createTime;
    private Date lastEditTime;
    /**
     * -1:不可用，0：审核中1：可用
     */
    private Integer enableStatus;

    /**
     * 超级管理员给店家的提醒
     */
    private String advice;

    /**
     * 引入的类
     */
    private Area area;
    private ShopCategory shopCategory;
    private ShopCategory parentCategory;

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopDesc() {
        return shopDesc;
    }

    public void setShopDesc(String shopDesc) {
        this.shopDesc = shopDesc;
    }

    public String getShopAddr() {
        return shopAddr;
    }

    public void setShopAddr(String shopAddr) {
        this.shopAddr = shopAddr;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getShopImg() {
        return shopImg;
    }

    public void setShopImg(String shopImg) {
        this.shopImg = shopImg;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public ShopCategory getShopCategory() {
        return shopCategory;
    }

    public void setShopCategory(ShopCategory shopCategory) {
        this.shopCategory = shopCategory;
    }

    public ShopCategory getParentCategory() {
        return parentCategory;
    }

    public void setParentCategory(ShopCategory parentCategory) {
        this.parentCategory = parentCategory;
    }
}
