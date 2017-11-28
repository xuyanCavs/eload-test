package com.eload.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class PaymentSchedule {
    private Long id;

    private Date deadline;

    private Date paydate;

    private BigDecimal totalamount;

    private BigDecimal principal;

    private BigDecimal interest;

    private Byte monthindex;

    private Byte state;

    private Byte bidrequesttype;

    private Byte returntype;

    private Long bidrequestId;

    private Long biduserId;

    private String bidrequesttitle;

    public PaymentSchedule(Long id, Date deadline, Date paydate, BigDecimal totalamount, BigDecimal principal, BigDecimal interest, Byte monthindex, Byte state, Byte bidrequesttype, Byte returntype, Long bidrequestId, Long biduserId, String bidrequesttitle) {
        this.id = id;
        this.deadline = deadline;
        this.paydate = paydate;
        this.totalamount = totalamount;
        this.principal = principal;
        this.interest = interest;
        this.monthindex = monthindex;
        this.state = state;
        this.bidrequesttype = bidrequesttype;
        this.returntype = returntype;
        this.bidrequestId = bidrequestId;
        this.biduserId = biduserId;
        this.bidrequesttitle = bidrequesttitle;
    }

    public PaymentSchedule() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Date getPaydate() {
        return paydate;
    }

    public void setPaydate(Date paydate) {
        this.paydate = paydate;
    }

    public BigDecimal getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(BigDecimal totalamount) {
        this.totalamount = totalamount;
    }

    public BigDecimal getPrincipal() {
        return principal;
    }

    public void setPrincipal(BigDecimal principal) {
        this.principal = principal;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public Byte getMonthindex() {
        return monthindex;
    }

    public void setMonthindex(Byte monthindex) {
        this.monthindex = monthindex;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Byte getBidrequesttype() {
        return bidrequesttype;
    }

    public void setBidrequesttype(Byte bidrequesttype) {
        this.bidrequesttype = bidrequesttype;
    }

    public Byte getReturntype() {
        return returntype;
    }

    public void setReturntype(Byte returntype) {
        this.returntype = returntype;
    }

    public Long getBidrequestId() {
        return bidrequestId;
    }

    public void setBidrequestId(Long bidrequestId) {
        this.bidrequestId = bidrequestId;
    }

    public Long getBiduserId() {
        return biduserId;
    }

    public void setBiduserId(Long biduserId) {
        this.biduserId = biduserId;
    }

    public String getBidrequesttitle() {
        return bidrequesttitle;
    }

    public void setBidrequesttitle(String bidrequesttitle) {
        this.bidrequesttitle = bidrequesttitle == null ? null : bidrequesttitle.trim();
    }
}