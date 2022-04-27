package com.lishijiee.mapper;

import com.lishijiee.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User getUser(User user);
}
