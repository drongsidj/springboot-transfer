package top.igio.springbootBorrow.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 交易信息表
 * @TableName record
 */

public class Record implements Serializable {
    /**
     * 转账记录ID
     */
    private Long recordId;

    /**
     * 借方ID
     */
    private Long borrowId;

    /**
     * 贷方ID
     */
    private Long lendId;

    /**
     * 交易金额
     */
    private BigDecimal transferAmount;

    /**
     * 交易发起时间
     */
    private Date createTime;

    /**
     * 交易开始时间
     */
    private Date begainTime;

    /**
     * 转账类型(1实时转账，2是预约转账)
     */
    private Integer tansfertType;

    /**
     * 是否取消预约(Y、N)
     */
    private String appointmentStatus;

    /**
     * 交易预约时间
     */
    private Date appointmentTime;

    /**
     * 交易是否成功(Y、N)
     */
    private String isSucceed;

    /**
     * 交易记录新增时间
     */
    private Date addTime;

    /**
     * 交易记录最后更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    /**
     * 转账记录ID
     */
    public Long getRecordId() {
        return recordId;
    }

    /**
     * 转账记录ID
     */
    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    /**
     * 借方ID
     */
    public Long getBorrowId() {
        return borrowId;
    }

    /**
     * 借方ID
     */
    public void setBorrowId(Long borrowId) {
        this.borrowId = borrowId;
    }

    /**
     * 贷方ID
     */
    public Long getLendId() {
        return lendId;
    }

    /**
     * 贷方ID
     */
    public void setLendId(Long lendId) {
        this.lendId = lendId;
    }

    /**
     * 交易金额
     */
    public BigDecimal getTransferAmount() {
        return transferAmount;
    }

    /**
     * 交易金额
     */
    public void setTransferAmount(BigDecimal transferAmount) {
        this.transferAmount = transferAmount;
    }

    /**
     * 交易发起时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 交易发起时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 交易开始时间
     */
    public Date getBegainTime() {
        return begainTime;
    }

    /**
     * 交易开始时间
     */
    public void setBegainTime(Date begainTime) {
        this.begainTime = begainTime;
    }

    /**
     * 转账类型(1实时转账，2是预约转账)
     */
    public Integer getTansfertType() {
        return tansfertType;
    }

    /**
     * 转账类型(1实时转账，2是预约转账)
     */
    public void setTansfertType(Integer tansfertType) {
        this.tansfertType = tansfertType;
    }

    /**
     * 是否取消预约(Y、N)
     */
    public String getAppointmentStatus() {
        return appointmentStatus;
    }

    /**
     * 是否取消预约(Y、N)
     */
    public void setAppointmentStatus(String appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
    }

    /**
     * 交易预约时间
     */
    public Date getAppointmentTime() {
        return appointmentTime;
    }

    /**
     * 交易预约时间
     */
    public void setAppointmentTime(Date appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    /**
     * 交易是否成功(Y、N)
     */
    public String getIsSucceed() {
        return isSucceed;
    }

    /**
     * 交易是否成功(Y、N)
     */
    public void setIsSucceed(String isSucceed) {
        this.isSucceed = isSucceed;
    }

    /**
     * 交易记录新增时间
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * 交易记录新增时间
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * 交易记录最后更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 交易记录最后更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
        Record other = (Record) that;
        return (this.getRecordId() == null ? other.getRecordId() == null : this.getRecordId().equals(other.getRecordId()))
            && (this.getBorrowId() == null ? other.getBorrowId() == null : this.getBorrowId().equals(other.getBorrowId()))
            && (this.getLendId() == null ? other.getLendId() == null : this.getLendId().equals(other.getLendId()))
            && (this.getTransferAmount() == null ? other.getTransferAmount() == null : this.getTransferAmount().equals(other.getTransferAmount()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getBegainTime() == null ? other.getBegainTime() == null : this.getBegainTime().equals(other.getBegainTime()))
            && (this.getTansfertType() == null ? other.getTansfertType() == null : this.getTansfertType().equals(other.getTansfertType()))
            && (this.getAppointmentStatus() == null ? other.getAppointmentStatus() == null : this.getAppointmentStatus().equals(other.getAppointmentStatus()))
            && (this.getAppointmentTime() == null ? other.getAppointmentTime() == null : this.getAppointmentTime().equals(other.getAppointmentTime()))
            && (this.getIsSucceed() == null ? other.getIsSucceed() == null : this.getIsSucceed().equals(other.getIsSucceed()))
            && (this.getAddTime() == null ? other.getAddTime() == null : this.getAddTime().equals(other.getAddTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRecordId() == null) ? 0 : getRecordId().hashCode());
        result = prime * result + ((getBorrowId() == null) ? 0 : getBorrowId().hashCode());
        result = prime * result + ((getLendId() == null) ? 0 : getLendId().hashCode());
        result = prime * result + ((getTransferAmount() == null) ? 0 : getTransferAmount().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getBegainTime() == null) ? 0 : getBegainTime().hashCode());
        result = prime * result + ((getTansfertType() == null) ? 0 : getTansfertType().hashCode());
        result = prime * result + ((getAppointmentStatus() == null) ? 0 : getAppointmentStatus().hashCode());
        result = prime * result + ((getAppointmentTime() == null) ? 0 : getAppointmentTime().hashCode());
        result = prime * result + ((getIsSucceed() == null) ? 0 : getIsSucceed().hashCode());
        result = prime * result + ((getAddTime() == null) ? 0 : getAddTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", recordId=").append(recordId);
        sb.append(", borrowId=").append(borrowId);
        sb.append(", lendId=").append(lendId);
        sb.append(", transferAmount=").append(transferAmount);
        sb.append(", createTime=").append(createTime);
        sb.append(", begainTime=").append(begainTime);
        sb.append(", tansfertType=").append(tansfertType);
        sb.append(", appointmentStatus=").append(appointmentStatus);
        sb.append(", appointmentTime=").append(appointmentTime);
        sb.append(", isSucceed=").append(isSucceed);
        sb.append(", addTime=").append(addTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}