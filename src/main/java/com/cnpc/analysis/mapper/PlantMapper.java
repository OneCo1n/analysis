package com.cnpc.analysis.mapper;

import com.cnpc.analysis.bean.DiscountBean;
import com.cnpc.analysis.bean.PlantBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ClassName: PlantMapper
 * Description:
 * date: 2021/11/18 17:15
 *
 * @author guoweizhou
 * @since JDK 1.8
 */

@Repository
public interface PlantMapper {


    // 查询所有油站信息、进站人数等
    List<PlantBean> queryAllPlant();
}
