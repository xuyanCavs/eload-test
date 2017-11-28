package com.eload.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Bid {
    private Long id;

    private BigDecimal actualrate;

    private BigDecimal availableamount;

    private Long bidrequestId;

    private Long biduserId;

    private Date bidtime;

    private String bidrequesttitle;

    public Bid(Long id, BigDecimal actualrate, BigDecimal availableamount, Long bidrequestId, Long biduserId, Date bidtime, String bidrequesttitle) {
        this.id = id;
        this.actualrate = actualrate;
        this.availableamount = availableamount;
        this.bidrequestId = bidrequestId;
        this.biduserId = biduserId;
        this.bidtime = bidtime;
        this.bidrequesttitle = bidrequesttitle;
    }

    public Bid() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getActualrate() {
        return actualrate;
    }

    public void setActualrate(BigDecimal actualrate) {
        this.actualrate = actualrate;
    }

    public BigDecimal getAvailableamount() {
        return availableamount;
    }

    public void setAvailableamount(BigDecimal availableamount) {
        this.availableamount = availableamount;
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

    public Date getBidtime() {
        return bidtime;
    }

    public void setBidtime(Date bidtime) {
        this.bidtime = bidtime;
    }

    public String getBidrequesttitle() {
        return bidrequesttitle;
    }

    public void setBidrequesttitle(String bidrequesttitle) {
        this.bidrequesttitle = bidrequesttitle == null ? null : bidrequesttitle.trim();
    }
}