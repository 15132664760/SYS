package com.example.profile.Mapper;

import com.example.profile.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
public int addUser(User user);//插入数据，返回处理的行数
    public User findByUserId(int userid);//根据用户id查找用户
}
