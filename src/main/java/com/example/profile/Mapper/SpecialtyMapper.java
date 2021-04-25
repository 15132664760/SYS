package com.example.profile.Mapper;

import com.example.profile.bean.Specialty;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SpecialtyMapper {
    public int addSpecialty(Specialty specialty);
    public List<Specialty> findByUserId(int userid);
}
