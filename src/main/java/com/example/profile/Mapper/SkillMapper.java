package com.example.profile.Mapper;

import com.example.profile.bean.Skill;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SkillMapper {
    public int addSkill(Skill skill);
    public Skill findByUserId(int userid);

}
