package com.exam.entity;

public class Examinee {
    private Integer eid;

    private Integer pid;

    private String ename;

    private String eemail;

    private String classs;

    private Integer studentid;

    private Integer isfinish;

    private Integer uid;

    private Integer islimit;

    private String begTime;

    private String endTime;

    private Integer int1;

    private Integer int2;

    private String var1;

    private String var2;

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public String getEemail() {
        return eemail;
    }

    public void setEemail(String eemail) {
        this.eemail = eemail == null ? null : eemail.trim();
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs == null ? null : classs.trim();
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public Integer getIsfinish() {
        return isfinish;
    }

    public void setIsfinish(Integer isfinish) {
        this.isfinish = isfinish;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getIslimit() {
        return islimit;
    }

    public void setIslimit(Integer islimit) {
        this.islimit = islimit;
    }

    public String getBegTime() {
        return begTime;
    }

    public void setBegTime(String begTime) {
        this.begTime = begTime == null ? null : begTime.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    public Integer getInt1() {
        return int1;
    }

    public void setInt1(Integer int1) {
        this.int1 = int1;
    }

    public Integer getInt2() {
        return int2;
    }

    public void setInt2(Integer int2) {
        this.int2 = int2;
    }

    public String getVar1() {
        return var1;
    }

    public void setVar1(String var1) {
        this.var1 = var1 == null ? null : var1.trim();
    }

    public String getVar2() {
        return var2;
    }

    public void setVar2(String var2) {
        this.var2 = var2 == null ? null : var2.trim();
    }
}