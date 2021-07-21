package com.bjpowernode;

import com.bjpowernode.dao.EmpDao;
import com.bjpowernode.domain.Emp;
import com.bjpowernode.param.User;
import com.bjpowernode.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class MyTest {
    @Test
    public void Test01(){
        SqlSession session = MyBatisUtil.getSqlSession();
        EmpDao dao = session.getMapper(EmpDao.class);
        Emp emp = dao.selectByNo(7369);
        System.out.println(emp);
        session.close();
    }
    @Test
    public void Test02(){
        SqlSession session = MyBatisUtil.getSqlSession();
        EmpDao dao = session.getMapper(EmpDao.class);
        Emp emp = new Emp();
        emp.setEmpno(7500);
        emp.setEname("JACK");
        emp.setJob("SALESMAN");
        emp.setDeptno(30);
        emp.setDname("SALES");
        emp.setGrade(3);
        int count = dao.insertEmp(emp);
        session.commit();
        System.out.println(count);
        session.close();
    }
    @Test
    public void Test03(){
        SqlSession session = MyBatisUtil.getSqlSession();
        EmpDao dao = session.getMapper(EmpDao.class);
        int count = dao.deleteEmp(7500);
        session.commit();
        System.out.println(count);
        session.close();
    }
    @Test
    public void Test04(){
        SqlSession session = MyBatisUtil.getSqlSession();
        EmpDao dao = session.getMapper(EmpDao.class);
        List<Emp> emps = dao.selectByNoOrJob(7369,"SALESMAN");
        emps.forEach(emp -> System.out.println(emp));
        session.close();
    }
    @Test
    public void Test05(){
        SqlSession session = MyBatisUtil.getSqlSession();
        EmpDao dao = session.getMapper(EmpDao.class);
        User user = new User();
        user.setId(7654);
        user.setEname("SMITH");
        user.setUjob("CLERK");
        user.setDeptno(10);
        List<Emp> emps = dao.selectByUser(user);
        emps.forEach(emp -> System.out.println(emp));
        session.close();
    }
    @Test
    public void Test06(){
        SqlSession session = MyBatisUtil.getSqlSession();
        EmpDao dao = session.getMapper(EmpDao.class);
        Map<String,Object> map = new Hashtable<>();
        map.put("myid",7839);
        map.put("myjob","CLERK");
        List<Emp> emps = dao.selectByMap(map);
        emps.forEach(emp -> System.out.println(emp));
        session.close();
    }
    @Test
    public void Test07(){
        SqlSession session = MyBatisUtil.getSqlSession();
        EmpDao dao = session.getMapper(EmpDao.class);
        String mytype="'empno'";
        List<Emp> emps = dao.orderBy(mytype);
        emps.forEach(emp -> System.out.println(emp));
        session.close();
    }
    @Test
    public void Test08(){
        SqlSession session = MyBatisUtil.getSqlSession();
        EmpDao dao = session.getMapper(EmpDao.class);
        Emp emp = new Emp();
        emp.setEmpno(7934);
        User user = dao.selectUser(emp);
        System.out.println(user);
        session.close();
    }
    @Test
    public void Test09(){
        SqlSession session = MyBatisUtil.getSqlSession();
        EmpDao dao = session.getMapper(EmpDao.class);
        Emp emp = new Emp();
        emp.setEmpno(7934);
        User user = dao.selectUser2(emp);
        System.out.println(user);
        session.close();
    }
    @Test
    public void Test10(){
        SqlSession session = MyBatisUtil.getSqlSession();
        EmpDao dao = session.getMapper(EmpDao.class);
        String name = "O";
        List<Emp> emps = dao.selectByName(name);
        emps.forEach(emp -> System.out.println(emp));
        session.close();
    }
}
