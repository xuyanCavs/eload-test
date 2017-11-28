package com.eload.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class RechargeOffline {
    private Long id;

    private Byte state;

    private String remark;

    private Date audittime;

    private Date applytime;

    private Long auditorId;

    private Long applierId;

    private String tradecode;

    private Date tradetime;

    private BigDecimal amount;

    private String note;

    private Long bankinfoId;

    public RechargeOffline(Long id, Byte state, String remark, Date audittime, Date applytime, Long auditorId, Long applierId, String tradecode, Date tradetime, BigDecimal amount, String note, Long bankinfoId) {
        this.id = id;
        this.state = state;
        this.remark = remark;
        this.audittime = audittime;
        this.applytime = applytime;
        this.auditorId = auditorId;
        this.applierId = applierId;
        this.tradecode = tradecode;
        this.tradetime = tradetime;
        this.amount = amount;
        this.note = note;
        this.bankinfoId = bankinfoId;
    }

    public RechargeOffline() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getAudittime() {
        return audittime;
    }

    public void setAudittime(Date audittime) {
        this.audittime = audittime;
    }

    public Date getApplytime() {
        return applytime;
    }

    public void setApplytime(Date applytime) {
        this.applytime = applytime;
    }

    public Long getAuditorId() {
        return auditorId;
    }

    public void setAuditorId(Long auditorId) {
        this.auditorId = auditorId;
    }

    public Long getApplierId() {
        return applierId;
    }

    public void setApplierId(Long applierId) {
        this.applierId = applierId;
    }

    public String getTradecode() {
        return tradecode;
    }

    public void setTradecode(String tradecode) {
        this.tradecode = tradecode == null ? null : tradecode.trim();
    }

    public Date getTradetime() {
        return tradetime;
    }

    public void setTradetime(Date tradetime) {
        this.tradetime = tradetime;
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

    public Long getBankinfoId() {
        return bankinfoId;
    }

    public void setBankinfoId(Long bankinfoId) {
        this.bankinfoId = bankinfoId;
    }
}