package com.eload.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class SystemAccount {
    private Long id;

    private Integer version;

    private Date begindate;

    private Date enddate;

    private Date createdate;

    private BigDecimal totalbalance;

    private BigDecimal freezedamount;

    public SystemAccount(Long id, Integer version, Date begindate, Date enddate, Date createdate, BigDecimal totalbalance, BigDecimal freezedamount) {
        this.id = id;
        this.version = version;
        this.begindate = begindate;
        this.enddate = enddate;
        this.createdate = createdate;
        this.totalbalance = totalbalance;
        this.freezedamount = freezedamount;
    }

    public SystemAccount() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Date getBegindate() {
        return begindate;
    }

    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public BigDecimal getTotalbalance() {
        return totalbalance;
    }

    public void setTotalbalance(BigDecimal totalbalance) {
        this.totalbalance = totalbalance;
    }

    public BigDecimal getFreezedamount() {
        return freezedamount;
    }

    public void setFreezedamount(BigDecimal freezedamount) {
        this.freezedamount = freezedamount;
    }
}