package com.imooc.o2o.enums;

/**
 * Created by masterzht on 2018/5/5.
 */
public enum ShopStateEnum {
    CHECK(0,"审核中"),OFFLINE(-1,"非法店铺"),
    SUCCESS(1,"操作成功"),PASS(2,"通过认证"),
    INNER_ERROR(-1001,"内部系统错误"),
    NULL_SHOPID(-1002,"shopId为空");


    /*
    * 只要get不需要set，因为不需要外部更改*/
    public int getState() {
        return state;
    }



    public String getStateInfo() {
        return stateInfo;
    }



    private int state;
    private String stateInfo;

    /**
     * 为上面设置私有，因为不希望外面修改哪些check，offline，只能内部修改
     * @param state
     * @param stateInfo
     */
    private ShopStateEnum(int state,String stateInfo){
        this.state=state;
        this.stateInfo=stateInfo;
    }


    /*
    * 依据传入的state返回相应的enum值
    * */

    public static ShopStateEnum stateOf(int state){
        for (ShopStateEnum stateEnum:values()){
            if (stateEnum.getState()==state){
                return stateEnum;
            }
        }
        return null;
    }
}
