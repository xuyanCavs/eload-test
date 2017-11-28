package com.eload.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class SystemAccountFlow {
    private Long id;

    private Date createddate;

    private Byte accountactiontype;

    private BigDecimal amount;

    private String note;

    private BigDecimal balance;

    private BigDecimal freezedamount;

    private Long systemaccountId;

    private Long targetuserId;

    public SystemAccountFlow(Long id, Date createddate, Byte accountactiontype, BigDecimal amount, String note, BigDecimal balance, BigDecimal freezedamount, Long systemaccountId, Long targetuserId) {
        this.id = id;
        this.createddate = createddate;
        this.accountactiontype = accountactiontype;
        this.amount = amount;
        this.note = note;
        this.balance = balance;
        this.freezedamount = freezedamount;
        this.systemaccountId = systemaccountId;
        this.targetuserId = targetuserId;
    }

    public SystemAccountFlow() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public Byte getAccountactiontype() {
        return accountactiontype;
    }

    public void setAccountactiontype(Byte accountactiontype) {
        this.accountactiontype = accountactiontype;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getFreezedamount() {
        return freezedamount;
    }

    public void setFreezedamount(BigDecimal freezedamount) {
        this.freezedamount = freezedamount;
    }

    public Long getSystemaccountId() {
        return systemaccountId;
    }

    public void setSystemaccountId(Long systemaccountId) {
        this.systemaccountId = systemaccountId;
    }

    public Long getTargetuserId() {
        return targetuserId;
    }

    public void setTargetuserId(Long targetuserId) {
        this.targetuserId = targetuserId;
    }
}