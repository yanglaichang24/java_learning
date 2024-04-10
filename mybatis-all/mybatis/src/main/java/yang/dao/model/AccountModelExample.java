package yang.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountModelExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMediaIdIsNull() {
            addCriterion("media_id is null");
            return (Criteria) this;
        }

        public Criteria andMediaIdIsNotNull() {
            addCriterion("media_id is not null");
            return (Criteria) this;
        }

        public Criteria andMediaIdEqualTo(Integer value) {
            addCriterion("media_id =", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotEqualTo(Integer value) {
            addCriterion("media_id <>", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdGreaterThan(Integer value) {
            addCriterion("media_id >", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("media_id >=", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdLessThan(Integer value) {
            addCriterion("media_id <", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdLessThanOrEqualTo(Integer value) {
            addCriterion("media_id <=", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdIn(List<Integer> values) {
            addCriterion("media_id in", values, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotIn(List<Integer> values) {
            addCriterion("media_id not in", values, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdBetween(Integer value1, Integer value2) {
            addCriterion("media_id between", value1, value2, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("media_id not between", value1, value2, "mediaId");
            return (Criteria) this;
        }

        public Criteria andPlatformAccountIdIsNull() {
            addCriterion("platform_account_id is null");
            return (Criteria) this;
        }

        public Criteria andPlatformAccountIdIsNotNull() {
            addCriterion("platform_account_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformAccountIdEqualTo(String value) {
            addCriterion("platform_account_id =", value, "platformAccountId");
            return (Criteria) this;
        }

        public Criteria andPlatformAccountIdNotEqualTo(String value) {
            addCriterion("platform_account_id <>", value, "platformAccountId");
            return (Criteria) this;
        }

        public Criteria andPlatformAccountIdGreaterThan(String value) {
            addCriterion("platform_account_id >", value, "platformAccountId");
            return (Criteria) this;
        }

        public Criteria andPlatformAccountIdGreaterThanOrEqualTo(String value) {
            addCriterion("platform_account_id >=", value, "platformAccountId");
            return (Criteria) this;
        }

        public Criteria andPlatformAccountIdLessThan(String value) {
            addCriterion("platform_account_id <", value, "platformAccountId");
            return (Criteria) this;
        }

        public Criteria andPlatformAccountIdLessThanOrEqualTo(String value) {
            addCriterion("platform_account_id <=", value, "platformAccountId");
            return (Criteria) this;
        }

        public Criteria andPlatformAccountIdLike(String value) {
            addCriterion("platform_account_id like", value, "platformAccountId");
            return (Criteria) this;
        }

        public Criteria andPlatformAccountIdNotLike(String value) {
            addCriterion("platform_account_id not like", value, "platformAccountId");
            return (Criteria) this;
        }

        public Criteria andPlatformAccountIdIn(List<String> values) {
            addCriterion("platform_account_id in", values, "platformAccountId");
            return (Criteria) this;
        }

        public Criteria andPlatformAccountIdNotIn(List<String> values) {
            addCriterion("platform_account_id not in", values, "platformAccountId");
            return (Criteria) this;
        }

        public Criteria andPlatformAccountIdBetween(String value1, String value2) {
            addCriterion("platform_account_id between", value1, value2, "platformAccountId");
            return (Criteria) this;
        }

        public Criteria andPlatformAccountIdNotBetween(String value1, String value2) {
            addCriterion("platform_account_id not between", value1, value2, "platformAccountId");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNull() {
            addCriterion("account_name is null");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNotNull() {
            addCriterion("account_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNameEqualTo(String value) {
            addCriterion("account_name =", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotEqualTo(String value) {
            addCriterion("account_name <>", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThan(String value) {
            addCriterion("account_name >", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("account_name >=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThan(String value) {
            addCriterion("account_name <", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThanOrEqualTo(String value) {
            addCriterion("account_name <=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLike(String value) {
            addCriterion("account_name like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotLike(String value) {
            addCriterion("account_name not like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameIn(List<String> values) {
            addCriterion("account_name in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotIn(List<String> values) {
            addCriterion("account_name not in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameBetween(String value1, String value2) {
            addCriterion("account_name between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotBetween(String value1, String value2) {
            addCriterion("account_name not between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andOptStatusIsNull() {
            addCriterion("opt_status is null");
            return (Criteria) this;
        }

        public Criteria andOptStatusIsNotNull() {
            addCriterion("opt_status is not null");
            return (Criteria) this;
        }

        public Criteria andOptStatusEqualTo(Short value) {
            addCriterion("opt_status =", value, "optStatus");
            return (Criteria) this;
        }

        public Criteria andOptStatusNotEqualTo(Short value) {
            addCriterion("opt_status <>", value, "optStatus");
            return (Criteria) this;
        }

        public Criteria andOptStatusGreaterThan(Short value) {
            addCriterion("opt_status >", value, "optStatus");
            return (Criteria) this;
        }

        public Criteria andOptStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("opt_status >=", value, "optStatus");
            return (Criteria) this;
        }

        public Criteria andOptStatusLessThan(Short value) {
            addCriterion("opt_status <", value, "optStatus");
            return (Criteria) this;
        }

        public Criteria andOptStatusLessThanOrEqualTo(Short value) {
            addCriterion("opt_status <=", value, "optStatus");
            return (Criteria) this;
        }

        public Criteria andOptStatusIn(List<Short> values) {
            addCriterion("opt_status in", values, "optStatus");
            return (Criteria) this;
        }

        public Criteria andOptStatusNotIn(List<Short> values) {
            addCriterion("opt_status not in", values, "optStatus");
            return (Criteria) this;
        }

        public Criteria andOptStatusBetween(Short value1, Short value2) {
            addCriterion("opt_status between", value1, value2, "optStatus");
            return (Criteria) this;
        }

        public Criteria andOptStatusNotBetween(Short value1, Short value2) {
            addCriterion("opt_status not between", value1, value2, "optStatus");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAddedPaymentIsNull() {
            addCriterion("added_payment is null");
            return (Criteria) this;
        }

        public Criteria andAddedPaymentIsNotNull() {
            addCriterion("added_payment is not null");
            return (Criteria) this;
        }

        public Criteria andAddedPaymentEqualTo(Double value) {
            addCriterion("added_payment =", value, "addedPayment");
            return (Criteria) this;
        }

        public Criteria andAddedPaymentNotEqualTo(Double value) {
            addCriterion("added_payment <>", value, "addedPayment");
            return (Criteria) this;
        }

        public Criteria andAddedPaymentGreaterThan(Double value) {
            addCriterion("added_payment >", value, "addedPayment");
            return (Criteria) this;
        }

        public Criteria andAddedPaymentGreaterThanOrEqualTo(Double value) {
            addCriterion("added_payment >=", value, "addedPayment");
            return (Criteria) this;
        }

        public Criteria andAddedPaymentLessThan(Double value) {
            addCriterion("added_payment <", value, "addedPayment");
            return (Criteria) this;
        }

        public Criteria andAddedPaymentLessThanOrEqualTo(Double value) {
            addCriterion("added_payment <=", value, "addedPayment");
            return (Criteria) this;
        }

        public Criteria andAddedPaymentIn(List<Double> values) {
            addCriterion("added_payment in", values, "addedPayment");
            return (Criteria) this;
        }

        public Criteria andAddedPaymentNotIn(List<Double> values) {
            addCriterion("added_payment not in", values, "addedPayment");
            return (Criteria) this;
        }

        public Criteria andAddedPaymentBetween(Double value1, Double value2) {
            addCriterion("added_payment between", value1, value2, "addedPayment");
            return (Criteria) this;
        }

        public Criteria andAddedPaymentNotBetween(Double value1, Double value2) {
            addCriterion("added_payment not between", value1, value2, "addedPayment");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(Double value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(Double value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(Double value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(Double value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(Double value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(Double value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<Double> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<Double> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(Double value1, Double value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(Double value1, Double value2) {
            addCriterion("balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBudgetIsNull() {
            addCriterion("budget is null");
            return (Criteria) this;
        }

        public Criteria andBudgetIsNotNull() {
            addCriterion("budget is not null");
            return (Criteria) this;
        }

        public Criteria andBudgetEqualTo(Double value) {
            addCriterion("budget =", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetNotEqualTo(Double value) {
            addCriterion("budget <>", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetGreaterThan(Double value) {
            addCriterion("budget >", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetGreaterThanOrEqualTo(Double value) {
            addCriterion("budget >=", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetLessThan(Double value) {
            addCriterion("budget <", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetLessThanOrEqualTo(Double value) {
            addCriterion("budget <=", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetIn(List<Double> values) {
            addCriterion("budget in", values, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetNotIn(List<Double> values) {
            addCriterion("budget not in", values, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetBetween(Double value1, Double value2) {
            addCriterion("budget between", value1, value2, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetNotBetween(Double value1, Double value2) {
            addCriterion("budget not between", value1, value2, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetModeIsNull() {
            addCriterion("budget_mode is null");
            return (Criteria) this;
        }

        public Criteria andBudgetModeIsNotNull() {
            addCriterion("budget_mode is not null");
            return (Criteria) this;
        }

        public Criteria andBudgetModeEqualTo(Short value) {
            addCriterion("budget_mode =", value, "budgetMode");
            return (Criteria) this;
        }

        public Criteria andBudgetModeNotEqualTo(Short value) {
            addCriterion("budget_mode <>", value, "budgetMode");
            return (Criteria) this;
        }

        public Criteria andBudgetModeGreaterThan(Short value) {
            addCriterion("budget_mode >", value, "budgetMode");
            return (Criteria) this;
        }

        public Criteria andBudgetModeGreaterThanOrEqualTo(Short value) {
            addCriterion("budget_mode >=", value, "budgetMode");
            return (Criteria) this;
        }

        public Criteria andBudgetModeLessThan(Short value) {
            addCriterion("budget_mode <", value, "budgetMode");
            return (Criteria) this;
        }

        public Criteria andBudgetModeLessThanOrEqualTo(Short value) {
            addCriterion("budget_mode <=", value, "budgetMode");
            return (Criteria) this;
        }

        public Criteria andBudgetModeIn(List<Short> values) {
            addCriterion("budget_mode in", values, "budgetMode");
            return (Criteria) this;
        }

        public Criteria andBudgetModeNotIn(List<Short> values) {
            addCriterion("budget_mode not in", values, "budgetMode");
            return (Criteria) this;
        }

        public Criteria andBudgetModeBetween(Short value1, Short value2) {
            addCriterion("budget_mode between", value1, value2, "budgetMode");
            return (Criteria) this;
        }

        public Criteria andBudgetModeNotBetween(Short value1, Short value2) {
            addCriterion("budget_mode not between", value1, value2, "budgetMode");
            return (Criteria) this;
        }

        public Criteria andRegionTargetIsNull() {
            addCriterion("region_target is null");
            return (Criteria) this;
        }

        public Criteria andRegionTargetIsNotNull() {
            addCriterion("region_target is not null");
            return (Criteria) this;
        }

        public Criteria andRegionTargetEqualTo(String value) {
            addCriterion("region_target =", value, "regionTarget");
            return (Criteria) this;
        }

        public Criteria andRegionTargetNotEqualTo(String value) {
            addCriterion("region_target <>", value, "regionTarget");
            return (Criteria) this;
        }

        public Criteria andRegionTargetGreaterThan(String value) {
            addCriterion("region_target >", value, "regionTarget");
            return (Criteria) this;
        }

        public Criteria andRegionTargetGreaterThanOrEqualTo(String value) {
            addCriterion("region_target >=", value, "regionTarget");
            return (Criteria) this;
        }

        public Criteria andRegionTargetLessThan(String value) {
            addCriterion("region_target <", value, "regionTarget");
            return (Criteria) this;
        }

        public Criteria andRegionTargetLessThanOrEqualTo(String value) {
            addCriterion("region_target <=", value, "regionTarget");
            return (Criteria) this;
        }

        public Criteria andRegionTargetLike(String value) {
            addCriterion("region_target like", value, "regionTarget");
            return (Criteria) this;
        }

        public Criteria andRegionTargetNotLike(String value) {
            addCriterion("region_target not like", value, "regionTarget");
            return (Criteria) this;
        }

        public Criteria andRegionTargetIn(List<String> values) {
            addCriterion("region_target in", values, "regionTarget");
            return (Criteria) this;
        }

        public Criteria andRegionTargetNotIn(List<String> values) {
            addCriterion("region_target not in", values, "regionTarget");
            return (Criteria) this;
        }

        public Criteria andRegionTargetBetween(String value1, String value2) {
            addCriterion("region_target between", value1, value2, "regionTarget");
            return (Criteria) this;
        }

        public Criteria andRegionTargetNotBetween(String value1, String value2) {
            addCriterion("region_target not between", value1, value2, "regionTarget");
            return (Criteria) this;
        }

        public Criteria andExcludeIpIsNull() {
            addCriterion("exclude_ip is null");
            return (Criteria) this;
        }

        public Criteria andExcludeIpIsNotNull() {
            addCriterion("exclude_ip is not null");
            return (Criteria) this;
        }

        public Criteria andExcludeIpEqualTo(String value) {
            addCriterion("exclude_ip =", value, "excludeIp");
            return (Criteria) this;
        }

        public Criteria andExcludeIpNotEqualTo(String value) {
            addCriterion("exclude_ip <>", value, "excludeIp");
            return (Criteria) this;
        }

        public Criteria andExcludeIpGreaterThan(String value) {
            addCriterion("exclude_ip >", value, "excludeIp");
            return (Criteria) this;
        }

        public Criteria andExcludeIpGreaterThanOrEqualTo(String value) {
            addCriterion("exclude_ip >=", value, "excludeIp");
            return (Criteria) this;
        }

        public Criteria andExcludeIpLessThan(String value) {
            addCriterion("exclude_ip <", value, "excludeIp");
            return (Criteria) this;
        }

        public Criteria andExcludeIpLessThanOrEqualTo(String value) {
            addCriterion("exclude_ip <=", value, "excludeIp");
            return (Criteria) this;
        }

        public Criteria andExcludeIpLike(String value) {
            addCriterion("exclude_ip like", value, "excludeIp");
            return (Criteria) this;
        }

        public Criteria andExcludeIpNotLike(String value) {
            addCriterion("exclude_ip not like", value, "excludeIp");
            return (Criteria) this;
        }

        public Criteria andExcludeIpIn(List<String> values) {
            addCriterion("exclude_ip in", values, "excludeIp");
            return (Criteria) this;
        }

        public Criteria andExcludeIpNotIn(List<String> values) {
            addCriterion("exclude_ip not in", values, "excludeIp");
            return (Criteria) this;
        }

        public Criteria andExcludeIpBetween(String value1, String value2) {
            addCriterion("exclude_ip between", value1, value2, "excludeIp");
            return (Criteria) this;
        }

        public Criteria andExcludeIpNotBetween(String value1, String value2) {
            addCriterion("exclude_ip not between", value1, value2, "excludeIp");
            return (Criteria) this;
        }

        public Criteria andBudgetOfflineTimeIsNull() {
            addCriterion("budget_offline_time is null");
            return (Criteria) this;
        }

        public Criteria andBudgetOfflineTimeIsNotNull() {
            addCriterion("budget_offline_time is not null");
            return (Criteria) this;
        }

        public Criteria andBudgetOfflineTimeEqualTo(String value) {
            addCriterion("budget_offline_time =", value, "budgetOfflineTime");
            return (Criteria) this;
        }

        public Criteria andBudgetOfflineTimeNotEqualTo(String value) {
            addCriterion("budget_offline_time <>", value, "budgetOfflineTime");
            return (Criteria) this;
        }

        public Criteria andBudgetOfflineTimeGreaterThan(String value) {
            addCriterion("budget_offline_time >", value, "budgetOfflineTime");
            return (Criteria) this;
        }

        public Criteria andBudgetOfflineTimeGreaterThanOrEqualTo(String value) {
            addCriterion("budget_offline_time >=", value, "budgetOfflineTime");
            return (Criteria) this;
        }

        public Criteria andBudgetOfflineTimeLessThan(String value) {
            addCriterion("budget_offline_time <", value, "budgetOfflineTime");
            return (Criteria) this;
        }

        public Criteria andBudgetOfflineTimeLessThanOrEqualTo(String value) {
            addCriterion("budget_offline_time <=", value, "budgetOfflineTime");
            return (Criteria) this;
        }

        public Criteria andBudgetOfflineTimeLike(String value) {
            addCriterion("budget_offline_time like", value, "budgetOfflineTime");
            return (Criteria) this;
        }

        public Criteria andBudgetOfflineTimeNotLike(String value) {
            addCriterion("budget_offline_time not like", value, "budgetOfflineTime");
            return (Criteria) this;
        }

        public Criteria andBudgetOfflineTimeIn(List<String> values) {
            addCriterion("budget_offline_time in", values, "budgetOfflineTime");
            return (Criteria) this;
        }

        public Criteria andBudgetOfflineTimeNotIn(List<String> values) {
            addCriterion("budget_offline_time not in", values, "budgetOfflineTime");
            return (Criteria) this;
        }

        public Criteria andBudgetOfflineTimeBetween(String value1, String value2) {
            addCriterion("budget_offline_time between", value1, value2, "budgetOfflineTime");
            return (Criteria) this;
        }

        public Criteria andBudgetOfflineTimeNotBetween(String value1, String value2) {
            addCriterion("budget_offline_time not between", value1, value2, "budgetOfflineTime");
            return (Criteria) this;
        }

        public Criteria andRegionPriceFactorIsNull() {
            addCriterion("region_price_factor is null");
            return (Criteria) this;
        }

        public Criteria andRegionPriceFactorIsNotNull() {
            addCriterion("region_price_factor is not null");
            return (Criteria) this;
        }

        public Criteria andRegionPriceFactorEqualTo(String value) {
            addCriterion("region_price_factor =", value, "regionPriceFactor");
            return (Criteria) this;
        }

        public Criteria andRegionPriceFactorNotEqualTo(String value) {
            addCriterion("region_price_factor <>", value, "regionPriceFactor");
            return (Criteria) this;
        }

        public Criteria andRegionPriceFactorGreaterThan(String value) {
            addCriterion("region_price_factor >", value, "regionPriceFactor");
            return (Criteria) this;
        }

        public Criteria andRegionPriceFactorGreaterThanOrEqualTo(String value) {
            addCriterion("region_price_factor >=", value, "regionPriceFactor");
            return (Criteria) this;
        }

        public Criteria andRegionPriceFactorLessThan(String value) {
            addCriterion("region_price_factor <", value, "regionPriceFactor");
            return (Criteria) this;
        }

        public Criteria andRegionPriceFactorLessThanOrEqualTo(String value) {
            addCriterion("region_price_factor <=", value, "regionPriceFactor");
            return (Criteria) this;
        }

        public Criteria andRegionPriceFactorLike(String value) {
            addCriterion("region_price_factor like", value, "regionPriceFactor");
            return (Criteria) this;
        }

        public Criteria andRegionPriceFactorNotLike(String value) {
            addCriterion("region_price_factor not like", value, "regionPriceFactor");
            return (Criteria) this;
        }

        public Criteria andRegionPriceFactorIn(List<String> values) {
            addCriterion("region_price_factor in", values, "regionPriceFactor");
            return (Criteria) this;
        }

        public Criteria andRegionPriceFactorNotIn(List<String> values) {
            addCriterion("region_price_factor not in", values, "regionPriceFactor");
            return (Criteria) this;
        }

        public Criteria andRegionPriceFactorBetween(String value1, String value2) {
            addCriterion("region_price_factor between", value1, value2, "regionPriceFactor");
            return (Criteria) this;
        }

        public Criteria andRegionPriceFactorNotBetween(String value1, String value2) {
            addCriterion("region_price_factor not between", value1, value2, "regionPriceFactor");
            return (Criteria) this;
        }

        public Criteria andUserLevelIsNull() {
            addCriterion("user_level is null");
            return (Criteria) this;
        }

        public Criteria andUserLevelIsNotNull() {
            addCriterion("user_level is not null");
            return (Criteria) this;
        }

        public Criteria andUserLevelEqualTo(Short value) {
            addCriterion("user_level =", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotEqualTo(Short value) {
            addCriterion("user_level <>", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelGreaterThan(Short value) {
            addCriterion("user_level >", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelGreaterThanOrEqualTo(Short value) {
            addCriterion("user_level >=", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLessThan(Short value) {
            addCriterion("user_level <", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLessThanOrEqualTo(Short value) {
            addCriterion("user_level <=", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelIn(List<Short> values) {
            addCriterion("user_level in", values, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotIn(List<Short> values) {
            addCriterion("user_level not in", values, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelBetween(Short value1, Short value2) {
            addCriterion("user_level between", value1, value2, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotBetween(Short value1, Short value2) {
            addCriterion("user_level not between", value1, value2, "userLevel");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andMediaCreateTimeIsNull() {
            addCriterion("media_create_time is null");
            return (Criteria) this;
        }

        public Criteria andMediaCreateTimeIsNotNull() {
            addCriterion("media_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andMediaCreateTimeEqualTo(Date value) {
            addCriterion("media_create_time =", value, "mediaCreateTime");
            return (Criteria) this;
        }

        public Criteria andMediaCreateTimeNotEqualTo(Date value) {
            addCriterion("media_create_time <>", value, "mediaCreateTime");
            return (Criteria) this;
        }

        public Criteria andMediaCreateTimeGreaterThan(Date value) {
            addCriterion("media_create_time >", value, "mediaCreateTime");
            return (Criteria) this;
        }

        public Criteria andMediaCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("media_create_time >=", value, "mediaCreateTime");
            return (Criteria) this;
        }

        public Criteria andMediaCreateTimeLessThan(Date value) {
            addCriterion("media_create_time <", value, "mediaCreateTime");
            return (Criteria) this;
        }

        public Criteria andMediaCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("media_create_time <=", value, "mediaCreateTime");
            return (Criteria) this;
        }

        public Criteria andMediaCreateTimeIn(List<Date> values) {
            addCriterion("media_create_time in", values, "mediaCreateTime");
            return (Criteria) this;
        }

        public Criteria andMediaCreateTimeNotIn(List<Date> values) {
            addCriterion("media_create_time not in", values, "mediaCreateTime");
            return (Criteria) this;
        }

        public Criteria andMediaCreateTimeBetween(Date value1, Date value2) {
            addCriterion("media_create_time between", value1, value2, "mediaCreateTime");
            return (Criteria) this;
        }

        public Criteria andMediaCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("media_create_time not between", value1, value2, "mediaCreateTime");
            return (Criteria) this;
        }

        public Criteria andMediaUpdateTimeIsNull() {
            addCriterion("media_update_time is null");
            return (Criteria) this;
        }

        public Criteria andMediaUpdateTimeIsNotNull() {
            addCriterion("media_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andMediaUpdateTimeEqualTo(Date value) {
            addCriterion("media_update_time =", value, "mediaUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMediaUpdateTimeNotEqualTo(Date value) {
            addCriterion("media_update_time <>", value, "mediaUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMediaUpdateTimeGreaterThan(Date value) {
            addCriterion("media_update_time >", value, "mediaUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMediaUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("media_update_time >=", value, "mediaUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMediaUpdateTimeLessThan(Date value) {
            addCriterion("media_update_time <", value, "mediaUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMediaUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("media_update_time <=", value, "mediaUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMediaUpdateTimeIn(List<Date> values) {
            addCriterion("media_update_time in", values, "mediaUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMediaUpdateTimeNotIn(List<Date> values) {
            addCriterion("media_update_time not in", values, "mediaUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMediaUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("media_update_time between", value1, value2, "mediaUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMediaUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("media_update_time not between", value1, value2, "mediaUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andSyncStatusIsNull() {
            addCriterion("sync_status is null");
            return (Criteria) this;
        }

        public Criteria andSyncStatusIsNotNull() {
            addCriterion("sync_status is not null");
            return (Criteria) this;
        }

        public Criteria andSyncStatusEqualTo(Byte value) {
            addCriterion("sync_status =", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusNotEqualTo(Byte value) {
            addCriterion("sync_status <>", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusGreaterThan(Byte value) {
            addCriterion("sync_status >", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("sync_status >=", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusLessThan(Byte value) {
            addCriterion("sync_status <", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusLessThanOrEqualTo(Byte value) {
            addCriterion("sync_status <=", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusIn(List<Byte> values) {
            addCriterion("sync_status in", values, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusNotIn(List<Byte> values) {
            addCriterion("sync_status not in", values, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusBetween(Byte value1, Byte value2) {
            addCriterion("sync_status between", value1, value2, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("sync_status not between", value1, value2, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncFailureIsNull() {
            addCriterion("sync_failure is null");
            return (Criteria) this;
        }

        public Criteria andSyncFailureIsNotNull() {
            addCriterion("sync_failure is not null");
            return (Criteria) this;
        }

        public Criteria andSyncFailureEqualTo(String value) {
            addCriterion("sync_failure =", value, "syncFailure");
            return (Criteria) this;
        }

        public Criteria andSyncFailureNotEqualTo(String value) {
            addCriterion("sync_failure <>", value, "syncFailure");
            return (Criteria) this;
        }

        public Criteria andSyncFailureGreaterThan(String value) {
            addCriterion("sync_failure >", value, "syncFailure");
            return (Criteria) this;
        }

        public Criteria andSyncFailureGreaterThanOrEqualTo(String value) {
            addCriterion("sync_failure >=", value, "syncFailure");
            return (Criteria) this;
        }

        public Criteria andSyncFailureLessThan(String value) {
            addCriterion("sync_failure <", value, "syncFailure");
            return (Criteria) this;
        }

        public Criteria andSyncFailureLessThanOrEqualTo(String value) {
            addCriterion("sync_failure <=", value, "syncFailure");
            return (Criteria) this;
        }

        public Criteria andSyncFailureLike(String value) {
            addCriterion("sync_failure like", value, "syncFailure");
            return (Criteria) this;
        }

        public Criteria andSyncFailureNotLike(String value) {
            addCriterion("sync_failure not like", value, "syncFailure");
            return (Criteria) this;
        }

        public Criteria andSyncFailureIn(List<String> values) {
            addCriterion("sync_failure in", values, "syncFailure");
            return (Criteria) this;
        }

        public Criteria andSyncFailureNotIn(List<String> values) {
            addCriterion("sync_failure not in", values, "syncFailure");
            return (Criteria) this;
        }

        public Criteria andSyncFailureBetween(String value1, String value2) {
            addCriterion("sync_failure between", value1, value2, "syncFailure");
            return (Criteria) this;
        }

        public Criteria andSyncFailureNotBetween(String value1, String value2) {
            addCriterion("sync_failure not between", value1, value2, "syncFailure");
            return (Criteria) this;
        }

        public Criteria andSyncTimeIsNull() {
            addCriterion("sync_time is null");
            return (Criteria) this;
        }

        public Criteria andSyncTimeIsNotNull() {
            addCriterion("sync_time is not null");
            return (Criteria) this;
        }

        public Criteria andSyncTimeEqualTo(Date value) {
            addCriterion("sync_time =", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeNotEqualTo(Date value) {
            addCriterion("sync_time <>", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeGreaterThan(Date value) {
            addCriterion("sync_time >", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sync_time >=", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeLessThan(Date value) {
            addCriterion("sync_time <", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeLessThanOrEqualTo(Date value) {
            addCriterion("sync_time <=", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeIn(List<Date> values) {
            addCriterion("sync_time in", values, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeNotIn(List<Date> values) {
            addCriterion("sync_time not in", values, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeBetween(Date value1, Date value2) {
            addCriterion("sync_time between", value1, value2, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeNotBetween(Date value1, Date value2) {
            addCriterion("sync_time not between", value1, value2, "syncTime");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Boolean value) {
            addCriterion("is_deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("is_deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("is_deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("is_deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Boolean> values) {
            addCriterion("is_deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Boolean> values) {
            addCriterion("is_deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andMediaInfoIsNull() {
            addCriterion("media_info is null");
            return (Criteria) this;
        }

        public Criteria andMediaInfoIsNotNull() {
            addCriterion("media_info is not null");
            return (Criteria) this;
        }

        public Criteria andMediaInfoEqualTo(String value) {
            addCriterion("media_info =", value, "mediaInfo");
            return (Criteria) this;
        }

        public Criteria andMediaInfoNotEqualTo(String value) {
            addCriterion("media_info <>", value, "mediaInfo");
            return (Criteria) this;
        }

        public Criteria andMediaInfoGreaterThan(String value) {
            addCriterion("media_info >", value, "mediaInfo");
            return (Criteria) this;
        }

        public Criteria andMediaInfoGreaterThanOrEqualTo(String value) {
            addCriterion("media_info >=", value, "mediaInfo");
            return (Criteria) this;
        }

        public Criteria andMediaInfoLessThan(String value) {
            addCriterion("media_info <", value, "mediaInfo");
            return (Criteria) this;
        }

        public Criteria andMediaInfoLessThanOrEqualTo(String value) {
            addCriterion("media_info <=", value, "mediaInfo");
            return (Criteria) this;
        }

        public Criteria andMediaInfoLike(String value) {
            addCriterion("media_info like", value, "mediaInfo");
            return (Criteria) this;
        }

        public Criteria andMediaInfoNotLike(String value) {
            addCriterion("media_info not like", value, "mediaInfo");
            return (Criteria) this;
        }

        public Criteria andMediaInfoIn(List<String> values) {
            addCriterion("media_info in", values, "mediaInfo");
            return (Criteria) this;
        }

        public Criteria andMediaInfoNotIn(List<String> values) {
            addCriterion("media_info not in", values, "mediaInfo");
            return (Criteria) this;
        }

        public Criteria andMediaInfoBetween(String value1, String value2) {
            addCriterion("media_info between", value1, value2, "mediaInfo");
            return (Criteria) this;
        }

        public Criteria andMediaInfoNotBetween(String value1, String value2) {
            addCriterion("media_info not between", value1, value2, "mediaInfo");
            return (Criteria) this;
        }

        public Criteria andBgIsNull() {
            addCriterion("bg is null");
            return (Criteria) this;
        }

        public Criteria andBgIsNotNull() {
            addCriterion("bg is not null");
            return (Criteria) this;
        }

        public Criteria andBgEqualTo(Short value) {
            addCriterion("bg =", value, "bg");
            return (Criteria) this;
        }

        public Criteria andBgNotEqualTo(Short value) {
            addCriterion("bg <>", value, "bg");
            return (Criteria) this;
        }

        public Criteria andBgGreaterThan(Short value) {
            addCriterion("bg >", value, "bg");
            return (Criteria) this;
        }

        public Criteria andBgGreaterThanOrEqualTo(Short value) {
            addCriterion("bg >=", value, "bg");
            return (Criteria) this;
        }

        public Criteria andBgLessThan(Short value) {
            addCriterion("bg <", value, "bg");
            return (Criteria) this;
        }

        public Criteria andBgLessThanOrEqualTo(Short value) {
            addCriterion("bg <=", value, "bg");
            return (Criteria) this;
        }

        public Criteria andBgIn(List<Short> values) {
            addCriterion("bg in", values, "bg");
            return (Criteria) this;
        }

        public Criteria andBgNotIn(List<Short> values) {
            addCriterion("bg not in", values, "bg");
            return (Criteria) this;
        }

        public Criteria andBgBetween(Short value1, Short value2) {
            addCriterion("bg between", value1, value2, "bg");
            return (Criteria) this;
        }

        public Criteria andBgNotBetween(Short value1, Short value2) {
            addCriterion("bg not between", value1, value2, "bg");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNull() {
            addCriterion("tenant_id is null");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNotNull() {
            addCriterion("tenant_id is not null");
            return (Criteria) this;
        }

        public Criteria andTenantIdEqualTo(Long value) {
            addCriterion("tenant_id =", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotEqualTo(Long value) {
            addCriterion("tenant_id <>", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThan(Long value) {
            addCriterion("tenant_id >", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tenant_id >=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThan(Long value) {
            addCriterion("tenant_id <", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThanOrEqualTo(Long value) {
            addCriterion("tenant_id <=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIn(List<Long> values) {
            addCriterion("tenant_id in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotIn(List<Long> values) {
            addCriterion("tenant_id not in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdBetween(Long value1, Long value2) {
            addCriterion("tenant_id between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotBetween(Long value1, Long value2) {
            addCriterion("tenant_id not between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andAppIsNull() {
            addCriterion("app is null");
            return (Criteria) this;
        }

        public Criteria andAppIsNotNull() {
            addCriterion("app is not null");
            return (Criteria) this;
        }

        public Criteria andAppEqualTo(String value) {
            addCriterion("app =", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppNotEqualTo(String value) {
            addCriterion("app <>", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppGreaterThan(String value) {
            addCriterion("app >", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppGreaterThanOrEqualTo(String value) {
            addCriterion("app >=", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppLessThan(String value) {
            addCriterion("app <", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppLessThanOrEqualTo(String value) {
            addCriterion("app <=", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppLike(String value) {
            addCriterion("app like", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppNotLike(String value) {
            addCriterion("app not like", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppIn(List<String> values) {
            addCriterion("app in", values, "app");
            return (Criteria) this;
        }

        public Criteria andAppNotIn(List<String> values) {
            addCriterion("app not in", values, "app");
            return (Criteria) this;
        }

        public Criteria andAppBetween(String value1, String value2) {
            addCriterion("app between", value1, value2, "app");
            return (Criteria) this;
        }

        public Criteria andAppNotBetween(String value1, String value2) {
            addCriterion("app not between", value1, value2, "app");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNull() {
            addCriterion("platform is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNotNull() {
            addCriterion("platform is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformEqualTo(String value) {
            addCriterion("platform =", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotEqualTo(String value) {
            addCriterion("platform <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThan(String value) {
            addCriterion("platform >", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThanOrEqualTo(String value) {
            addCriterion("platform >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThan(String value) {
            addCriterion("platform <", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThanOrEqualTo(String value) {
            addCriterion("platform <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLike(String value) {
            addCriterion("platform like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotLike(String value) {
            addCriterion("platform not like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformIn(List<String> values) {
            addCriterion("platform in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotIn(List<String> values) {
            addCriterion("platform not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformBetween(String value1, String value2) {
            addCriterion("platform between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotBetween(String value1, String value2) {
            addCriterion("platform not between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdIsNull() {
            addCriterion("delivery_id is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdIsNotNull() {
            addCriterion("delivery_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdEqualTo(Integer value) {
            addCriterion("delivery_id =", value, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdNotEqualTo(Integer value) {
            addCriterion("delivery_id <>", value, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdGreaterThan(Integer value) {
            addCriterion("delivery_id >", value, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("delivery_id >=", value, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdLessThan(Integer value) {
            addCriterion("delivery_id <", value, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdLessThanOrEqualTo(Integer value) {
            addCriterion("delivery_id <=", value, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdIn(List<Integer> values) {
            addCriterion("delivery_id in", values, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdNotIn(List<Integer> values) {
            addCriterion("delivery_id not in", values, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdBetween(Integer value1, Integer value2) {
            addCriterion("delivery_id between", value1, value2, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("delivery_id not between", value1, value2, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andCityTypeIdIsNull() {
            addCriterion("city_type_id is null");
            return (Criteria) this;
        }

        public Criteria andCityTypeIdIsNotNull() {
            addCriterion("city_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityTypeIdEqualTo(Integer value) {
            addCriterion("city_type_id =", value, "cityTypeId");
            return (Criteria) this;
        }

        public Criteria andCityTypeIdNotEqualTo(Integer value) {
            addCriterion("city_type_id <>", value, "cityTypeId");
            return (Criteria) this;
        }

        public Criteria andCityTypeIdGreaterThan(Integer value) {
            addCriterion("city_type_id >", value, "cityTypeId");
            return (Criteria) this;
        }

        public Criteria andCityTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_type_id >=", value, "cityTypeId");
            return (Criteria) this;
        }

        public Criteria andCityTypeIdLessThan(Integer value) {
            addCriterion("city_type_id <", value, "cityTypeId");
            return (Criteria) this;
        }

        public Criteria andCityTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("city_type_id <=", value, "cityTypeId");
            return (Criteria) this;
        }

        public Criteria andCityTypeIdIn(List<Integer> values) {
            addCriterion("city_type_id in", values, "cityTypeId");
            return (Criteria) this;
        }

        public Criteria andCityTypeIdNotIn(List<Integer> values) {
            addCriterion("city_type_id not in", values, "cityTypeId");
            return (Criteria) this;
        }

        public Criteria andCityTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("city_type_id between", value1, value2, "cityTypeId");
            return (Criteria) this;
        }

        public Criteria andCityTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("city_type_id not between", value1, value2, "cityTypeId");
            return (Criteria) this;
        }

        public Criteria andBgAliasIsNull() {
            addCriterion("bg_alias is null");
            return (Criteria) this;
        }

        public Criteria andBgAliasIsNotNull() {
            addCriterion("bg_alias is not null");
            return (Criteria) this;
        }

        public Criteria andBgAliasEqualTo(String value) {
            addCriterion("bg_alias =", value, "bgAlias");
            return (Criteria) this;
        }

        public Criteria andBgAliasNotEqualTo(String value) {
            addCriterion("bg_alias <>", value, "bgAlias");
            return (Criteria) this;
        }

        public Criteria andBgAliasGreaterThan(String value) {
            addCriterion("bg_alias >", value, "bgAlias");
            return (Criteria) this;
        }

        public Criteria andBgAliasGreaterThanOrEqualTo(String value) {
            addCriterion("bg_alias >=", value, "bgAlias");
            return (Criteria) this;
        }

        public Criteria andBgAliasLessThan(String value) {
            addCriterion("bg_alias <", value, "bgAlias");
            return (Criteria) this;
        }

        public Criteria andBgAliasLessThanOrEqualTo(String value) {
            addCriterion("bg_alias <=", value, "bgAlias");
            return (Criteria) this;
        }

        public Criteria andBgAliasLike(String value) {
            addCriterion("bg_alias like", value, "bgAlias");
            return (Criteria) this;
        }

        public Criteria andBgAliasNotLike(String value) {
            addCriterion("bg_alias not like", value, "bgAlias");
            return (Criteria) this;
        }

        public Criteria andBgAliasIn(List<String> values) {
            addCriterion("bg_alias in", values, "bgAlias");
            return (Criteria) this;
        }

        public Criteria andBgAliasNotIn(List<String> values) {
            addCriterion("bg_alias not in", values, "bgAlias");
            return (Criteria) this;
        }

        public Criteria andBgAliasBetween(String value1, String value2) {
            addCriterion("bg_alias between", value1, value2, "bgAlias");
            return (Criteria) this;
        }

        public Criteria andBgAliasNotBetween(String value1, String value2) {
            addCriterion("bg_alias not between", value1, value2, "bgAlias");
            return (Criteria) this;
        }

        public Criteria andManagerIsNull() {
            addCriterion("manager is null");
            return (Criteria) this;
        }

        public Criteria andManagerIsNotNull() {
            addCriterion("manager is not null");
            return (Criteria) this;
        }

        public Criteria andManagerEqualTo(String value) {
            addCriterion("manager =", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotEqualTo(String value) {
            addCriterion("manager <>", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerGreaterThan(String value) {
            addCriterion("manager >", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerGreaterThanOrEqualTo(String value) {
            addCriterion("manager >=", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerLessThan(String value) {
            addCriterion("manager <", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerLessThanOrEqualTo(String value) {
            addCriterion("manager <=", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerLike(String value) {
            addCriterion("manager like", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotLike(String value) {
            addCriterion("manager not like", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerIn(List<String> values) {
            addCriterion("manager in", values, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotIn(List<String> values) {
            addCriterion("manager not in", values, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerBetween(String value1, String value2) {
            addCriterion("manager between", value1, value2, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotBetween(String value1, String value2) {
            addCriterion("manager not between", value1, value2, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerIdIsNull() {
            addCriterion("manager_id is null");
            return (Criteria) this;
        }

        public Criteria andManagerIdIsNotNull() {
            addCriterion("manager_id is not null");
            return (Criteria) this;
        }

        public Criteria andManagerIdEqualTo(Integer value) {
            addCriterion("manager_id =", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotEqualTo(Integer value) {
            addCriterion("manager_id <>", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThan(Integer value) {
            addCriterion("manager_id >", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("manager_id >=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThan(Integer value) {
            addCriterion("manager_id <", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThanOrEqualTo(Integer value) {
            addCriterion("manager_id <=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdIn(List<Integer> values) {
            addCriterion("manager_id in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotIn(List<Integer> values) {
            addCriterion("manager_id not in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdBetween(Integer value1, Integer value2) {
            addCriterion("manager_id between", value1, value2, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("manager_id not between", value1, value2, "managerId");
            return (Criteria) this;
        }

        public Criteria andMaincateIsNull() {
            addCriterion("maincate is null");
            return (Criteria) this;
        }

        public Criteria andMaincateIsNotNull() {
            addCriterion("maincate is not null");
            return (Criteria) this;
        }

        public Criteria andMaincateEqualTo(String value) {
            addCriterion("maincate =", value, "maincate");
            return (Criteria) this;
        }

        public Criteria andMaincateNotEqualTo(String value) {
            addCriterion("maincate <>", value, "maincate");
            return (Criteria) this;
        }

        public Criteria andMaincateGreaterThan(String value) {
            addCriterion("maincate >", value, "maincate");
            return (Criteria) this;
        }

        public Criteria andMaincateGreaterThanOrEqualTo(String value) {
            addCriterion("maincate >=", value, "maincate");
            return (Criteria) this;
        }

        public Criteria andMaincateLessThan(String value) {
            addCriterion("maincate <", value, "maincate");
            return (Criteria) this;
        }

        public Criteria andMaincateLessThanOrEqualTo(String value) {
            addCriterion("maincate <=", value, "maincate");
            return (Criteria) this;
        }

        public Criteria andMaincateLike(String value) {
            addCriterion("maincate like", value, "maincate");
            return (Criteria) this;
        }

        public Criteria andMaincateNotLike(String value) {
            addCriterion("maincate not like", value, "maincate");
            return (Criteria) this;
        }

        public Criteria andMaincateIn(List<String> values) {
            addCriterion("maincate in", values, "maincate");
            return (Criteria) this;
        }

        public Criteria andMaincateNotIn(List<String> values) {
            addCriterion("maincate not in", values, "maincate");
            return (Criteria) this;
        }

        public Criteria andMaincateBetween(String value1, String value2) {
            addCriterion("maincate between", value1, value2, "maincate");
            return (Criteria) this;
        }

        public Criteria andMaincateNotBetween(String value1, String value2) {
            addCriterion("maincate not between", value1, value2, "maincate");
            return (Criteria) this;
        }

        public Criteria andMaincateIdIsNull() {
            addCriterion("maincate_id is null");
            return (Criteria) this;
        }

        public Criteria andMaincateIdIsNotNull() {
            addCriterion("maincate_id is not null");
            return (Criteria) this;
        }

        public Criteria andMaincateIdEqualTo(Integer value) {
            addCriterion("maincate_id =", value, "maincateId");
            return (Criteria) this;
        }

        public Criteria andMaincateIdNotEqualTo(Integer value) {
            addCriterion("maincate_id <>", value, "maincateId");
            return (Criteria) this;
        }

        public Criteria andMaincateIdGreaterThan(Integer value) {
            addCriterion("maincate_id >", value, "maincateId");
            return (Criteria) this;
        }

        public Criteria andMaincateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("maincate_id >=", value, "maincateId");
            return (Criteria) this;
        }

        public Criteria andMaincateIdLessThan(Integer value) {
            addCriterion("maincate_id <", value, "maincateId");
            return (Criteria) this;
        }

        public Criteria andMaincateIdLessThanOrEqualTo(Integer value) {
            addCriterion("maincate_id <=", value, "maincateId");
            return (Criteria) this;
        }

        public Criteria andMaincateIdIn(List<Integer> values) {
            addCriterion("maincate_id in", values, "maincateId");
            return (Criteria) this;
        }

        public Criteria andMaincateIdNotIn(List<Integer> values) {
            addCriterion("maincate_id not in", values, "maincateId");
            return (Criteria) this;
        }

        public Criteria andMaincateIdBetween(Integer value1, Integer value2) {
            addCriterion("maincate_id between", value1, value2, "maincateId");
            return (Criteria) this;
        }

        public Criteria andMaincateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("maincate_id not between", value1, value2, "maincateId");
            return (Criteria) this;
        }

        public Criteria andAdtypeIdIsNull() {
            addCriterion("adtype_id is null");
            return (Criteria) this;
        }

        public Criteria andAdtypeIdIsNotNull() {
            addCriterion("adtype_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdtypeIdEqualTo(Integer value) {
            addCriterion("adtype_id =", value, "adtypeId");
            return (Criteria) this;
        }

        public Criteria andAdtypeIdNotEqualTo(Integer value) {
            addCriterion("adtype_id <>", value, "adtypeId");
            return (Criteria) this;
        }

        public Criteria andAdtypeIdGreaterThan(Integer value) {
            addCriterion("adtype_id >", value, "adtypeId");
            return (Criteria) this;
        }

        public Criteria andAdtypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("adtype_id >=", value, "adtypeId");
            return (Criteria) this;
        }

        public Criteria andAdtypeIdLessThan(Integer value) {
            addCriterion("adtype_id <", value, "adtypeId");
            return (Criteria) this;
        }

        public Criteria andAdtypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("adtype_id <=", value, "adtypeId");
            return (Criteria) this;
        }

        public Criteria andAdtypeIdIn(List<Integer> values) {
            addCriterion("adtype_id in", values, "adtypeId");
            return (Criteria) this;
        }

        public Criteria andAdtypeIdNotIn(List<Integer> values) {
            addCriterion("adtype_id not in", values, "adtypeId");
            return (Criteria) this;
        }

        public Criteria andAdtypeIdBetween(Integer value1, Integer value2) {
            addCriterion("adtype_id between", value1, value2, "adtypeId");
            return (Criteria) this;
        }

        public Criteria andAdtypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("adtype_id not between", value1, value2, "adtypeId");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNull() {
            addCriterion("resource_id is null");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNotNull() {
            addCriterion("resource_id is not null");
            return (Criteria) this;
        }

        public Criteria andResourceIdEqualTo(Integer value) {
            addCriterion("resource_id =", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotEqualTo(Integer value) {
            addCriterion("resource_id <>", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThan(Integer value) {
            addCriterion("resource_id >", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("resource_id >=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThan(Integer value) {
            addCriterion("resource_id <", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThanOrEqualTo(Integer value) {
            addCriterion("resource_id <=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdIn(List<Integer> values) {
            addCriterion("resource_id in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotIn(List<Integer> values) {
            addCriterion("resource_id not in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdBetween(Integer value1, Integer value2) {
            addCriterion("resource_id between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("resource_id not between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andSuperAccountIdIsNull() {
            addCriterion("super_account_id is null");
            return (Criteria) this;
        }

        public Criteria andSuperAccountIdIsNotNull() {
            addCriterion("super_account_id is not null");
            return (Criteria) this;
        }

        public Criteria andSuperAccountIdEqualTo(Long value) {
            addCriterion("super_account_id =", value, "superAccountId");
            return (Criteria) this;
        }

        public Criteria andSuperAccountIdNotEqualTo(Long value) {
            addCriterion("super_account_id <>", value, "superAccountId");
            return (Criteria) this;
        }

        public Criteria andSuperAccountIdGreaterThan(Long value) {
            addCriterion("super_account_id >", value, "superAccountId");
            return (Criteria) this;
        }

        public Criteria andSuperAccountIdGreaterThanOrEqualTo(Long value) {
            addCriterion("super_account_id >=", value, "superAccountId");
            return (Criteria) this;
        }

        public Criteria andSuperAccountIdLessThan(Long value) {
            addCriterion("super_account_id <", value, "superAccountId");
            return (Criteria) this;
        }

        public Criteria andSuperAccountIdLessThanOrEqualTo(Long value) {
            addCriterion("super_account_id <=", value, "superAccountId");
            return (Criteria) this;
        }

        public Criteria andSuperAccountIdIn(List<Long> values) {
            addCriterion("super_account_id in", values, "superAccountId");
            return (Criteria) this;
        }

        public Criteria andSuperAccountIdNotIn(List<Long> values) {
            addCriterion("super_account_id not in", values, "superAccountId");
            return (Criteria) this;
        }

        public Criteria andSuperAccountIdBetween(Long value1, Long value2) {
            addCriterion("super_account_id between", value1, value2, "superAccountId");
            return (Criteria) this;
        }

        public Criteria andSuperAccountIdNotBetween(Long value1, Long value2) {
            addCriterion("super_account_id not between", value1, value2, "superAccountId");
            return (Criteria) this;
        }

        public Criteria andAuthInfoIsNull() {
            addCriterion("auth_info is null");
            return (Criteria) this;
        }

        public Criteria andAuthInfoIsNotNull() {
            addCriterion("auth_info is not null");
            return (Criteria) this;
        }

        public Criteria andAuthInfoEqualTo(String value) {
            addCriterion("auth_info =", value, "authInfo");
            return (Criteria) this;
        }

        public Criteria andAuthInfoNotEqualTo(String value) {
            addCriterion("auth_info <>", value, "authInfo");
            return (Criteria) this;
        }

        public Criteria andAuthInfoGreaterThan(String value) {
            addCriterion("auth_info >", value, "authInfo");
            return (Criteria) this;
        }

        public Criteria andAuthInfoGreaterThanOrEqualTo(String value) {
            addCriterion("auth_info >=", value, "authInfo");
            return (Criteria) this;
        }

        public Criteria andAuthInfoLessThan(String value) {
            addCriterion("auth_info <", value, "authInfo");
            return (Criteria) this;
        }

        public Criteria andAuthInfoLessThanOrEqualTo(String value) {
            addCriterion("auth_info <=", value, "authInfo");
            return (Criteria) this;
        }

        public Criteria andAuthInfoLike(String value) {
            addCriterion("auth_info like", value, "authInfo");
            return (Criteria) this;
        }

        public Criteria andAuthInfoNotLike(String value) {
            addCriterion("auth_info not like", value, "authInfo");
            return (Criteria) this;
        }

        public Criteria andAuthInfoIn(List<String> values) {
            addCriterion("auth_info in", values, "authInfo");
            return (Criteria) this;
        }

        public Criteria andAuthInfoNotIn(List<String> values) {
            addCriterion("auth_info not in", values, "authInfo");
            return (Criteria) this;
        }

        public Criteria andAuthInfoBetween(String value1, String value2) {
            addCriterion("auth_info between", value1, value2, "authInfo");
            return (Criteria) this;
        }

        public Criteria andAuthInfoNotBetween(String value1, String value2) {
            addCriterion("auth_info not between", value1, value2, "authInfo");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("create_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("create_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(Long value) {
            addCriterion("create_user_id =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(Long value) {
            addCriterion("create_user_id <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(Long value) {
            addCriterion("create_user_id >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("create_user_id >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(Long value) {
            addCriterion("create_user_id <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(Long value) {
            addCriterion("create_user_id <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<Long> values) {
            addCriterion("create_user_id in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<Long> values) {
            addCriterion("create_user_id not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(Long value1, Long value2) {
            addCriterion("create_user_id between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(Long value1, Long value2) {
            addCriterion("create_user_id not between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNull() {
            addCriterion("update_user_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNotNull() {
            addCriterion("update_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdEqualTo(Long value) {
            addCriterion("update_user_id =", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotEqualTo(Long value) {
            addCriterion("update_user_id <>", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThan(Long value) {
            addCriterion("update_user_id >", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("update_user_id >=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThan(Long value) {
            addCriterion("update_user_id <", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThanOrEqualTo(Long value) {
            addCriterion("update_user_id <=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIn(List<Long> values) {
            addCriterion("update_user_id in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotIn(List<Long> values) {
            addCriterion("update_user_id not in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdBetween(Long value1, Long value2) {
            addCriterion("update_user_id between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotBetween(Long value1, Long value2) {
            addCriterion("update_user_id not between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andBgDirectionIsNull() {
            addCriterion("bg_direction is null");
            return (Criteria) this;
        }

        public Criteria andBgDirectionIsNotNull() {
            addCriterion("bg_direction is not null");
            return (Criteria) this;
        }

        public Criteria andBgDirectionEqualTo(String value) {
            addCriterion("bg_direction =", value, "bgDirection");
            return (Criteria) this;
        }

        public Criteria andBgDirectionNotEqualTo(String value) {
            addCriterion("bg_direction <>", value, "bgDirection");
            return (Criteria) this;
        }

        public Criteria andBgDirectionGreaterThan(String value) {
            addCriterion("bg_direction >", value, "bgDirection");
            return (Criteria) this;
        }

        public Criteria andBgDirectionGreaterThanOrEqualTo(String value) {
            addCriterion("bg_direction >=", value, "bgDirection");
            return (Criteria) this;
        }

        public Criteria andBgDirectionLessThan(String value) {
            addCriterion("bg_direction <", value, "bgDirection");
            return (Criteria) this;
        }

        public Criteria andBgDirectionLessThanOrEqualTo(String value) {
            addCriterion("bg_direction <=", value, "bgDirection");
            return (Criteria) this;
        }

        public Criteria andBgDirectionLike(String value) {
            addCriterion("bg_direction like", value, "bgDirection");
            return (Criteria) this;
        }

        public Criteria andBgDirectionNotLike(String value) {
            addCriterion("bg_direction not like", value, "bgDirection");
            return (Criteria) this;
        }

        public Criteria andBgDirectionIn(List<String> values) {
            addCriterion("bg_direction in", values, "bgDirection");
            return (Criteria) this;
        }

        public Criteria andBgDirectionNotIn(List<String> values) {
            addCriterion("bg_direction not in", values, "bgDirection");
            return (Criteria) this;
        }

        public Criteria andBgDirectionBetween(String value1, String value2) {
            addCriterion("bg_direction between", value1, value2, "bgDirection");
            return (Criteria) this;
        }

        public Criteria andBgDirectionNotBetween(String value1, String value2) {
            addCriterion("bg_direction not between", value1, value2, "bgDirection");
            return (Criteria) this;
        }

        public Criteria andBgDirectionIdIsNull() {
            addCriterion("bg_direction_id is null");
            return (Criteria) this;
        }

        public Criteria andBgDirectionIdIsNotNull() {
            addCriterion("bg_direction_id is not null");
            return (Criteria) this;
        }

        public Criteria andBgDirectionIdEqualTo(Integer value) {
            addCriterion("bg_direction_id =", value, "bgDirectionId");
            return (Criteria) this;
        }

        public Criteria andBgDirectionIdNotEqualTo(Integer value) {
            addCriterion("bg_direction_id <>", value, "bgDirectionId");
            return (Criteria) this;
        }

        public Criteria andBgDirectionIdGreaterThan(Integer value) {
            addCriterion("bg_direction_id >", value, "bgDirectionId");
            return (Criteria) this;
        }

        public Criteria andBgDirectionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bg_direction_id >=", value, "bgDirectionId");
            return (Criteria) this;
        }

        public Criteria andBgDirectionIdLessThan(Integer value) {
            addCriterion("bg_direction_id <", value, "bgDirectionId");
            return (Criteria) this;
        }

        public Criteria andBgDirectionIdLessThanOrEqualTo(Integer value) {
            addCriterion("bg_direction_id <=", value, "bgDirectionId");
            return (Criteria) this;
        }

        public Criteria andBgDirectionIdIn(List<Integer> values) {
            addCriterion("bg_direction_id in", values, "bgDirectionId");
            return (Criteria) this;
        }

        public Criteria andBgDirectionIdNotIn(List<Integer> values) {
            addCriterion("bg_direction_id not in", values, "bgDirectionId");
            return (Criteria) this;
        }

        public Criteria andBgDirectionIdBetween(Integer value1, Integer value2) {
            addCriterion("bg_direction_id between", value1, value2, "bgDirectionId");
            return (Criteria) this;
        }

        public Criteria andBgDirectionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bg_direction_id not between", value1, value2, "bgDirectionId");
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