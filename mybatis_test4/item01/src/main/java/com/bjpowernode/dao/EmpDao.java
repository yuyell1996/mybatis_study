package com.bjpowernode.dao;

import com.bjpowernode.domain.Emp;
import com.bjpowernode.param.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface EmpDao {
    Emp selectByNo(Integer empno);
    int insertEmp(Emp emp);
    int deleteEmp(@Param("myno") Integer empno);
    List<Emp> selectByNoOrJob(@Param("myno") Integer empno,
                              @Param("myjob") String job);
    List<Emp> selectByUser(User user);
    List<Emp> selectByMap(Map<String,Object> map);
    List<Emp> orderBy(@Param("mytype") String type);
    User selectUser(Emp emp);
    User selectUser2(Emp emp);
    List<Emp> selectByName(@Param("myname") String name);
}
