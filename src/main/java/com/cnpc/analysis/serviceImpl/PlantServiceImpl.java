package com.cnpc.analysis.serviceImpl;

import com.cnpc.analysis.bean.PlantBean;
import com.cnpc.analysis.mapper.PlantMapper;
import com.cnpc.analysis.service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: PlantServiceImpl
 * Description:
 * date: 2021/11/18 17:29
 *
 * @author guoweizhou
 * @since JDK 1.8
 */

@Service
public class PlantServiceImpl implements PlantService {

    @Autowired
    private PlantMapper plantMapper;

    @Override
    public List<PlantBean> getAllPlant() {
        return plantMapper.queryAllPlant();
    }
}
