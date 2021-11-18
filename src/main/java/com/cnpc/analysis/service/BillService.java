package com.cnpc.analysis.service;

import com.cnpc.analysis.bean.BillBean;

import java.util.List;

/**
 * ClassName: BillService
 * Description:
 * date: 2021/11/18 10:55
 *
 * @author guoweizhou
 * @since JDK 1.8
 */


public interface BillService {

    List<BillBean> getBillByMaterial(String material);

}
