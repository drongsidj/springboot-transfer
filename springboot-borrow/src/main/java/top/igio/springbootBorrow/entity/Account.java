package top.igio.springbootBorrow.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 账户信息表
 * @TableName account
 */
public class Account implements Serializable {
    /**
     * 账号ID
     */
    private Long accountId;

    /**
     * 账号别名
     */
    private String accountName;

    /**
     * 客户ID
     */
    private Long customerId;

    /**
     * 账户余额
     */
    private BigDecimal balance;

    /**
     * 可用余额
     */
    private BigDecimal availableBalance;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 逻辑删除(0是未删除，1是删除)
     */
    private Integer isDeleted;

    private static final long serialVersionUID = 1L;

    /**
     * 账号ID
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * 账号ID
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /**
     * 账号别名
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * 账号别名
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

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
     * 账户余额
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * 账户余额
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * 可用余额
     */
    public BigDecimal getAvailableBalance() {
        return availableBalance;
    }

    /**
     * 可用余额
     */
    public void setAvailableBalance(BigDecimal availableBalance) {
        this.availableBalance = availableBalance;
    }

    /**
     * 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 修改时间
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
        Account other = (Account) that;
        return (this.getAccountId() == null ? other.getAccountId() == null : this.getAccountId().equals(other.getAccountId()))
            && (this.getAccountName() == null ? other.getAccountName() == null : this.getAccountName().equals(other.getAccountName()))
            && (this.getCustomerId() == null ? other.getCustomerId() == null : this.getCustomerId().equals(other.getCustomerId()))
            && (this.getBalance() == null ? other.getBalance() == null : this.getBalance().equals(other.getBalance()))
            && (this.getAvailableBalance() == null ? other.getAvailableBalance() == null : this.getAvailableBalance().equals(other.getAvailableBalance()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        result = prime * result + ((getAccountName() == null) ? 0 : getAccountName().hashCode());
        result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        result = prime * result + ((getBalance() == null) ? 0 : getBalance().hashCode());
        result = prime * result + ((getAvailableBalance() == null) ? 0 : getAvailableBalance().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", accountId=").append(accountId);
        sb.append(", accountName=").append(accountName);
        sb.append(", customerId=").append(customerId);
        sb.append(", balance=").append(balance);
        sb.append(", availableBalance=").append(availableBalance);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}