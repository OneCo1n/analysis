package com.cnpc.analysis.controller;

import com.cnpc.analysis.bean.PlantPoiBean;
import com.cnpc.analysis.service.PlantPoiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * ClassName: PlantPoiController
 * Description:
 * date: 2021/11/19 14:46
 *
 * @author guoweizhou
 * @since JDK 1.8
 */

@Controller
public class PlantPoiController {

    @Autowired
    private PlantPoiService plantPoiService;

    @RequestMapping("/poi")
    public String getPlantPoi() {

        return "poi";
    }


    @RequestMapping("/poi/getPoi")
    @ResponseBody
    public List<PlantPoiBean> showPlantPoi() {

        List<PlantPoiBean> plantPoiBeans = plantPoiService.getAllPlantPoi();

        if (plantPoiBeans.size() != 0) {
            return plantPoiBeans;
        }

        return plantPoiBeans;
    }

}
