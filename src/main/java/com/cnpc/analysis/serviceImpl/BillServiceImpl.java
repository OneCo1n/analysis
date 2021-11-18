package com.cnpc.analysis.serviceImpl;

import com.cnpc.analysis.bean.BillBean;
import com.cnpc.analysis.mapper.BillMapper;
import com.cnpc.analysis.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: BillServiceImpl
 * Description:
 * date: 2021/11/18 10:59
 *
 * @author guoweizhou
 * @since JDK 1.8
 */

@Service
public class BillServiceImpl implements BillService {

    @Autowired
    private BillMapper billMapper;

    @Override
    public List<BillBean> getBillByMaterial(String material) {
        return billMapper.selectBillByMaterial(material);
    }
}
