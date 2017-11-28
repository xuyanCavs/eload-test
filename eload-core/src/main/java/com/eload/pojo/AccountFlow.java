package com.eload.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class AccountFlow {
    private Long id;

    private Byte accountactiontype;

    private BigDecimal amount;

    private String note;

    private BigDecimal balance;

    private BigDecimal freezed;

    private Date actiontime;

    private Long accountId;

    public AccountFlow(Long id, Byte accountactiontype, BigDecimal amount, String note, BigDecimal balance, BigDecimal freezed, Date actiontime, Long accountId) {
        this.id = id;
        this.accountactiontype = accountactiontype;
        this.amount = amount;
        this.note = note;
        this.balance = balance;
        this.freezed = freezed;
        this.actiontime = actiontime;
        this.accountId = accountId;
    }

    public AccountFlow() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public BigDecimal getFreezed() {
        return freezed;
    }

    public void setFreezed(BigDecimal freezed) {
        this.freezed = freezed;
    }

    public Date getActiontime() {
        return actiontime;
    }

    public void setActiontime(Date actiontime) {
        this.actiontime = actiontime;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }
}