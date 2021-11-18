package com.cnpc.analysis.service;

import com.cnpc.analysis.bean.DiscountBean;
import java.util.List;

/**
 * ClassName: DiscountService
 * Description:
 * date: 2021/11/18 14:51
 *
 * @author guoweizhou
 * @since JDK 1.8
 */
public interface DiscountService {

    List<DiscountBean> getDiscountByMaterial(String material);

}
