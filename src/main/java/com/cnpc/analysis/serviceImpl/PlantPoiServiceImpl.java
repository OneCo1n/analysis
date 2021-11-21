package com.cnpc.analysis.serviceImpl;

import com.cnpc.analysis.bean.PlantPoiBean;
import com.cnpc.analysis.mapper.PlantPoiMapper;
import com.cnpc.analysis.service.PlantPoiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: PlantPoiServiceImpl
 * Description:
 * date: 2021/11/19 14:45
 *
 * @author guoweizhou
 * @since JDK 1.8
 */
@Service
public class PlantPoiServiceImpl implements PlantPoiService {

    @Autowired
    private PlantPoiMapper plantPoiMapper;

    @Override
    public List<PlantPoiBean> getAllPlantPoi() {
        return plantPoiMapper.queryAllPoi();
    }
}
