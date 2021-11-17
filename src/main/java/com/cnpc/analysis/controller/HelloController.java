package com.cnpc.analysis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName: HelloController
 * Description:
 * date: 2021/11/17 16:17
 *
 * @author guoweizhou
 * @since JDK 1.8
 */

@Controller
@ResponseBody
public class HelloController {
    @RequestMapping("/index")
    public String sayHello() {

        return "index";
    }
}
