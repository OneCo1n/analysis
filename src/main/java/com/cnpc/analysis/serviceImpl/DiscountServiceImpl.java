package com.cnpc.analysis.serviceImpl;

import com.cnpc.analysis.bean.DiscountBean;
import com.cnpc.analysis.mapper.DiscountMapper;
import com.cnpc.analysis.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: DiscountServiceImpl
 * Description:
 * date: 2021/11/18 14:52
 *
 * @author guoweizhou
 * @since JDK 1.8
 */

@Service
public class DiscountServiceImpl implements DiscountService {

    @Autowired
    private DiscountMapper discountMapper;


    @Override
    public List<DiscountBean> getDiscountByMaterial(String material) {
        return discountMapper.selectDiscountByMaterial(material);
    }
}
