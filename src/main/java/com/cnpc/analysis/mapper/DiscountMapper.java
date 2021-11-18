package com.cnpc.analysis.mapper;

import com.cnpc.analysis.bean.BillBean;
import com.cnpc.analysis.bean.DiscountBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ClassName: DiscountMapper
 * Description:
 * date: 2021/11/18 14:40
 *
 * @author guoweizhou
 * @since JDK 1.8
 */

@Repository
public interface DiscountMapper {

    List<DiscountBean> selectDiscountByMaterial(@Param("material") String material);

}
