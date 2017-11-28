package com.eload.pojo;

import java.util.Date;

public class IpLog {
    private Long id;

    private String ip;

    private Byte loginstate;

    private String username;

    private Long logininfoid;

    private Byte logintype;

    private Date logintime;

    public IpLog(Long id, String ip, Byte loginstate, String username, Long logininfoid, Byte logintype, Date logintime) {
        this.id = id;
        this.ip = ip;
        this.loginstate = loginstate;
        this.username = username;
        this.logininfoid = logininfoid;
        this.logintype = logintype;
        this.logintime = logintime;
    }

    public IpLog() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Byte getLoginstate() {
        return loginstate;
    }

    public void setLoginstate(Byte loginstate) {
        this.loginstate = loginstate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Long getLogininfoid() {
        return logininfoid;
    }

    public void setLogininfoid(Long logininfoid) {
        this.logininfoid = logininfoid;
    }

    public Byte getLogintype() {
        return logintype;
    }

    public void setLogintype(Byte logintype) {
        this.logintype = logintype;
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }
}