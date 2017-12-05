package com.eload.pojo;

public class BankInfo {
    private Integer id;

    private Integer uid;

    private String bankname;

    private String accountname;

    private String banknumber;

    private String bankforkname;

    public BankInfo(Integer id, Integer uid, String bankname, String accountname, String banknumber, String bankforkname) {
        this.id = id;
        this.uid = uid;
        this.bankname = bankname;
        this.accountname = accountname;
        this.banknumber = banknumber;
        this.bankforkname = bankforkname;
    }

    public BankInfo() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname == null ? null : bankname.trim();
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname == null ? null : accountname.trim();
    }

    public String getBanknumber() {
        return banknumber;
    }

    public void setBanknumber(String banknumber) {
        this.banknumber = banknumber == null ? null : banknumber.trim();
    }

    public String getBankforkname() {
        return bankforkname;
    }

    public void setBankforkname(String bankforkname) {
        this.bankforkname = bankforkname == null ? null : bankforkname.trim();
    }
}