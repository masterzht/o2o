package com.imooc.o2o.web.superadmin;

import com.imooc.o2o.entity.Area;
import com.imooc.o2o.service.IAreaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by masterzht on 2018/4/30.
 */
@Controller
@RequestMapping("/superadmin")
public class AreaController {

    Logger logger= LoggerFactory.getLogger(AreaController.class);
    @Autowired
    private IAreaService iAreaService;

    @RequestMapping(value = "/listareas", method = RequestMethod.GET)
    /*这个标签可以自动把map转json*/
    @ResponseBody
    private Map<String, Object> listAreas() {
        logger.info("===start===");
        long startTime=System.currentTimeMillis();
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<Area> list = new ArrayList<Area>();
        try {
            list = iAreaService.getAreaList();
            modelMap.put("rows", list);
            modelMap.put("total", list.size());

        } catch (Exception e) {
            e.printStackTrace();
            /*如果报错，返回json是错误，打印错误日志*/
            modelMap.put("success", false);
            modelMap.put("errMsg", e.toString());
        }
        logger.error("test error!");
        long endTime=System.currentTimeMillis();
        /*debug调优，看看运行时间*/
        logger.debug("costTime:[{}ms]",endTime-startTime);
        return modelMap;
    }
}
