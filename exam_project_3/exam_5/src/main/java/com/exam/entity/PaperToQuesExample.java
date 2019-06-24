package com.exam.entity;

import java.util.ArrayList;
import java.util.List;

public class PaperToQuesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaperToQuesExample() {
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

        public Criteria andPqidIsNull() {
            addCriterion("pqid is null");
            return (Criteria) this;
        }

        public Criteria andPqidIsNotNull() {
            addCriterion("pqid is not null");
            return (Criteria) this;
        }

        public Criteria andPqidEqualTo(Integer value) {
            addCriterion("pqid =", value, "pqid");
            return (Criteria) this;
        }

        public Criteria andPqidNotEqualTo(Integer value) {
            addCriterion("pqid <>", value, "pqid");
            return (Criteria) this;
        }

        public Criteria andPqidGreaterThan(Integer value) {
            addCriterion("pqid >", value, "pqid");
            return (Criteria) this;
        }

        public Criteria andPqidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pqid >=", value, "pqid");
            return (Criteria) this;
        }

        public Criteria andPqidLessThan(Integer value) {
            addCriterion("pqid <", value, "pqid");
            return (Criteria) this;
        }

        public Criteria andPqidLessThanOrEqualTo(Integer value) {
            addCriterion("pqid <=", value, "pqid");
            return (Criteria) this;
        }

        public Criteria andPqidIn(List<Integer> values) {
            addCriterion("pqid in", values, "pqid");
            return (Criteria) this;
        }

        public Criteria andPqidNotIn(List<Integer> values) {
            addCriterion("pqid not in", values, "pqid");
            return (Criteria) this;
        }

        public Criteria andPqidBetween(Integer value1, Integer value2) {
            addCriterion("pqid between", value1, value2, "pqid");
            return (Criteria) this;
        }

        public Criteria andPqidNotBetween(Integer value1, Integer value2) {
            addCriterion("pqid not between", value1, value2, "pqid");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andQidIsNull() {
            addCriterion("qid is null");
            return (Criteria) this;
        }

        public Criteria andQidIsNotNull() {
            addCriterion("qid is not null");
            return (Criteria) this;
        }

        public Criteria andQidEqualTo(Integer value) {
            addCriterion("qid =", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidNotEqualTo(Integer value) {
            addCriterion("qid <>", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidGreaterThan(Integer value) {
            addCriterion("qid >", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidGreaterThanOrEqualTo(Integer value) {
            addCriterion("qid >=", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidLessThan(Integer value) {
            addCriterion("qid <", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidLessThanOrEqualTo(Integer value) {
            addCriterion("qid <=", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidIn(List<Integer> values) {
            addCriterion("qid in", values, "qid");
            return (Criteria) this;
        }

        public Criteria andQidNotIn(List<Integer> values) {
            addCriterion("qid not in", values, "qid");
            return (Criteria) this;
        }

        public Criteria andQidBetween(Integer value1, Integer value2) {
            addCriterion("qid between", value1, value2, "qid");
            return (Criteria) this;
        }

        public Criteria andQidNotBetween(Integer value1, Integer value2) {
            addCriterion("qid not between", value1, value2, "qid");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andQorderIsNull() {
            addCriterion("qorder is null");
            return (Criteria) this;
        }

        public Criteria andQorderIsNotNull() {
            addCriterion("qorder is not null");
            return (Criteria) this;
        }

        public Criteria andQorderEqualTo(Integer value) {
            addCriterion("qorder =", value, "qorder");
            return (Criteria) this;
        }

        public Criteria andQorderNotEqualTo(Integer value) {
            addCriterion("qorder <>", value, "qorder");
            return (Criteria) this;
        }

        public Criteria andQorderGreaterThan(Integer value) {
            addCriterion("qorder >", value, "qorder");
            return (Criteria) this;
        }

        public Criteria andQorderGreaterThanOrEqualTo(Integer value) {
            addCriterion("qorder >=", value, "qorder");
            return (Criteria) this;
        }

        public Criteria andQorderLessThan(Integer value) {
            addCriterion("qorder <", value, "qorder");
            return (Criteria) this;
        }

        public Criteria andQorderLessThanOrEqualTo(Integer value) {
            addCriterion("qorder <=", value, "qorder");
            return (Criteria) this;
        }

        public Criteria andQorderIn(List<Integer> values) {
            addCriterion("qorder in", values, "qorder");
            return (Criteria) this;
        }

        public Criteria andQorderNotIn(List<Integer> values) {
            addCriterion("qorder not in", values, "qorder");
            return (Criteria) this;
        }

        public Criteria andQorderBetween(Integer value1, Integer value2) {
            addCriterion("qorder between", value1, value2, "qorder");
            return (Criteria) this;
        }

        public Criteria andQorderNotBetween(Integer value1, Integer value2) {
            addCriterion("qorder not between", value1, value2, "qorder");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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