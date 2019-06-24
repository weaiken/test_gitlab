package com.exam.entity;

public class QuesSingleWithBLOBs extends QuesSingle {
    private String content;

    private String chioce1;

    private String chioce2;

    private String chioce3;

    private String chioce4;

    private String chioce5;

    private String chioce6;

    private String chioce7;

    private String analysis;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getChioce1() {
        return chioce1;
    }

    public void setChioce1(String chioce1) {
        this.chioce1 = chioce1 == null ? null : chioce1.trim();
    }

    public String getChioce2() {
        return chioce2;
    }

    public void setChioce2(String chioce2) {
        this.chioce2 = chioce2 == null ? null : chioce2.trim();
    }

    public String getChioce3() {
        return chioce3;
    }

    public void setChioce3(String chioce3) {
        this.chioce3 = chioce3 == null ? null : chioce3.trim();
    }

    public String getChioce4() {
        return chioce4;
    }

    public void setChioce4(String chioce4) {
        this.chioce4 = chioce4 == null ? null : chioce4.trim();
    }

    public String getChioce5() {
        return chioce5;
    }

    public void setChioce5(String chioce5) {
        this.chioce5 = chioce5 == null ? null : chioce5.trim();
    }

    public String getChioce6() {
        return chioce6;
    }

    public void setChioce6(String chioce6) {
        this.chioce6 = chioce6 == null ? null : chioce6.trim();
    }

    public String getChioce7() {
        return chioce7;
    }

    public void setChioce7(String chioce7) {
        this.chioce7 = chioce7 == null ? null : chioce7.trim();
    }

    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis == null ? null : analysis.trim();
    }
}