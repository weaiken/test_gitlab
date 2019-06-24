package com.exam.entity;

import java.io.Serializable;

public class QuesBank implements Serializable{
    private Integer bid;

    private Integer uid;

    private String bname;

    private Integer qsiNum;

    private Integer qmNum;

    private Integer qjNum;

    private Integer qfNum;

    private Integer qshNum;

    private String date;

    private Integer int1;

    private Integer int2;

    private String var1;

    private String var2;

    private String bdescribe;

    public QuesBank() {
		super();
	}

	public QuesBank(Integer bid, Integer uid, String bname, Integer qsiNum, Integer qmNum, Integer qjNum, Integer qfNum,
			Integer qshNum, String date, Integer int1, Integer int2, String var1, String var2, String bdescribe) {
		super();
		this.bid = bid;
		this.uid = uid;
		this.bname = bname;
		this.qsiNum = qsiNum;
		this.qmNum = qmNum;
		this.qjNum = qjNum;
		this.qfNum = qfNum;
		this.qshNum = qshNum;
		this.date = date;
		this.int1 = int1;
		this.int2 = int2;
		this.var1 = var1;
		this.var2 = var2;
		this.bdescribe = bdescribe;
	}

	public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname == null ? null : bname.trim();
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

    public String getBdescribe() {
        return bdescribe;
    }

    public void setBdescribe(String bdescribe) {
        this.bdescribe = bdescribe == null ? null : bdescribe.trim();
    }
}