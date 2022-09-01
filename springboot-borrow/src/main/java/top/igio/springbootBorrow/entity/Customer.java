package top.igio.springbootBorrow.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 客户信息表
 * @TableName customer
 */
public class Customer implements Serializable {
    /**
     * 客户ID
     */
    private Long customerId;

    /**
     * 客户姓名
     */
    private String customerName;

    /**
     * 客户等级(1是最低，依次递增)
     */
    private Integer customerGrade;

    /**
     * 客户创建时间
     */
    private Date createTime;

    /**
     * 客户修改时间
     */
    private Date updateTime;

    /**
     * 逻辑删除(0是未删除，1是删除)
     */
    private Integer isDeleted;

    private List<Account> accounts;

    private static final long serialVersionUID = 1L;

    /**
     * 客户ID
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * 客户ID
     */
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    /**
     * 客户姓名
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * 客户姓名
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * 客户等级(1是最低，依次递增)
     */
    public Integer getCustomerGrade() {
        return customerGrade;
    }

    /**
     * 客户等级(1是最低，依次递增)
     */
    public void setCustomerGrade(Integer customerGrade) {
        this.customerGrade = customerGrade;
    }

    /**
     * 客户创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 客户创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 客户修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 客户修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 逻辑删除(0是未删除，1是删除)
     */
    public Integer getIsDeleted() {
        return isDeleted;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerGrade=" + customerGrade +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", isDeleted=" + isDeleted +
                ", accounts=" + accounts +
                '}';
    }

    /**
     * 逻辑删除(0是未删除，1是删除)
     */
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Customer other = (Customer) that;
        return (this.getCustomerId() == null ? other.getCustomerId() == null : this.getCustomerId().equals(other.getCustomerId()))
            && (this.getCustomerName() == null ? other.getCustomerName() == null : this.getCustomerName().equals(other.getCustomerName()))
            && (this.getCustomerGrade() == null ? other.getCustomerGrade() == null : this.getCustomerGrade().equals(other.getCustomerGrade()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        result = prime * result + ((getCustomerName() == null) ? 0 : getCustomerName().hashCode());
        result = prime * result + ((getCustomerGrade() == null) ? 0 : getCustomerGrade().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        return result;
    }

}