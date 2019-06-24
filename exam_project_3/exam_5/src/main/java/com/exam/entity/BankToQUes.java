package com.exam.entity;

public class BankToQUes {
    private Integer bqid;

    private Integer bid;

    private Integer qid;

    private Integer qorder;

    private Integer type;

    private Integer int1;

    private Integer int2;

    private String var1;

    private String var2;

    public Integer getBqid() {
        return bqid;
    }

    public void setBqid(Integer bqid) {
        this.bqid = bqid;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Integer getQid() {
        return qid;
    }

    public void setQid(Integer qid) {
        this.qid = qid;
    }

    public Integer getQorder() {
        return qorder;
    }

    public void setQorder(Integer qorder) {
        this.qorder = qorder;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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