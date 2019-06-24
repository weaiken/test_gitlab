package com.exam.entity;

public class QuesShortWithBLOBs extends QuesShort {
    private String content;

    private String standardAns;

    private String analysis;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getStandardAns() {
        return standardAns;
    }

    public void setStandardAns(String standardAns) {
        this.standardAns = standardAns == null ? null : standardAns.trim();
    }

    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis == null ? null : analysis.trim();
    }
}