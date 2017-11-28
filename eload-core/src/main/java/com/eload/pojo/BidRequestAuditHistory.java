package com.eload.pojo;

import java.util.Date;

public class BidRequestAuditHistory {
    private Long id;

    private Byte state;

    private String remark;

    private Date audittime;

    private Date applytime;

    private Long auditorId;

    private Long applierId;

    private Long bidrequestid;

    private Byte audittype;

    public BidRequestAuditHistory(Long id, Byte state, String remark, Date audittime, Date applytime, Long auditorId, Long applierId, Long bidrequestid, Byte audittype) {
        this.id = id;
        this.state = state;
        this.remark = remark;
        this.audittime = audittime;
        this.applytime = applytime;
        this.auditorId = auditorId;
        this.applierId = applierId;
        this.bidrequestid = bidrequestid;
        this.audittype = audittype;
    }

    public BidRequestAuditHistory() {
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

    public Long getBidrequestid() {
        return bidrequestid;
    }

    public void setBidrequestid(Long bidrequestid) {
        this.bidrequestid = bidrequestid;
    }

    public Byte getAudittype() {
        return audittype;
    }

    public void setAudittype(Byte audittype) {
        this.audittype = audittype;
    }
}