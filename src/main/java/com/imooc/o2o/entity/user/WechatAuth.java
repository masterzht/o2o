package com.imooc.o2o.entity.user;

import com.imooc.o2o.entity.user.PersonInfo;

import java.util.Date;

/**
 * Created by masterzht on 2018/4/29.
 */
public class WechatAuth {
    private Long wechatAuthId;
    private String openId;
    private Date createTime;
    /**
     * 引入用户实体类
     */
    private PersonInfo personInfo;

    public Long getWechatAuthId() {
        return wechatAuthId;
    }

    public void setWechatAuthId(Long wechatAuthId) {
        this.wechatAuthId = wechatAuthId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }
}
