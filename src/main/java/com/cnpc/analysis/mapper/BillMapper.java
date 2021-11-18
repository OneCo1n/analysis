package com.cnpc.analysis.mapper;

import com.cnpc.analysis.bean.BillBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ClassName: BillMapper
 * Description:
 * date: 2021/11/18 10:32
 *
 * @author guoweizhou
 * @since JDK 1.8
 */

@Repository
public interface BillMapper {

    List<BillBean> selectBillByMaterial(@Param("material") String material);
}
