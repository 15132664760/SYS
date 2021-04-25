package com.example.profile.Mapper;

import com.example.profile.bean.Work;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WorkMapper {
    public int addWork(Work work);
    public List<Work> findByUserId(int userid);
}
