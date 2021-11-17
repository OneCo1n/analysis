package com.cnpc.analysis.serviceImpl;

import com.cnpc.analysis.bean.UserBean;
import com.cnpc.analysis.mapper.UserMapper;
import com.cnpc.analysis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * ClassName: UserServiceImpl
 * Description:
 * date: 2021/11/17 16:43
 *
 * @author guoweizhou
 * @since JDK 1.8
 */

@Service
public class UserServiceImpl implements UserService {
    //将DAO注入Service层
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserBean loginIn(String name, String password) {
        return userMapper.getInfo(name, password);
    }
}

