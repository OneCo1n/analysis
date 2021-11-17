package com.cnpc.analysis.service;

import com.cnpc.analysis.bean.UserBean;
import org.springframework.scheduling.support.SimpleTriggerContext;

/**
 * ClassName: UserService
 * Description:
 * date: 2021/11/17 16:42
 *
 * @author guoweizhou
 * @since JDK 1.8
 */
public interface UserService {

    UserBean loginIn(String name, String password);
}
