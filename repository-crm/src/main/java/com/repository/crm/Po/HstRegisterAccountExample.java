package com.repository.crm.Po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HstRegisterAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HstRegisterAccountExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("uuid like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("uuid not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andAccountUuidIsNull() {
            addCriterion("account_uuid is null");
            return (Criteria) this;
        }

        public Criteria andAccountUuidIsNotNull() {
            addCriterion("account_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andAccountUuidEqualTo(String value) {
            addCriterion("account_uuid =", value, "accountUuid");
            return (Criteria) this;
        }

        public Criteria andAccountUuidNotEqualTo(String value) {
            addCriterion("account_uuid <>", value, "accountUuid");
            return (Criteria) this;
        }

        public Criteria andAccountUuidGreaterThan(String value) {
            addCriterion("account_uuid >", value, "accountUuid");
            return (Criteria) this;
        }

        public Criteria andAccountUuidGreaterThanOrEqualTo(String value) {
            addCriterion("account_uuid >=", value, "accountUuid");
            return (Criteria) this;
        }

        public Criteria andAccountUuidLessThan(String value) {
            addCriterion("account_uuid <", value, "accountUuid");
            return (Criteria) this;
        }

        public Criteria andAccountUuidLessThanOrEqualTo(String value) {
            addCriterion("account_uuid <=", value, "accountUuid");
            return (Criteria) this;
        }

        public Criteria andAccountUuidLike(String value) {
            addCriterion("account_uuid like", value, "accountUuid");
            return (Criteria) this;
        }

        public Criteria andAccountUuidNotLike(String value) {
            addCriterion("account_uuid not like", value, "accountUuid");
            return (Criteria) this;
        }

        public Criteria andAccountUuidIn(List<String> values) {
            addCriterion("account_uuid in", values, "accountUuid");
            return (Criteria) this;
        }

        public Criteria andAccountUuidNotIn(List<String> values) {
            addCriterion("account_uuid not in", values, "accountUuid");
            return (Criteria) this;
        }

        public Criteria andAccountUuidBetween(String value1, String value2) {
            addCriterion("account_uuid between", value1, value2, "accountUuid");
            return (Criteria) this;
        }

        public Criteria andAccountUuidNotBetween(String value1, String value2) {
            addCriterion("account_uuid not between", value1, value2, "accountUuid");
            return (Criteria) this;
        }

        public Criteria andHstUserNameIsNull() {
            addCriterion("hst_user_name is null");
            return (Criteria) this;
        }

        public Criteria andHstUserNameIsNotNull() {
            addCriterion("hst_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andHstUserNameEqualTo(String value) {
            addCriterion("hst_user_name =", value, "hstUserName");
            return (Criteria) this;
        }

        public Criteria andHstUserNameNotEqualTo(String value) {
            addCriterion("hst_user_name <>", value, "hstUserName");
            return (Criteria) this;
        }

        public Criteria andHstUserNameGreaterThan(String value) {
            addCriterion("hst_user_name >", value, "hstUserName");
            return (Criteria) this;
        }

        public Criteria andHstUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("hst_user_name >=", value, "hstUserName");
            return (Criteria) this;
        }

        public Criteria andHstUserNameLessThan(String value) {
            addCriterion("hst_user_name <", value, "hstUserName");
            return (Criteria) this;
        }

        public Criteria andHstUserNameLessThanOrEqualTo(String value) {
            addCriterion("hst_user_name <=", value, "hstUserName");
            return (Criteria) this;
        }

        public Criteria andHstUserNameLike(String value) {
            addCriterion("hst_user_name like", value, "hstUserName");
            return (Criteria) this;
        }

        public Criteria andHstUserNameNotLike(String value) {
            addCriterion("hst_user_name not like", value, "hstUserName");
            return (Criteria) this;
        }

        public Criteria andHstUserNameIn(List<String> values) {
            addCriterion("hst_user_name in", values, "hstUserName");
            return (Criteria) this;
        }

        public Criteria andHstUserNameNotIn(List<String> values) {
            addCriterion("hst_user_name not in", values, "hstUserName");
            return (Criteria) this;
        }

        public Criteria andHstUserNameBetween(String value1, String value2) {
            addCriterion("hst_user_name between", value1, value2, "hstUserName");
            return (Criteria) this;
        }

        public Criteria andHstUserNameNotBetween(String value1, String value2) {
            addCriterion("hst_user_name not between", value1, value2, "hstUserName");
            return (Criteria) this;
        }

        public Criteria andHstUserPwdIsNull() {
            addCriterion("hst_user_pwd is null");
            return (Criteria) this;
        }

        public Criteria andHstUserPwdIsNotNull() {
            addCriterion("hst_user_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andHstUserPwdEqualTo(String value) {
            addCriterion("hst_user_pwd =", value, "hstUserPwd");
            return (Criteria) this;
        }

        public Criteria andHstUserPwdNotEqualTo(String value) {
            addCriterion("hst_user_pwd <>", value, "hstUserPwd");
            return (Criteria) this;
        }

        public Criteria andHstUserPwdGreaterThan(String value) {
            addCriterion("hst_user_pwd >", value, "hstUserPwd");
            return (Criteria) this;
        }

        public Criteria andHstUserPwdGreaterThanOrEqualTo(String value) {
            addCriterion("hst_user_pwd >=", value, "hstUserPwd");
            return (Criteria) this;
        }

        public Criteria andHstUserPwdLessThan(String value) {
            addCriterion("hst_user_pwd <", value, "hstUserPwd");
            return (Criteria) this;
        }

        public Criteria andHstUserPwdLessThanOrEqualTo(String value) {
            addCriterion("hst_user_pwd <=", value, "hstUserPwd");
            return (Criteria) this;
        }

        public Criteria andHstUserPwdLike(String value) {
            addCriterion("hst_user_pwd like", value, "hstUserPwd");
            return (Criteria) this;
        }

        public Criteria andHstUserPwdNotLike(String value) {
            addCriterion("hst_user_pwd not like", value, "hstUserPwd");
            return (Criteria) this;
        }

        public Criteria andHstUserPwdIn(List<String> values) {
            addCriterion("hst_user_pwd in", values, "hstUserPwd");
            return (Criteria) this;
        }

        public Criteria andHstUserPwdNotIn(List<String> values) {
            addCriterion("hst_user_pwd not in", values, "hstUserPwd");
            return (Criteria) this;
        }

        public Criteria andHstUserPwdBetween(String value1, String value2) {
            addCriterion("hst_user_pwd between", value1, value2, "hstUserPwd");
            return (Criteria) this;
        }

        public Criteria andHstUserPwdNotBetween(String value1, String value2) {
            addCriterion("hst_user_pwd not between", value1, value2, "hstUserPwd");
            return (Criteria) this;
        }

        public Criteria andHstUserNickNameIsNull() {
            addCriterion("hst_user_nick_name is null");
            return (Criteria) this;
        }

        public Criteria andHstUserNickNameIsNotNull() {
            addCriterion("hst_user_nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andHstUserNickNameEqualTo(String value) {
            addCriterion("hst_user_nick_name =", value, "hstUserNickName");
            return (Criteria) this;
        }

        public Criteria andHstUserNickNameNotEqualTo(String value) {
            addCriterion("hst_user_nick_name <>", value, "hstUserNickName");
            return (Criteria) this;
        }

        public Criteria andHstUserNickNameGreaterThan(String value) {
            addCriterion("hst_user_nick_name >", value, "hstUserNickName");
            return (Criteria) this;
        }

        public Criteria andHstUserNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("hst_user_nick_name >=", value, "hstUserNickName");
            return (Criteria) this;
        }

        public Criteria andHstUserNickNameLessThan(String value) {
            addCriterion("hst_user_nick_name <", value, "hstUserNickName");
            return (Criteria) this;
        }

        public Criteria andHstUserNickNameLessThanOrEqualTo(String value) {
            addCriterion("hst_user_nick_name <=", value, "hstUserNickName");
            return (Criteria) this;
        }

        public Criteria andHstUserNickNameLike(String value) {
            addCriterion("hst_user_nick_name like", value, "hstUserNickName");
            return (Criteria) this;
        }

        public Criteria andHstUserNickNameNotLike(String value) {
            addCriterion("hst_user_nick_name not like", value, "hstUserNickName");
            return (Criteria) this;
        }

        public Criteria andHstUserNickNameIn(List<String> values) {
            addCriterion("hst_user_nick_name in", values, "hstUserNickName");
            return (Criteria) this;
        }

        public Criteria andHstUserNickNameNotIn(List<String> values) {
            addCriterion("hst_user_nick_name not in", values, "hstUserNickName");
            return (Criteria) this;
        }

        public Criteria andHstUserNickNameBetween(String value1, String value2) {
            addCriterion("hst_user_nick_name between", value1, value2, "hstUserNickName");
            return (Criteria) this;
        }

        public Criteria andHstUserNickNameNotBetween(String value1, String value2) {
            addCriterion("hst_user_nick_name not between", value1, value2, "hstUserNickName");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIsNull() {
            addCriterion("account_type is null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIsNotNull() {
            addCriterion("account_type is not null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeEqualTo(Integer value) {
            addCriterion("account_type =", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotEqualTo(Integer value) {
            addCriterion("account_type <>", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeGreaterThan(Integer value) {
            addCriterion("account_type >", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_type >=", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLessThan(Integer value) {
            addCriterion("account_type <", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLessThanOrEqualTo(Integer value) {
            addCriterion("account_type <=", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIn(List<Integer> values) {
            addCriterion("account_type in", values, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotIn(List<Integer> values) {
            addCriterion("account_type not in", values, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeBetween(Integer value1, Integer value2) {
            addCriterion("account_type between", value1, value2, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("account_type not between", value1, value2, "accountType");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeDesIsNull() {
            addCriterion("code_des is null");
            return (Criteria) this;
        }

        public Criteria andCodeDesIsNotNull() {
            addCriterion("code_des is not null");
            return (Criteria) this;
        }

        public Criteria andCodeDesEqualTo(String value) {
            addCriterion("code_des =", value, "codeDes");
            return (Criteria) this;
        }

        public Criteria andCodeDesNotEqualTo(String value) {
            addCriterion("code_des <>", value, "codeDes");
            return (Criteria) this;
        }

        public Criteria andCodeDesGreaterThan(String value) {
            addCriterion("code_des >", value, "codeDes");
            return (Criteria) this;
        }

        public Criteria andCodeDesGreaterThanOrEqualTo(String value) {
            addCriterion("code_des >=", value, "codeDes");
            return (Criteria) this;
        }

        public Criteria andCodeDesLessThan(String value) {
            addCriterion("code_des <", value, "codeDes");
            return (Criteria) this;
        }

        public Criteria andCodeDesLessThanOrEqualTo(String value) {
            addCriterion("code_des <=", value, "codeDes");
            return (Criteria) this;
        }

        public Criteria andCodeDesLike(String value) {
            addCriterion("code_des like", value, "codeDes");
            return (Criteria) this;
        }

        public Criteria andCodeDesNotLike(String value) {
            addCriterion("code_des not like", value, "codeDes");
            return (Criteria) this;
        }

        public Criteria andCodeDesIn(List<String> values) {
            addCriterion("code_des in", values, "codeDes");
            return (Criteria) this;
        }

        public Criteria andCodeDesNotIn(List<String> values) {
            addCriterion("code_des not in", values, "codeDes");
            return (Criteria) this;
        }

        public Criteria andCodeDesBetween(String value1, String value2) {
            addCriterion("code_des between", value1, value2, "codeDes");
            return (Criteria) this;
        }

        public Criteria andCodeDesNotBetween(String value1, String value2) {
            addCriterion("code_des not between", value1, value2, "codeDes");
            return (Criteria) this;
        }

        public Criteria andIsSuccessIsNull() {
            addCriterion("is_success is null");
            return (Criteria) this;
        }

        public Criteria andIsSuccessIsNotNull() {
            addCriterion("is_success is not null");
            return (Criteria) this;
        }

        public Criteria andIsSuccessEqualTo(Integer value) {
            addCriterion("is_success =", value, "isSuccess");
            return (Criteria) this;
        }

        public Criteria andIsSuccessNotEqualTo(Integer value) {
            addCriterion("is_success <>", value, "isSuccess");
            return (Criteria) this;
        }

        public Criteria andIsSuccessGreaterThan(Integer value) {
            addCriterion("is_success >", value, "isSuccess");
            return (Criteria) this;
        }

        public Criteria andIsSuccessGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_success >=", value, "isSuccess");
            return (Criteria) this;
        }

        public Criteria andIsSuccessLessThan(Integer value) {
            addCriterion("is_success <", value, "isSuccess");
            return (Criteria) this;
        }

        public Criteria andIsSuccessLessThanOrEqualTo(Integer value) {
            addCriterion("is_success <=", value, "isSuccess");
            return (Criteria) this;
        }

        public Criteria andIsSuccessIn(List<Integer> values) {
            addCriterion("is_success in", values, "isSuccess");
            return (Criteria) this;
        }

        public Criteria andIsSuccessNotIn(List<Integer> values) {
            addCriterion("is_success not in", values, "isSuccess");
            return (Criteria) this;
        }

        public Criteria andIsSuccessBetween(Integer value1, Integer value2) {
            addCriterion("is_success between", value1, value2, "isSuccess");
            return (Criteria) this;
        }

        public Criteria andIsSuccessNotBetween(Integer value1, Integer value2) {
            addCriterion("is_success not between", value1, value2, "isSuccess");
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