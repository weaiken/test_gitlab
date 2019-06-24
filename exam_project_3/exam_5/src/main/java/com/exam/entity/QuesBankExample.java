package com.exam.entity;

import java.util.ArrayList;
import java.util.List;

public class QuesBankExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuesBankExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andBidIsNull() {
            addCriterion("bid is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("bid is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(Integer value) {
            addCriterion("bid =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(Integer value) {
            addCriterion("bid <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(Integer value) {
            addCriterion("bid >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bid >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(Integer value) {
            addCriterion("bid <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(Integer value) {
            addCriterion("bid <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<Integer> values) {
            addCriterion("bid in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<Integer> values) {
            addCriterion("bid not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(Integer value1, Integer value2) {
            addCriterion("bid between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(Integer value1, Integer value2) {
            addCriterion("bid not between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andBnameIsNull() {
            addCriterion("bname is null");
            return (Criteria) this;
        }

        public Criteria andBnameIsNotNull() {
            addCriterion("bname is not null");
            return (Criteria) this;
        }

        public Criteria andBnameEqualTo(String value) {
            addCriterion("bname =", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotEqualTo(String value) {
            addCriterion("bname <>", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameGreaterThan(String value) {
            addCriterion("bname >", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameGreaterThanOrEqualTo(String value) {
            addCriterion("bname >=", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLessThan(String value) {
            addCriterion("bname <", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLessThanOrEqualTo(String value) {
            addCriterion("bname <=", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLike(String value) {
            addCriterion("bname like", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotLike(String value) {
            addCriterion("bname not like", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameIn(List<String> values) {
            addCriterion("bname in", values, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotIn(List<String> values) {
            addCriterion("bname not in", values, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameBetween(String value1, String value2) {
            addCriterion("bname between", value1, value2, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotBetween(String value1, String value2) {
            addCriterion("bname not between", value1, value2, "bname");
            return (Criteria) this;
        }

        public Criteria andQsiNumIsNull() {
            addCriterion("qsi_num is null");
            return (Criteria) this;
        }

        public Criteria andQsiNumIsNotNull() {
            addCriterion("qsi_num is not null");
            return (Criteria) this;
        }

        public Criteria andQsiNumEqualTo(Integer value) {
            addCriterion("qsi_num =", value, "qsiNum");
            return (Criteria) this;
        }

        public Criteria andQsiNumNotEqualTo(Integer value) {
            addCriterion("qsi_num <>", value, "qsiNum");
            return (Criteria) this;
        }

        public Criteria andQsiNumGreaterThan(Integer value) {
            addCriterion("qsi_num >", value, "qsiNum");
            return (Criteria) this;
        }

        public Criteria andQsiNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("qsi_num >=", value, "qsiNum");
            return (Criteria) this;
        }

        public Criteria andQsiNumLessThan(Integer value) {
            addCriterion("qsi_num <", value, "qsiNum");
            return (Criteria) this;
        }

        public Criteria andQsiNumLessThanOrEqualTo(Integer value) {
            addCriterion("qsi_num <=", value, "qsiNum");
            return (Criteria) this;
        }

        public Criteria andQsiNumIn(List<Integer> values) {
            addCriterion("qsi_num in", values, "qsiNum");
            return (Criteria) this;
        }

        public Criteria andQsiNumNotIn(List<Integer> values) {
            addCriterion("qsi_num not in", values, "qsiNum");
            return (Criteria) this;
        }

        public Criteria andQsiNumBetween(Integer value1, Integer value2) {
            addCriterion("qsi_num between", value1, value2, "qsiNum");
            return (Criteria) this;
        }

        public Criteria andQsiNumNotBetween(Integer value1, Integer value2) {
            addCriterion("qsi_num not between", value1, value2, "qsiNum");
            return (Criteria) this;
        }

        public Criteria andQmNumIsNull() {
            addCriterion("qm_num is null");
            return (Criteria) this;
        }

        public Criteria andQmNumIsNotNull() {
            addCriterion("qm_num is not null");
            return (Criteria) this;
        }

        public Criteria andQmNumEqualTo(Integer value) {
            addCriterion("qm_num =", value, "qmNum");
            return (Criteria) this;
        }

        public Criteria andQmNumNotEqualTo(Integer value) {
            addCriterion("qm_num <>", value, "qmNum");
            return (Criteria) this;
        }

        public Criteria andQmNumGreaterThan(Integer value) {
            addCriterion("qm_num >", value, "qmNum");
            return (Criteria) this;
        }

        public Criteria andQmNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("qm_num >=", value, "qmNum");
            return (Criteria) this;
        }

        public Criteria andQmNumLessThan(Integer value) {
            addCriterion("qm_num <", value, "qmNum");
            return (Criteria) this;
        }

        public Criteria andQmNumLessThanOrEqualTo(Integer value) {
            addCriterion("qm_num <=", value, "qmNum");
            return (Criteria) this;
        }

        public Criteria andQmNumIn(List<Integer> values) {
            addCriterion("qm_num in", values, "qmNum");
            return (Criteria) this;
        }

        public Criteria andQmNumNotIn(List<Integer> values) {
            addCriterion("qm_num not in", values, "qmNum");
            return (Criteria) this;
        }

        public Criteria andQmNumBetween(Integer value1, Integer value2) {
            addCriterion("qm_num between", value1, value2, "qmNum");
            return (Criteria) this;
        }

        public Criteria andQmNumNotBetween(Integer value1, Integer value2) {
            addCriterion("qm_num not between", value1, value2, "qmNum");
            return (Criteria) this;
        }

        public Criteria andQjNumIsNull() {
            addCriterion("qj_num is null");
            return (Criteria) this;
        }

        public Criteria andQjNumIsNotNull() {
            addCriterion("qj_num is not null");
            return (Criteria) this;
        }

        public Criteria andQjNumEqualTo(Integer value) {
            addCriterion("qj_num =", value, "qjNum");
            return (Criteria) this;
        }

        public Criteria andQjNumNotEqualTo(Integer value) {
            addCriterion("qj_num <>", value, "qjNum");
            return (Criteria) this;
        }

        public Criteria andQjNumGreaterThan(Integer value) {
            addCriterion("qj_num >", value, "qjNum");
            return (Criteria) this;
        }

        public Criteria andQjNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("qj_num >=", value, "qjNum");
            return (Criteria) this;
        }

        public Criteria andQjNumLessThan(Integer value) {
            addCriterion("qj_num <", value, "qjNum");
            return (Criteria) this;
        }

        public Criteria andQjNumLessThanOrEqualTo(Integer value) {
            addCriterion("qj_num <=", value, "qjNum");
            return (Criteria) this;
        }

        public Criteria andQjNumIn(List<Integer> values) {
            addCriterion("qj_num in", values, "qjNum");
            return (Criteria) this;
        }

        public Criteria andQjNumNotIn(List<Integer> values) {
            addCriterion("qj_num not in", values, "qjNum");
            return (Criteria) this;
        }

        public Criteria andQjNumBetween(Integer value1, Integer value2) {
            addCriterion("qj_num between", value1, value2, "qjNum");
            return (Criteria) this;
        }

        public Criteria andQjNumNotBetween(Integer value1, Integer value2) {
            addCriterion("qj_num not between", value1, value2, "qjNum");
            return (Criteria) this;
        }

        public Criteria andQfNumIsNull() {
            addCriterion("qf_num is null");
            return (Criteria) this;
        }

        public Criteria andQfNumIsNotNull() {
            addCriterion("qf_num is not null");
            return (Criteria) this;
        }

        public Criteria andQfNumEqualTo(Integer value) {
            addCriterion("qf_num =", value, "qfNum");
            return (Criteria) this;
        }

        public Criteria andQfNumNotEqualTo(Integer value) {
            addCriterion("qf_num <>", value, "qfNum");
            return (Criteria) this;
        }

        public Criteria andQfNumGreaterThan(Integer value) {
            addCriterion("qf_num >", value, "qfNum");
            return (Criteria) this;
        }

        public Criteria andQfNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("qf_num >=", value, "qfNum");
            return (Criteria) this;
        }

        public Criteria andQfNumLessThan(Integer value) {
            addCriterion("qf_num <", value, "qfNum");
            return (Criteria) this;
        }

        public Criteria andQfNumLessThanOrEqualTo(Integer value) {
            addCriterion("qf_num <=", value, "qfNum");
            return (Criteria) this;
        }

        public Criteria andQfNumIn(List<Integer> values) {
            addCriterion("qf_num in", values, "qfNum");
            return (Criteria) this;
        }

        public Criteria andQfNumNotIn(List<Integer> values) {
            addCriterion("qf_num not in", values, "qfNum");
            return (Criteria) this;
        }

        public Criteria andQfNumBetween(Integer value1, Integer value2) {
            addCriterion("qf_num between", value1, value2, "qfNum");
            return (Criteria) this;
        }

        public Criteria andQfNumNotBetween(Integer value1, Integer value2) {
            addCriterion("qf_num not between", value1, value2, "qfNum");
            return (Criteria) this;
        }

        public Criteria andQshNumIsNull() {
            addCriterion("qsh_num is null");
            return (Criteria) this;
        }

        public Criteria andQshNumIsNotNull() {
            addCriterion("qsh_num is not null");
            return (Criteria) this;
        }

        public Criteria andQshNumEqualTo(Integer value) {
            addCriterion("qsh_num =", value, "qshNum");
            return (Criteria) this;
        }

        public Criteria andQshNumNotEqualTo(Integer value) {
            addCriterion("qsh_num <>", value, "qshNum");
            return (Criteria) this;
        }

        public Criteria andQshNumGreaterThan(Integer value) {
            addCriterion("qsh_num >", value, "qshNum");
            return (Criteria) this;
        }

        public Criteria andQshNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("qsh_num >=", value, "qshNum");
            return (Criteria) this;
        }

        public Criteria andQshNumLessThan(Integer value) {
            addCriterion("qsh_num <", value, "qshNum");
            return (Criteria) this;
        }

        public Criteria andQshNumLessThanOrEqualTo(Integer value) {
            addCriterion("qsh_num <=", value, "qshNum");
            return (Criteria) this;
        }

        public Criteria andQshNumIn(List<Integer> values) {
            addCriterion("qsh_num in", values, "qshNum");
            return (Criteria) this;
        }

        public Criteria andQshNumNotIn(List<Integer> values) {
            addCriterion("qsh_num not in", values, "qshNum");
            return (Criteria) this;
        }

        public Criteria andQshNumBetween(Integer value1, Integer value2) {
            addCriterion("qsh_num between", value1, value2, "qshNum");
            return (Criteria) this;
        }

        public Criteria andQshNumNotBetween(Integer value1, Integer value2) {
            addCriterion("qsh_num not between", value1, value2, "qshNum");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(String value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(String value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(String value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(String value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(String value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(String value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLike(String value) {
            addCriterion("date like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotLike(String value) {
            addCriterion("date not like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<String> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<String> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(String value1, String value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(String value1, String value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andInt1IsNull() {
            addCriterion("int_1 is null");
            return (Criteria) this;
        }

        public Criteria andInt1IsNotNull() {
            addCriterion("int_1 is not null");
            return (Criteria) this;
        }

        public Criteria andInt1EqualTo(Integer value) {
            addCriterion("int_1 =", value, "int1");
            return (Criteria) this;
        }

        public Criteria andInt1NotEqualTo(Integer value) {
            addCriterion("int_1 <>", value, "int1");
            return (Criteria) this;
        }

        public Criteria andInt1GreaterThan(Integer value) {
            addCriterion("int_1 >", value, "int1");
            return (Criteria) this;
        }

        public Criteria andInt1GreaterThanOrEqualTo(Integer value) {
            addCriterion("int_1 >=", value, "int1");
            return (Criteria) this;
        }

        public Criteria andInt1LessThan(Integer value) {
            addCriterion("int_1 <", value, "int1");
            return (Criteria) this;
        }

        public Criteria andInt1LessThanOrEqualTo(Integer value) {
            addCriterion("int_1 <=", value, "int1");
            return (Criteria) this;
        }

        public Criteria andInt1In(List<Integer> values) {
            addCriterion("int_1 in", values, "int1");
            return (Criteria) this;
        }

        public Criteria andInt1NotIn(List<Integer> values) {
            addCriterion("int_1 not in", values, "int1");
            return (Criteria) this;
        }

        public Criteria andInt1Between(Integer value1, Integer value2) {
            addCriterion("int_1 between", value1, value2, "int1");
            return (Criteria) this;
        }

        public Criteria andInt1NotBetween(Integer value1, Integer value2) {
            addCriterion("int_1 not between", value1, value2, "int1");
            return (Criteria) this;
        }

        public Criteria andInt2IsNull() {
            addCriterion("int_2 is null");
            return (Criteria) this;
        }

        public Criteria andInt2IsNotNull() {
            addCriterion("int_2 is not null");
            return (Criteria) this;
        }

        public Criteria andInt2EqualTo(Integer value) {
            addCriterion("int_2 =", value, "int2");
            return (Criteria) this;
        }

        public Criteria andInt2NotEqualTo(Integer value) {
            addCriterion("int_2 <>", value, "int2");
            return (Criteria) this;
        }

        public Criteria andInt2GreaterThan(Integer value) {
            addCriterion("int_2 >", value, "int2");
            return (Criteria) this;
        }

        public Criteria andInt2GreaterThanOrEqualTo(Integer value) {
            addCriterion("int_2 >=", value, "int2");
            return (Criteria) this;
        }

        public Criteria andInt2LessThan(Integer value) {
            addCriterion("int_2 <", value, "int2");
            return (Criteria) this;
        }

        public Criteria andInt2LessThanOrEqualTo(Integer value) {
            addCriterion("int_2 <=", value, "int2");
            return (Criteria) this;
        }

        public Criteria andInt2In(List<Integer> values) {
            addCriterion("int_2 in", values, "int2");
            return (Criteria) this;
        }

        public Criteria andInt2NotIn(List<Integer> values) {
            addCriterion("int_2 not in", values, "int2");
            return (Criteria) this;
        }

        public Criteria andInt2Between(Integer value1, Integer value2) {
            addCriterion("int_2 between", value1, value2, "int2");
            return (Criteria) this;
        }

        public Criteria andInt2NotBetween(Integer value1, Integer value2) {
            addCriterion("int_2 not between", value1, value2, "int2");
            return (Criteria) this;
        }

        public Criteria andVar1IsNull() {
            addCriterion("var_1 is null");
            return (Criteria) this;
        }

        public Criteria andVar1IsNotNull() {
            addCriterion("var_1 is not null");
            return (Criteria) this;
        }

        public Criteria andVar1EqualTo(String value) {
            addCriterion("var_1 =", value, "var1");
            return (Criteria) this;
        }

        public Criteria andVar1NotEqualTo(String value) {
            addCriterion("var_1 <>", value, "var1");
            return (Criteria) this;
        }

        public Criteria andVar1GreaterThan(String value) {
            addCriterion("var_1 >", value, "var1");
            return (Criteria) this;
        }

        public Criteria andVar1GreaterThanOrEqualTo(String value) {
            addCriterion("var_1 >=", value, "var1");
            return (Criteria) this;
        }

        public Criteria andVar1LessThan(String value) {
            addCriterion("var_1 <", value, "var1");
            return (Criteria) this;
        }

        public Criteria andVar1LessThanOrEqualTo(String value) {
            addCriterion("var_1 <=", value, "var1");
            return (Criteria) this;
        }

        public Criteria andVar1Like(String value) {
            addCriterion("var_1 like", value, "var1");
            return (Criteria) this;
        }

        public Criteria andVar1NotLike(String value) {
            addCriterion("var_1 not like", value, "var1");
            return (Criteria) this;
        }

        public Criteria andVar1In(List<String> values) {
            addCriterion("var_1 in", values, "var1");
            return (Criteria) this;
        }

        public Criteria andVar1NotIn(List<String> values) {
            addCriterion("var_1 not in", values, "var1");
            return (Criteria) this;
        }

        public Criteria andVar1Between(String value1, String value2) {
            addCriterion("var_1 between", value1, value2, "var1");
            return (Criteria) this;
        }

        public Criteria andVar1NotBetween(String value1, String value2) {
            addCriterion("var_1 not between", value1, value2, "var1");
            return (Criteria) this;
        }

        public Criteria andVar2IsNull() {
            addCriterion("var_2 is null");
            return (Criteria) this;
        }

        public Criteria andVar2IsNotNull() {
            addCriterion("var_2 is not null");
            return (Criteria) this;
        }

        public Criteria andVar2EqualTo(String value) {
            addCriterion("var_2 =", value, "var2");
            return (Criteria) this;
        }

        public Criteria andVar2NotEqualTo(String value) {
            addCriterion("var_2 <>", value, "var2");
            return (Criteria) this;
        }

        public Criteria andVar2GreaterThan(String value) {
            addCriterion("var_2 >", value, "var2");
            return (Criteria) this;
        }

        public Criteria andVar2GreaterThanOrEqualTo(String value) {
            addCriterion("var_2 >=", value, "var2");
            return (Criteria) this;
        }

        public Criteria andVar2LessThan(String value) {
            addCriterion("var_2 <", value, "var2");
            return (Criteria) this;
        }

        public Criteria andVar2LessThanOrEqualTo(String value) {
            addCriterion("var_2 <=", value, "var2");
            return (Criteria) this;
        }

        public Criteria andVar2Like(String value) {
            addCriterion("var_2 like", value, "var2");
            return (Criteria) this;
        }

        public Criteria andVar2NotLike(String value) {
            addCriterion("var_2 not like", value, "var2");
            return (Criteria) this;
        }

        public Criteria andVar2In(List<String> values) {
            addCriterion("var_2 in", values, "var2");
            return (Criteria) this;
        }

        public Criteria andVar2NotIn(List<String> values) {
            addCriterion("var_2 not in", values, "var2");
            return (Criteria) this;
        }

        public Criteria andVar2Between(String value1, String value2) {
            addCriterion("var_2 between", value1, value2, "var2");
            return (Criteria) this;
        }

        public Criteria andVar2NotBetween(String value1, String value2) {
            addCriterion("var_2 not between", value1, value2, "var2");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}