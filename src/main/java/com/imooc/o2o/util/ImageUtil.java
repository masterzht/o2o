package com.imooc.o2o.util;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author masterzht
 * @date 2018/5/3
 */
public class ImageUtil {

    private static String basePath=Thread.currentThread().getContextClassLoader().getResource("").getPath();


    private static final SimpleDateFormat sDateFormat=new SimpleDateFormat("yyyyMMddHHmmss");
    private static Random r=new Random();

    /**
     * 生成随机的文件名，当前年月日小时分钟秒+五位随机数
     * @return
     */
    public static String getRandomFileName(){
        /*获取随机的五位数（10000-99999*/
        int rannum=r.nextInt(89999)+10000;
        String nowTimeStr=sDateFormat.format(new Date());
        return nowTimeStr+rannum;
    }

    /**
     * 获取输入文件流拓展名
     * 也就是获取.jpg或者.png
     * @param cFile
     * @return
     */
    public static String getFileExtension(CommonsMultipartFile cFile) {
        /*获取文件名*/
        String originalFileName=cFile.getOriginalFilename();
        return originalFileName.substring(originalFileName.lastIndexOf("."));
    }

    /**
     * 创建目标路径所涉及的目录，即/home/masterzht/xx.jpg,文件夹自动创建
     * @param targetAddr
     */
    private static void makeDirPath(String targetAddr) {
        String realFileParentPath=PathUtil.getImgBasePath()+targetAddr;
        File dirPath=new File(realFileParentPath);
        if (!dirPath.exists()){
            /*递归创建*/
            dirPath.mkdirs();
        }

    }

    /**
     * @param thumbnail   传递过来需要处理的文件，属于FIle类型
     * @param targetAddr 保存路径，这个不包括服务器基本路径，只是用于区分资源类型的相对路径
     * @return
     */
    public static String generateThumbnail(CommonsMultipartFile thumbnail,String targetAddr){
        String fileName=getRandomFileName();
        /*根据传过来的文件名字获取拓展，不过我们反正要改名存储的*/
        String extension=getFileExtension(thumbnail);
        makeDirPath(targetAddr);
        /*
        * E:/zht/img
        * 如果是上传的头像的话可能是/upload/headimg
        * hh
        * .jpg
        * */
        String relativeAddr=PathUtil.getImgBasePath()+targetAddr+fileName+extension;
        File dest=new File(relativeAddr);

        try{
            Thumbnails.of(thumbnail.getInputStream()).size(200,200)
                    .watermark(Positions.BOTTOM_RIGHT,ImageIO.read(new File(basePath+"/watermark.jpg")),0.25f)
                    .outputQuality(0.8f)
                    .toFile(dest);
        }catch (IOException e){
            e.printStackTrace();
        }

        return relativeAddr;

    }


    /**
     * 创建缩略图运行实例
     * @param args
     * @throws IOException
     */

    public static void main(String[] args) throws IOException {
        String basePath=Thread.currentThread().getContextClassLoader().getResource("").getPath();

        String webappRoot = basePath.replaceAll("classes/", "o2o/resources/img/");

        System.out.println(basePath);
        Thumbnails.of(new File("E:/140020.jpg"))
                .size(200,200)
                .watermark(Positions.BOTTOM_RIGHT,
                        /*0.25是透明度，这是水印*/
                        ImageIO.read(new File(webappRoot+"hh.jpg")),0.25f)
                /*压缩率为百分之80*/
                .outputQuality(0.8f).toFile("E:/hh.jpg");

    }


}
