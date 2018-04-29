package com.imooc.o2o.entity.product;

import java.util.Date;

/**
 * Created by masterzht on 2018/4/29.
 */
public class ProductCategory {
    private Long productCategoryId;

    /**
     * 这里用的是shopid而不是引用shop类，因为我们只需要shop的id，不需要这个shop类里面其他的信息
     */
    private Long shopId;
    private String productCategoryName;

    private Integer priority;
    private Date createTime;

    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
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
}
