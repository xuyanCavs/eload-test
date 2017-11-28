package com.eload.pojo;

public class CompanyBankInfo {
    private Long id;

    private String bankname;

    private String accountname;

    private String banknumber;

    private String bankforkname;

    public CompanyBankInfo(Long id, String bankname, String accountname, String banknumber, String bankforkname) {
        this.id = id;
        this.bankname = bankname;
        this.accountname = accountname;
        this.banknumber = banknumber;
        this.bankforkname = bankforkname;
    }

    public CompanyBankInfo() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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