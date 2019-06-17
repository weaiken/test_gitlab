package com.exam.entity;

public class Paper {
    private Integer pid;

    private Integer uid;

    private String pname;

    private Integer type;

    private Integer time;

    private String invitationCode;

    private Integer outTimes;

    private String pickInfo;

    private Integer qsiNum;

    private Integer qmNum;

    private Integer qjNum;

    private Integer qfNum;

    private Integer qshNum;

    private String date;

    private Integer isLimit;

    private String begTime;

    private String endTime;

    private Integer int1;

    private Integer int2;

    private String var1;

    private String var2;

    private String pdescribe;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getInvitationCode() {
        return invitationCode;
    }

    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode == null ? null : invitationCode.trim();
    }

    public Integer getOutTimes() {
        return outTimes;
    }

    public void setOutTimes(Integer outTimes) {
        this.outTimes = outTimes;
    }

    public String getPickInfo() {
        return pickInfo;
    }

    public void setPickInfo(String pickInfo) {
        this.pickInfo = pickInfo == null ? null : pickInfo.trim();
    }

    public Integer getQsiNum() {
        return qsiNum;
    }

    public void setQsiNum(Integer qsiNum) {
        this.qsiNum = qsiNum;
    }

    public Integer getQmNum() {
        return qmNum;
    }

    public void setQmNum(Integer qmNum) {
        this.qmNum = qmNum;
    }

    public Integer getQjNum() {
        return qjNum;
    }

    public void setQjNum(Integer qjNum) {
        this.qjNum = qjNum;
    }

    public Integer getQfNum() {
        return qfNum;
    }

    public void setQfNum(Integer qfNum) {
        this.qfNum = qfNum;
    }

    public Integer getQshNum() {
        return qshNum;
    }

    public void setQshNum(Integer qshNum) {
        this.qshNum = qshNum;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public Integer getIsLimit() {
        return isLimit;
    }

    public void setIsLimit(Integer isLimit) {
        this.isLimit = isLimit;
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

    public String getPdescribe() {
        return pdescribe;
    }

    public void setPdescribe(String pdescribe) {
        this.pdescribe = pdescribe == null ? null : pdescribe.trim();
    }
}