package com.cnpc.analysis.mapper;

import com.cnpc.analysis.bean.UserBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * ClassName: UserMapper
 * Description:
 * date: 2021/11/17 16:37
 *
 * @author guoweizhou
 * @since JDK 1.8
 */
@Repository
public interface UserMapper {

    UserBean getInfo(@Param("name") String name,@Param("password") String password);

}