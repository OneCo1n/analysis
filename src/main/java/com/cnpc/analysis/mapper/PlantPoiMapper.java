package com.cnpc.analysis.mapper;

import com.cnpc.analysis.bean.PlantPoiBean;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ClassName: PlantPOIMapper
 * Description:
 * date: 2021/11/19 14:40
 *
 * @author guoweizhou
 * @since JDK 1.8
 */

@Repository
public interface PlantPoiMapper {

    public List<PlantPoiBean> queryAllPoi();
}
