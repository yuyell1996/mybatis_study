package com.bjpowernode.param;

public class User {
    private int id;
    private String ename;
    private String ujob;
    private int deptno;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", ename='" + ename + '\'' +
                ", ujob='" + ujob + '\'' +
                ", deptno=" + deptno +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getUjob() {
        return ujob;
    }

    public void setUjob(String ujob) {
        this.ujob = ujob;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }
}
