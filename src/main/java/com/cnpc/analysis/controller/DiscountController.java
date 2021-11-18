package com.cnpc.analysis.controller;

import com.cnpc.analysis.bean.DiscountBean;
import com.cnpc.analysis.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * ClassName: DiscountController
 * Description:
 * date: 2021/11/18 14:53
 *
 * @author guoweizhou
 * @since JDK 1.8
 */

@Controller
public class DiscountController {

    @Autowired
    private DiscountService discountService;


    @RequestMapping("/discount")
    public String getDiscount() {
        return "discount";
    }

    @RequestMapping(value = "/discount/getDiscount", method = RequestMethod.POST)
    @ResponseBody
    public List<DiscountBean> showDiscount(String material) {

        List<DiscountBean> discountBeanList = discountService.getDiscountByMaterial(material);

        if (discountBeanList.size() != 0 ) {
            return discountBeanList;
        } else {
            System.out.println("no discount");
            return null;
        }

    }


}
