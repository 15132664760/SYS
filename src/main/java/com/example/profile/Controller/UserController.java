package com.example.profile.Controller;

import com.example.profile.Mapper.*;
import com.example.profile.bean.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserMapper userMapper;
    @Autowired
    EduMapper eduMapper;
    @Autowired
    WorkMapper workMapper;
    @Autowired
    SkillMapper skillMapper;
    @Autowired
    SpecialtyMapper specialtyMapper;

    @RequestMapping("v1/user/insert")
    public Result addUser(User user){
        Result result = null;
        if(user.getName().isEmpty()){
            result = new Result(-1, "用户新增失败");
            return result;
        }else{
        userMapper.addUser(user);
        int id=user.getId();//获取user中的id
            result = new Result(0, "用户新增成功", id);//将user。id传给前端
          return result;
        }
    }
    @RequestMapping("v1/edu/insert")
    public Result addEdu(Edu edu, @RequestParam("userid") int userid) {
        Result result = null;
        if (edu.getSchool().isEmpty()) {
            result=new Result(1,"学历为空");
            return result;
        }else {
            edu.setUserId(userid);//先将userid放到edu中，再将edu插入到数据库
            int row = eduMapper.addEdu(edu);//返回插入的函数
            if (row > 0) {
                result = new Result(0, "学历新增成功");
            } else {
                result = new Result(-1, "学历新增失败");
            }
            return result;
        }
    }
    @PostMapping("v1/work/insert")
    public Result addWork(Work work, @RequestParam("userid") int userid) {
        Result result = null;
        if (work.getJob().isEmpty()) {
            result = new Result(1, "工作经历为空");
            return result;
        } else {
            work.setUserId(userid);
            int row = workMapper.addWork(work);//返回插入的函数
            if (row > 0) {
                result = new Result(0, "工作经历新增成功");
            } else {
                result = new Result(-1, "工作经历新增失败");
            }
            return result;
        }
    }
    @PostMapping("v1/skill/insert")
    public Result addSkill(Skill skill, @RequestParam("userid") int userid) {
        Result result = null;
        if (skill.getKeywords().isEmpty()) {
            result = new Result(1, "我是fw");
            return result;
        } else {
            skill.setUserId(userid);
            int row = skillMapper.addSkill(skill); //返回插入的函数
            if (row > 0) {
                result = new Result(0, "技能列表新增成功");
            } else {
                result = new Result(-1, "技能列表新增失败");
            }
            return result;
        }
    }
    @PostMapping("v1/specialty/insert")
    public Result addSpecialty(Specialty specialty, @RequestParam("userid") int userid) {
        Result result = null;
        if (specialty.getName().isEmpty()) {
            result = new Result(1, "工作经历为空");
            return result;
        } else {
            specialty.setUserId(userid);
            int row = specialtyMapper.addSpecialty(specialty);//返回插入的函数
            if (row > 0) {
                result = new Result(0, "特长新增成功");
            } else {
                result = new Result(-1, "特长新增失败");
            }
            return result;
        }
    }
    @RequestMapping("v1/info")
    public Result findByUserId(@RequestParam("userid") int userid){
        User user = userMapper.findByUserId(userid);
        List<Edu> edu = eduMapper.findByUserId(userid);
        Skill skill = skillMapper.findByUserId(userid);
        List<Work> work = workMapper.findByUserId(userid);
        List<Specialty> specialty = specialtyMapper.findByUserId(userid);
        Info info = new Info(user, edu, skill, work, specialty);
        Result result = null;

        if (info != null) {
            result = new Result(0, "查询成功", info);
        } else {
            result = new Result(-1, "查询失败，不存在");
        }
        return result;
    }

}
