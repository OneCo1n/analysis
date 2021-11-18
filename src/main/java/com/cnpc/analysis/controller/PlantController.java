package com.cnpc.analysis.controller;

import com.cnpc.analysis.bean.PlantBean;
import com.cnpc.analysis.service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: PlantController
 * Description:
 * date: 2021/11/18 17:30
 *
 * @author guoweizhou
 * @since JDK 1.8
 */
@Controller
public class PlantController {

    @Autowired
    private PlantService plantService;


    @RequestMapping("/plant")
    public String getPlant() {
        return "plant";
    }

    @RequestMapping("/plant/getAllPlant")
    @ResponseBody
    public List<PlantBean> showAllPlant() {
        System.out.println("已跳转");

        List<PlantBean> plantBeans = plantService.getAllPlant();

        if (plantBeans.size() != 0 ) {
            return plantBeans;
        }
        return null;
    }

}
