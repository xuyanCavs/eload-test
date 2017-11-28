package com.eload.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class BidRequest {
    private Long id;

    private Integer version;

    private Byte bidrequesttype;

    private Byte bidrequeststate;

    private BigDecimal bidrequestamount;

    private BigDecimal currentrate;

    private Byte monthes2return;

    private Integer bidcount;

    private BigDecimal totalrewardamount;

    private BigDecimal currentsum;

    private String title;

    private String description;

    private String note;

    private Date disabledate;

    private Long createuserId;

    private Byte disabledays;

    private BigDecimal minbidamount;

    private Date applytime;

    private Date publishtime;

    public BidRequest(Long id, Integer version, Byte bidrequesttype, Byte bidrequeststate, BigDecimal bidrequestamount, BigDecimal currentrate, Byte monthes2return, Integer bidcount, BigDecimal totalrewardamount, BigDecimal currentsum, String title, String description, String note, Date disabledate, Long createuserId, Byte disabledays, BigDecimal minbidamount, Date applytime, Date publishtime) {
        this.id = id;
        this.version = version;
        this.bidrequesttype = bidrequesttype;
        this.bidrequeststate = bidrequeststate;
        this.bidrequestamount = bidrequestamount;
        this.currentrate = currentrate;
        this.monthes2return = monthes2return;
        this.bidcount = bidcount;
        this.totalrewardamount = totalrewardamount;
        this.currentsum = currentsum;
        this.title = title;
        this.description = description;
        this.note = note;
        this.disabledate = disabledate;
        this.createuserId = createuserId;
        this.disabledays = disabledays;
        this.minbidamount = minbidamount;
        this.applytime = applytime;
        this.publishtime = publishtime;
    }

    public BidRequest() {
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

    public Byte getBidrequesttype() {
        return bidrequesttype;
    }

    public void setBidrequesttype(Byte bidrequesttype) {
        this.bidrequesttype = bidrequesttype;
    }

    public Byte getBidrequeststate() {
        return bidrequeststate;
    }

    public void setBidrequeststate(Byte bidrequeststate) {
        this.bidrequeststate = bidrequeststate;
    }

    public BigDecimal getBidrequestamount() {
        return bidrequestamount;
    }

    public void setBidrequestamount(BigDecimal bidrequestamount) {
        this.bidrequestamount = bidrequestamount;
    }

    public BigDecimal getCurrentrate() {
        return currentrate;
    }

    public void setCurrentrate(BigDecimal currentrate) {
        this.currentrate = currentrate;
    }

    public Byte getMonthes2return() {
        return monthes2return;
    }

    public void setMonthes2return(Byte monthes2return) {
        this.monthes2return = monthes2return;
    }

    public Integer getBidcount() {
        return bidcount;
    }

    public void setBidcount(Integer bidcount) {
        this.bidcount = bidcount;
    }

    public BigDecimal getTotalrewardamount() {
        return totalrewardamount;
    }

    public void setTotalrewardamount(BigDecimal totalrewardamount) {
        this.totalrewardamount = totalrewardamount;
    }

    public BigDecimal getCurrentsum() {
        return currentsum;
    }

    public void setCurrentsum(BigDecimal currentsum) {
        this.currentsum = currentsum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Date getDisabledate() {
        return disabledate;
    }

    public void setDisabledate(Date disabledate) {
        this.disabledate = disabledate;
    }

    public Long getCreateuserId() {
        return createuserId;
    }

    public void setCreateuserId(Long createuserId) {
        this.createuserId = createuserId;
    }

    public Byte getDisabledays() {
        return disabledays;
    }

    public void setDisabledays(Byte disabledays) {
        this.disabledays = disabledays;
    }

    public BigDecimal getMinbidamount() {
        return minbidamount;
    }

    public void setMinbidamount(BigDecimal minbidamount) {
        this.minbidamount = minbidamount;
    }

    public Date getApplytime() {
        return applytime;
    }

    public void setApplytime(Date applytime) {
        this.applytime = applytime;
    }

    public Date getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(Date publishtime) {
        this.publishtime = publishtime;
    }
}