package com.exam.entity;

import java.io.Serializable;

public class StorePaper implements Serializable {
    private Integer spid;

    private Integer pid;

    private Double price;

    private Integer saleNum;

    private Integer int1;

    private Integer int2;

    private String var1;

    private String var2;

    public StorePaper() {
		super();
	}

	public StorePaper(Integer spid, Integer pid, Double price, Integer saleNum, Integer int1, Integer int2, String var1,
			String var2) {
		super();
		this.spid = spid;
		this.pid = pid;
		this.price = price;
		this.saleNum = saleNum;
		this.int1 = int1;
		this.int2 = int2;
		this.var1 = var1;
		this.var2 = var2;
	}

	public Integer getSpid() {
        return spid;
    }

    public void setSpid(Integer spid) {
        this.spid = spid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(Integer saleNum) {
        this.saleNum = saleNum;
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