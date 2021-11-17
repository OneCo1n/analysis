package com.cnpc.analysis;

import com.cnpc.analysis.bean.UserBean;
import com.cnpc.analysis.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AnalysisApplicationTests {

    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
        UserBean userBean = userService.loginIn("aa","aa");
        System.out.println("该用户ID为：");
        System.out.println(userBean.getId());
    }

}
