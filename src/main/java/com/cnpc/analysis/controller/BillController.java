package com.cnpc.analysis.controller;

import com.cnpc.analysis.bean.BillBean;
import com.cnpc.analysis.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * ClassName: BillController
 * Description:
 * date: 2021/11/18 11:00
 *
 * @author guoweizhou
 * @since JDK 1.8
 */

@Controller
public class BillController {

    @Autowired
    private BillService billService;


    /**
     *
     * @return 向前端返回bill界面 bill.html
     */
    @RequestMapping("/bill")
    public String getBill() {
        return "bill";
    }



    @RequestMapping("/bill/getBill")
    @ResponseBody
    public List<BillBean> showBill(String material) {

        List<BillBean> billBeanList = billService.getBillByMaterial(material);

        if (billBeanList.size() != 0 ) {
            return billBeanList;
        } else {
            System.out.println("no bills");
            return null;
        }

    }

}
