package com.exam.entity;

public class QuesMul {
    private Integer qmid;

    private String standardAns;

    private String knowledge;

    private Integer difficulty;

    private Integer int1;

    private Integer int2;

    private String var1;

    private String var2;

    public Integer getQmid() {
        return qmid;
    }

    public void setQmid(Integer qmid) {
        this.qmid = qmid;
    }

    public String getStandardAns() {
        return standardAns;
    }

    public void setStandardAns(String standardAns) {
        this.standardAns = standardAns == null ? null : standardAns.trim();
    }

    public String getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(String knowledge) {
        this.knowledge = knowledge == null ? null : knowledge.trim();
    }

    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
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