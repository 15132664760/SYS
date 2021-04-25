package com.example.profile.Mapper;

import com.example.profile.bean.Edu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper//mybatis处理的接口
public interface EduMapper {
    public int addEdu(Edu edu);
    public List<Edu> findByUserId(int userid);

}
