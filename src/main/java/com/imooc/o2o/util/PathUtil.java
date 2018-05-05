package com.imooc.o2o.util;

/**
 * 本地路径保存相关的工具类
 * Created by masterzht on 2018/5/3.
 */
public class PathUtil {
    private static String seperator=System.getProperty("file.separator");


    /**
     * 获取图片保存的基本路径
     * @return
     */
    public static String getImgBasePath(){
        /*获取当前的系统名称*/
        String os= System.getProperty("os.name");
        String basePath="";
        /*设置文件保存位置，windows服务器在哪里linux在哪里*/
        if (os.toLowerCase().startsWith("win")){
            basePath="E:/zht/img";
        }else{
            basePath="/home/zht/img/";
        }
        /*修改/，winddows是\,linux是/*/
        basePath=basePath.replace("/",seperator);
        System.out.println(os);
        return basePath;
    }


    /**
     * 获取商店图片保存的具体路径
     * @param shopId 通过shopId区别保存的位置
     * @return
     */
    public static String  getShopImagePath(long shopId){
        String imagepath="/upload/item/shop/"+shopId+"/";
        /*修改分隔符*/
        return imagepath.replace("/",seperator);
    }



}
